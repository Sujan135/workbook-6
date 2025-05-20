package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithInterfaces {
    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFamily);

        for (Person p : myFamily) {
            System.out.println(p);
        }
    }

}

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }

    @Override
    public int compareTo(Person other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (!this.lastName.equals(other.lastName)) {
            return lastNameCompare;
        }

        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (!this.firstName.equals(other.firstName)){
            return firstNameCompare;
        }

        return Integer.compare(this.age, other.age);
    }
}
