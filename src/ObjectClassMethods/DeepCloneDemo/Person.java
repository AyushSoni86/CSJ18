package ObjectClassMethods.DeepCloneDemo;

public class Person implements Cloneable{
    String name;
    int id;
    Residence rd ;
    Person(String name, int id, Residence rd) {
        this.name = name;
        this.id = id;
        this.rd = rd ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Person person = (Person) super.clone();
        Residence residence = (Residence) this.rd.clone();
        person.rd = residence;
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + '\'' +
                ", id = " + id +
                ", rd = " + rd +
                "}";
    }
}
