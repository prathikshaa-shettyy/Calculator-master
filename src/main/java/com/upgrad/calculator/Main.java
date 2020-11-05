package com.upgrad.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.upgrad.calculator");
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operation (add, sub): ");
        String op = scanner.next();
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.println("Result: " + calculator.compute(op, x, y));
    }
}
