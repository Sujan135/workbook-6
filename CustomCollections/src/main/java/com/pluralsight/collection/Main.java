package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);
        System.out.println("Number of Items:" + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(3);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15);

        System.out.println("Number of item in date: " + dates.getItems().size());

    }
}
