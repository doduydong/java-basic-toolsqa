package Operators;

public class Operators_02_Arithmetic {

    static void main() {
        int a, b = 13, c = 10;

        a = b + c;
        System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);

        a = b - c;
        System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);

        a = b * c;
        System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);

        a = b / c;
        System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);

        a = b % c;
        System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);

        b++;
        System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);

        c--;
        System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
    }

}
