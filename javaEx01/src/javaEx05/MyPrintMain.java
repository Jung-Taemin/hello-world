package javaEx05;

public class MyPrintMain {

    public static void main(String[] args) {
//        // Runnable 객체 구현
//        Runnable my = new MyRunnable();
//
//        // 작업 스레드 생성
//        Thread thread = new Thread(my);
//
//        // start() 메서드를 호출해야만 실행
//        thread.start();

        // 람다식 사용
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("Runnable is running - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        // start() 메서드를 호출해야만 실행
        thread.start();
    }
}
