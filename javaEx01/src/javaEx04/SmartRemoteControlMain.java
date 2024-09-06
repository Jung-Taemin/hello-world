package javaEx04;

public class SmartRemoteControlMain {

    public static void main(String[] args) {
        RemoteControl rc = new SmartTV();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();

        Searchable sch = new SmartTV();
        sch.search("www.naver.com");
    }
}
