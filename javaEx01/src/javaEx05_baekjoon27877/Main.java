package javaEx05_baekjoon27877;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에 단어 S를 입력
        String S = sc.nextLine();

        // 둘째 줄에 정수 i를 입력
        int i = sc.nextInt();

        // S의 i번째 글자 출력(인덱스는 0부터 시작)
        System.out.println(S.charAt(i-1));

        sc.close();
    }
}
