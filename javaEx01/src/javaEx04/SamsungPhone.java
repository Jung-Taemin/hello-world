package javaEx04;

public class SamsungPhone implements ISmartPhone{
    private String name;

    //생성자에서 초기화
    public SamsungPhone(){
        name = "삼성폰";
    }
    @Override
    public void sendCall(){
        System.out.println(name + "으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall(){
        System.out.println(name + "으로 전화를 받습니다.");
    }

    @Override
    public void sendSMS(){

    }

    @Override
    public void receiveSMS(){

    }

}
