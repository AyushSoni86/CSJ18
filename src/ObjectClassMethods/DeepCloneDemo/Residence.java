package ObjectClassMethods.DeepCloneDemo;

public class Residence implements Cloneable {
    String city;
    int pin;
    Residence(String city, int pin) {
        this.city = city;
        this.pin = pin;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Residence{" +
                "city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}
