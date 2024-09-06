package javaEx05_baekjoon2675;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int R = sc.nextInt(); // 각 문자 반복할 횟수
            String S = sc.next(); // 입력 문자열

            // 문자열 S의 각 문자를 R번 반복해서 새 문자열을 만듦
            for(char ch : S.toCharArray()){
                for(int j = 0; j < R; j++){
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
