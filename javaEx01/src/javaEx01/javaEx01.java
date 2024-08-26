package javaEx01;

import java.util.Scanner;

public class javaEx01 {
    public static void main(String[] args) {
        // 콘솔 출력
        System.out.println("Hello, Java!");			// 줄바꿈 ㅇ
        System.out.print("Enter your name: ");		// 줄바꿈 x


        // 콘솔 입력
        Scanner sc = new Scanner(System.in);
         /*
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");
        */

        // 변수 : 데이터 저장하는 메모리 공간. 선언과 초기화
        // 데이터 타입
        // 정수형
        int age = 25;
        long population = 8900000000L;

        // 실수형
        float weight = 70.5f;
        double height = 169.4;

        // 문자형
        char ch = '3';

        // 논리형
        boolean isStudent = true; // true/false

        // 출력
        System.out.println("Age: " + age);

        // 명시적 형 변환(타입 캐스팅): 큰 타입에서 작은 타입으로 수동 변환
        double pi = 3.14;
        int truncatedPi = (int) pi;

        System.out.println("pi: " + pi + ", truncatedPi: " + truncatedPi);

        // 연산자
        // 산술연산자 : +, -, *, /, %
        // 비교연산자 : ==, !=, <, >, <=, >=
        // 논리연산자 : &&, ||, !

        // 수를 입력 받아 홀수인지 짝수인지 판별하는 프로그램
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println(num + " is an even number.");
        } else{
            System.out.println(num + " is an odd number.");
        }

        if (num < 10)
            System.out.println(num + "은 한 자리 숫자입니다.");
        else if (num < 100)
            System.out.println(num + "은 두 자리 숫자입니다.");
        else if (num < 1000)
            System.out.println(num + "은 세 자리 숫자입니다.");

        // switch
        switch(num){ // switch문의 변수는 프리미티브 타입
            case 1:
                System.out.println("일");
                break;
            case 2:
                System.out.println("이");
                break;
            default:
                System.out.println("아무것도 아님");
                break;
        }// end of switch

        // 반복문
        // for : 고정된 횟수만큼.
        // while : 조건식이 참인동안 반복
        // do-while : 코드 블록을 먼저 실행하고, 조건이 참이면 반복실행

        // 내일 (2024-08-22)
        /*
        - 반복문
        - 배열과 반복문
        - java.util.Arrays 클래스
        */

    }// end of main()
}
