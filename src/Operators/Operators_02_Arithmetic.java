package Operators;

public class Operators_02_Arithmetic {

    static void main(String[] args) {
        int a, b = 13, c = 10;

        a = b + c;
        System.out.println("Value of a after '+' Arithmetic operation is: " + a);

        a = b - c;
        System.out.println("Value of a after '-' Arithmetic operation is: " + a);

        a = b * c;
        System.out.println("Value of a after '*' Arithmetic operation is: " + a);

        a = b / c;
        System.out.println("Value of a after '/' Arithmetic operation is: " + a);

        a = b % c;
        System.out.println("Value of a after '%' Arithmetic operation is: " + a);

        String jdk = "Java";
        int version = 25;
        System.out.println("JDK version: " + jdk + " " + version);
    }

}
