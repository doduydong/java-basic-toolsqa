package Operators;

public class Operators_04_Logical {

    static void main() {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println("Check if both the boolean variables are true : " + (value1 && value2));
        System.out.println("Check if even one of the boolean variable is true : " + (value1 || value2));
        System.out.println("Change the state of the value1 to false : " + (!value1));
        System.out.println("Change the state of the value2 to true : " + (!value2));
    }

}
