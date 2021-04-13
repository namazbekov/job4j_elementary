package ru.job4j.calculator;

public class Calculator {

    public static void hello(String name) {
        int age = 33;
        System.out.println("Hello, " + name + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev ";
        Calculator.hello(name);

    }

}