package javaEx02;

public class CallByValueEx {

    public static void main(String[] args) {
        int originalValue = 5;
        System.out.println("Before method call : " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call : " + originalValue);

    }

    // 기본 타입 변수의 값을 변경하는 메서드
    public static void modifyValue(int value){
        value = 10; // 이 변경은 원본 변수에 영향을 주지 않음
        System.out.println("Inside method : " + value);
    }
}
