package MultiThreading;

public class SleepDemo extends Thread
{
        @Override
        public void run()
        {
            try
            {
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException interruptedException)
            {
            }
        }
}
class Sleep
{
    public static void main(String[] args)
    {

        SleepDemo t1 = new SleepDemo();
        SleepDemo t2 = new SleepDemo();
        SleepDemo t3 = new SleepDemo();

        t1.setName("Appa");
        t2.setName("Ayush");
        t3.setName("Ashish");

        t1.start();
        t2.start();
        t3.start();


    }

}
