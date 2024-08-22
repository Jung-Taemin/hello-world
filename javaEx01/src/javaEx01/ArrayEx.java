package javaEx01;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {2, 4, 6, 8, 10};

        // 배열의 길이 출력
        System.out.println("배열의 길이: " + numbers.length);

        // 특정 인덱스의 배열 요소 접근 : 인덱스는 0부터
        System.out.println("배열의 첫 번째 요소: " + numbers[0]);
        System.out.println("배열의 두 번째 요소: " + numbers[1]);
        System.out.println("배열의 마지막 요소: " + numbers[numbers.length - 1]);

        // 배열 요소 수정
        // 첫 번째 요소를 1로 변경
        numbers[0] = 1;
        System.out.println("변경 후 배열의 첫 번째 요소: " + numbers[0]);

        // 배열 요소 순회
        // for
        System.out.print("배열 요소 순회: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // for-each 요소 순회
        System.out.print("for-each 사용 요소 순회: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();

        // 배열의 동적 할당
        String[] names = new String[5];
//        String[] names;
//        names = new String[5];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charli";
        names[3] = "Dave";
        names[4] = "Eve";

        System.out.print("String 배열 요소: ");
        for (String name : names){
            System.out.print(name + " ");
        }
    }
}
