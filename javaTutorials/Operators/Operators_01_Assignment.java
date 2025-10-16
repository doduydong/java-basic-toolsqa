package Operators;

public class Operators_01_Assignment {
    static String name = "iPhone";
    static int gen = 16;
    static boolean isGood = true;


    static void main() {
        System.out.println("Value stored in the name variable is : " + name);
        System.out.println("Value stored in the gen variable is : " + gen);
        System.out.println("Value stored in the isGood variable is : " + isGood);

        name = "iPhone Pro";
        gen = 17;
        isGood = false;

        System.out.println("Value stored in the name variable is : " + name);
        System.out.println("Value stored in the gen variable is : " + gen);
        System.out.println("Value stored in the isGood variable is : " + isGood);
    }

}
