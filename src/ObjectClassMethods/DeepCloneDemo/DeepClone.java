package ObjectClassMethods.DeepCloneDemo;

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Residence rd = new Residence("Masur", 415106);
        Person p1 = new Person("ayush", 101, rd);
        Person p2 = (Person) p1.clone();
        System.out.println("P1 address : " + p1);
        System.out.println("S1 address : " + p2);
        p2.rd.pin = 601;
        p2.rd.city = "Berlin";
        p1.id = 201;
        p1.name = "Abhishek";
        System.out.println("\nS1 address : " + p1);
        System.out.println("S2 address: " + p2);
        System.out.println("S2 address: " + p1.rd.hashCode());
        System.out.println("S2 address: " + p2.rd.hashCode());
    }
}
