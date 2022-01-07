package CollectionDemoPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;

public class SortingHashset {
    public static void main(String[] args) {
        HashSet<Employee> hs = new HashSet<>();
        Employee emp0 = new Employee(11 , "Ayush");
        Employee emp1 = new Employee(17 , "Dhindora");
        Employee emp2 = new Employee(13 , "MoneyHeist");
        Employee emp3 = new Employee(12 , "SquidGames");
        hs.add(emp0);
        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);

        hs.forEach(System.out :: println);

        hs.forEach(System.out :: println);




    }
}
