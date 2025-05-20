package com.pluralsight.finance;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sujan", "123", 10000);
        Valuable account2 = new BankAccount("Max", "456", 2000);

        account1.deposit(100);
//        account2.deposit(100);

//        account 2 is Valuable, which doesnot dedine deposit();
//        it only getValue since it is Valuable

        System.out.println("Account 1 balance: $" + account1.getValue());
        System.out.println("Account 2 value: $" + account2.getValue());

    }
}
