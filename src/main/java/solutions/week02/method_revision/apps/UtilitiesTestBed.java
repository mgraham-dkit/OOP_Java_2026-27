package solutions.week02.method_revision.apps;

import solutions.week02.method_revision.utils.Utilities;

public class UtilitiesTestBed {
    static void main(String[] args) {
        double originalValue = -44;
        double abs = Utilities.getAbs(originalValue);

        System.out.println("The absolute value of " + originalValue + " is " + abs);

        double celsius = 23;
        double converted = Utilities.toFahrenheit(celsius);
        System.out.println(celsius + " degrees celsius converts to " + converted + " in Fahrenheit");

        String text = "My text info";
        boolean containsUppercase = Utilities.containsUpperCase(text);
        if(containsUppercase){
            System.out.println("\"" + text + "\" contains uppercase characters!");
        }else{
            System.out.println("\"" + text + "\" does not contain any uppercase characters.");
        }
    }
}
