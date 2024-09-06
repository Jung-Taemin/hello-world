package javaEx04;

public class PhoneMain {

    public static void main(String[] args) {
        // 인터페이스 변수 = new 구현클래스명();
        ISmartPhone isp = new SamsungPhone();
        isp.sendCall();

        ISmartPhone isp2 = new IPhone();
        isp2.sendCall();
    }
}
