package com.codecool;


import org.springframework.stereotype.Component;

@Component
public class PalindromeCheckerReverse implements PalindromeChecker {

    public boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
