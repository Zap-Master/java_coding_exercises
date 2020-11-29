package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String result = "";
        result = (firstName.substring(0,1)).toUpperCase() + '.' + (lastName.substring(0,1)).toUpperCase();
        return result;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double result = originalPrice + originalPrice*vatRate/100;
        String strValue = String.format("%.2f", result);
        return  Double.parseDouble(strValue);
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
