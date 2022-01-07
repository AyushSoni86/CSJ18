package MultiThreading;



class SleepDemoM implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(2000);
                Thread.yield();
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
            System.out.println(" Jhand ");
        }
    }
}

class SleepMethod extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
            System.out.println("Ashish/Ayush/Appa");

        }
    }

}

public class SleepDemo_02 {
    public static void main(String[] args) throws InterruptedException {

        SleepMethod sleepMethod = new SleepMethod();
        sleepMethod.start();

        SleepDemoM sleepDemoM = new SleepDemoM();

        Thread thread = new Thread(sleepDemoM,"MAIN ");
        thread.setName("Huzefa ");
        thread.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println(" " + Thread.currentThread().getName());
        }

    }
}