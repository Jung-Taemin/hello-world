package com.spring.mvcproject.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {
    private final QuizSession quizSession;
    private final QuizQuestion[] questions = {
            new QuizQuestion(1, "한국의 수도", "서울"),
            new QuizQuestion(2, "일본의 수도", "도쿄"),
            new QuizQuestion(3, "중국의 수도", "베이징")
    };

    @Autowired
    public QuizController(QuizSession quizSession) {
        this.quizSession = quizSession;
    }

    @GetMapping("/quiz")
    public String startQuiz(Model model){
        quizSession.reset();
        model.addAttribute("quizSession", questions[quizSession.getNumber()]);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String submitAnswer(@RequestParam String answer, Model model){
        QuizQuestion currentQuestion = questions[quizSession.getNumber()];

        if (currentQuestion.getQuestionAnswer().equalsIgnoreCase(answer)){
            quizSession.incrementScore();
        }

        quizSession.setNumber(quizSession.getNumber() + 1);

        if (quizSession.getNumber() < questions.length){
            model.addAttribute("question", questions[quizSession.getNumber()]);
            return "quiz";
        } else {
            return "redirect:/quiz-result";
        }
    }

    @GetMapping("/quiz-result")
    public String quizResult(Model model){
        model.addAttribute("score", quizSession.getScore());
        model.addAttribute("total", questions.length);
        return "quiz-result";
    }

    @GetMapping("/restart")
    public String restartQuiz(){
        quizSession.reset();
        return "redirect:/quiz";
    }
}
