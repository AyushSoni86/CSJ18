package Synchroniation;

class Bus implements Runnable{
    int availableTIcket = 3 ;
    int Passenger ;

    public Bus(int passenger) {
        this.Passenger = passenger;
    }

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if (availableTIcket >= Passenger){
            System.out.println(name + " Reserved Seat ");
            availableTIcket=availableTIcket-Passenger;
        }
        else{
            System.out.println("Seat not available ");
        }
    }
}
class Customer{
    public static void main(String[] args) {

    Bus bus = new Bus(1);

    Thread t1 = new Thread(bus, "Ayush");
    Thread t2 = new Thread(bus,"Chirag Jhand");
    Thread t3 = new Thread(bus, "Ashish");
    Thread t4 = new Thread(bus, "Appa");

//    t1.setName("Ayush");
//    t2.setName("Appa");
//    t3.setName("Ashish");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }

}
