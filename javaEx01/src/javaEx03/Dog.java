package javaEx03;

public class Dog extends Animal{
    @Override
    public void show() {
        System.out.println("강아지");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    //오버라이딩 하지 않음
    public void dogMethod(){
        System.out.println("dogMethod()입니다.");
    }
}
