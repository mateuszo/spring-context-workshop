package com.codecool;

import org.springframework.stereotype.Component;

@Component
public interface PalindromeService {

    String getResult(String input);
}
