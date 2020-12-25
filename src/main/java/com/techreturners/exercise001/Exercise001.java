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
        String strValue = String.format("%.2f", result);
        return  Double.parseDouble(strValue);
    }

    public String reverse(String sentence) {
        StringBuilder str1 = new StringBuilder();
        str1.append(sentence);
        str1 = str1.reverse();
        return str1.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int counterLinuxUsers = 0;
        for (User user : users) {
            //System.out.println(user.getUsername());
            if (user.getType() == "Linux") {
                counterLinuxUsers ++;
            }
        }               
        return counterLinuxUsers;
    }
}
