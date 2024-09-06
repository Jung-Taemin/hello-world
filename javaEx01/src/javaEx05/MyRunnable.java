package javaEx05;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        // 쓰레드가 실행할 작업 정의
        for(int i = 1; i <= 5; i++){
            System.out.println("Runnable is running - Count : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
