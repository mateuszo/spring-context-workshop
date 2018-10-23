package com.codecool;

import org.springframework.stereotype.Component;

@Component
public class PalindromeCheckerIterator implements PalindromeChecker{

    public boolean isPalindrome(String str) {
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1) ){
                return false;
            }
        }
        return true;
    }
}
