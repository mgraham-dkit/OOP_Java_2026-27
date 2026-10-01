package solutions.week02.method_revision.utils;

import java.util.ArrayList;

public class Utilities {
    public static double getAbs(double value){
        if(value < 0){
            value = value * -1;
        }

        return value;
    }

    public static double toFahrenheit(double celsius){
        double converted = (celsius * (9.0/5)) + 32;
        return converted;
    }

    public static boolean containsUpperCase(String text){
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if(Character.isUpperCase(current)){
                return true;
            }
        }
        return false;
    }

    public static boolean validatePassword(String password){
        if(password.length() < 8){
            return false;
        }
        if(!containsUpperCase(password)){
            return false;
        }

        return true;
    }

    public static int countVowels(String text){
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                count++;
            }
        }

        return count;
    }

    public static boolean isAllVowels(String text){
        int numVowels = countVowels(text);

        if(numVowels == text.length()){
            return true;
        }else{
            return false;
        }
    }
}
