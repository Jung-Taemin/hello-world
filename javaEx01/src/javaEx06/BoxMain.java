package javaEx06;

// 클래스 설계시에는 어떤 테이터 타입을 사용할지 결정하지 않고
// 사용시에 데이터 타입을 정해서 사용하도록 할 때
public class BoxMain {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동"); // String -> Object(자동 타입 변환)

        String name = (String) box.getObject();
        System.out.println(name);

        box.setObject(new Apple()); // Apple 객체 -> Object(자동 타입 변환)
        Apple apple = (Apple) box.getObject(); // Object -> Apple(강제 타입변환 필요)
        System.out.println(apple);
    }
}
