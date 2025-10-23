package Operators;

public class Operators_05_Conditional {
    // Ternary operator

    static void main(String[] args) {
        int a = 13, b = 10;
        boolean value = (a > b) ? true : false;
        System.out.println("The boolean value is: " + value);

        int age = 28;
        String isValid = (age >= 18) ? "Valid" : "Invalid";
        System.out.println("Is valid: " + isValid);
    }

}
