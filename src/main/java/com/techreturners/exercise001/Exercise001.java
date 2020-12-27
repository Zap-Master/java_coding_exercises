package com.techreturners.exercise001;

import java.util.List;


public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = "";
        initials = (firstName.substring(0,1)).toUpperCase() + '.' + (lastName.substring(0,1)).toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = originalPrice + originalPrice*vatRate/100;
        String totalValue = String.format("%.2f", result);
        return  Double.parseDouble(totalValue);
    }

    public String reverse(String sentence) {
        StringBuilder reversedStr = new StringBuilder();
        reversedStr.append(sentence);
        reversedStr = reversedStr.reverse();
        return reversedStr.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int counterLinuxUsers = 0;
        for (User user : users) {
            if (user.getType().equalsIgnoreCase("linux")) {
                counterLinuxUsers ++;
            }
        }               
        return counterLinuxUsers;
    }
}
