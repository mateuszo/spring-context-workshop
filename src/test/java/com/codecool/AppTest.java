package com.codecool;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void shouldTakeUserInput() {

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
        String expected = "akka is a palindrome.";
        assertTrue(myOut.toString().contains(expected));
    }
}
