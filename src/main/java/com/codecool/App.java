package com.codecool;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //TODO: collect input and check whether given string is a palindrome
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/beans.xml");
        BeanFactory factory = context;

        PalindromeService palindromeService = (PalindromeService) factory.getBean("palindromeServiceImpl");

        String result = palindromeService.getResult(input);

        View view = new ViewFactory().getView(args[0]);
        view.printResult(result);

    }
}
