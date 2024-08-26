package javaEx02;

public class CallByReferenceEx {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        System.out.println("Before method call : " + originalArray[0]);
        modifyArray(originalArray);
        System.out.println("After method call : " + originalArray[0]);
    }

    // 배열 내용을 변경하는 메서드
    public static void modifyArray(int[] array){
        array[0] = 9;
        System.out.println("Inside method : " + array[0]);
    }

}
