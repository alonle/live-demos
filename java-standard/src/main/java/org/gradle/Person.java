package org.gradle;

//import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
//        new GrowthList();
        Boolean bar = new Boolean("true");
        try {
            Integer.parseInt("123");
        } catch (NumberFormatException e) {
            
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("My name is " + new Person("Gradleware").getName());
    }
}
