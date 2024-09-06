package javaEx03;

public class AnimalMain {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();
        a.sound();

        Cat c = new Cat();
        c.show();
        c.sound();

        Dog d = new Dog();
        d.show();
        d.sound();

        // 다형성 표현 : 부모 클래스 타입에 여러 자식 객체 대입
        // 하나의 타입에 여러 객체를 대입함으로써 다양한 기능 이용
        // 자식 타입이 부모 타입으로 자동 타입변환 발생
        Animal ap = null;
        ap = new Cat();
        ap.show();
        ap.sound();

        ap = new Dog();
        ap.show();
        ap.sound();

        System.out.println("-----------------------");

        // 다시 자식 타입으로 변환하고자 할 때 : 강제 타입 변환
        // 현재 ap는 Animal 타입 : Animal 클래스의 메서드만 사용 가능
        // 오버라이딩 된 메서드는 예외
        ap.animalMethod();  // dogMethod()는 사용 불가

        // dogMethod()를 사용하고 싶으면
        // 다시 Dog 타입으로 강제 타입 변환
        d = (Dog)ap;
        d.dogMethod();
    }
}
