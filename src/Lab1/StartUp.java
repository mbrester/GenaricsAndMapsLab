/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.*;

/**
 *
 * @author mbrester1
 */
public class StartUp {

    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "Tom", "111-11-1111");
        Employee e2 = new Employee("Winze", "Bob", "555-55-555");
        Employee e3 = new Employee("Grent", "Sam", "111-11-1111");
        Employee e4 = new Employee("Brester", "Mitchell", "444-44-4444");

        Map<String, Employee> e = new HashMap<>();

        e.put(e1.getSsn(), e1);
        e.put(e2.getSsn(), e2);
        e.put(e3.getSsn(), e3);
        e.put(e4.getSsn(), e4);

        List<String> keys = new ArrayList<>(e.keySet());

        for (String key : keys) {
            System.out.println(e.get(key));

        }
        Map<String, Employee> treeE = new TreeMap<>(e);

        List<String> keys2 = new ArrayList<>(treeE.keySet());

        for (String key : keys2) {
            System.out.println(e.get(key));

        }

        Set<Employee> s = new TreeSet<>();
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        for (Employee j : s) {
            System.out.println(j);
        }

    }
}
