package javaEx06;

public class GBoxMain {

    public static void main(String[] args) {
        GBox<String> box1 = new GBox<String>();
        box1.setT("hello");

        String str = box1.getT(); // 강제 타입 변환 없음
        System.out.println(str);

        GBox<Integer> box2 = new GBox<Integer>();
        box2.setT(10);

        int value = box2.getT();
        System.out.println(value);

        GBox<Apple> box = new GBox<Apple>();
        box.setT(new Apple());  // 데이터 형 체크 => 타입이 다르면 컴파일 에러
        Apple apple = (Apple) box.getT();
        System.out.println(apple);
    }
}
