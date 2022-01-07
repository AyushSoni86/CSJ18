package CollectionDemoPrograms;

import java.util.Objects;

public class                                                                                                                       Employee implements Comparable<Employee>{
    int id ;
    String name ;

    public Employee(int id , String name){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
