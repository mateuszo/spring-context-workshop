package com.codecool;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testIsPalindrome() {

        //Arrange
        String input = "akka";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        //Act
        App app = new App();
        app.main(new String[0]);

        //Assert
        String expected = input + " is a palindrome.";
        assertTrue(myOut.toString().contains(expected));
    }

    @Test
    public void testIsNotPalindrome() {

        //Arrange
        String input = "notpalindrome";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        //Act
        App app = new App();
        app.main(new String[0]);

        //Assert
        String expected = input + " is not a palindrome.";
        assertTrue(myOut.toString().contains(expected));
    }
}
