package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Johnson", 25));
        people.add(new Person("Bob", "Smith", 32));
        people.add(new Person("Charlie", "Brown", 28));
        people.add(new Person("David", "Wilson", 21));
        people.add(new Person("Eva", "Garcia", 30));
        people.add(new Person("Frank", "Lee", 27));
        people.add(new Person("Grace", "Kim", 22));
        people.add(new Person("Hannah", "Nguyen", 26));
        people.add(new Person("Ian", "Wright", 33));
        people.add(new Person("Jane", "Miller", 29));

        System.out.println("Enter a name to search (first or last): ");
        String name = scanner.nextLine().toLowerCase();

        List<Person> searchName = new ArrayList<>();

        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(name) ||
            p.getLastName().equalsIgnoreCase(name)) {
                searchName.add(p);
            }
        }

        System.out.println("Matching name:");
        for (Person p : searchName) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        int totalAge = 0;
        int oldestAge = Integer.MIN_VALUE;
        int youngestAge = Integer.MAX_VALUE;

        for (Person p : people){
            int age = p.getAge();
            totalAge += age;
            if (age > oldestAge) {
                oldestAge = age;
            }
            if (age < youngestAge) {
                youngestAge = age;
            }
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("\nAverage age: " + averageAge);
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);


    }
}
