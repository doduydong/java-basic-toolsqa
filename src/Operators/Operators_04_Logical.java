package Operators;

public class Operators_04_Logical {

    static void main(String[] args) {
        boolean var1 = true, var2 = false;

        System.out.println("Check if both the boolean variables are true: " + (var1 && var2));
        System.out.println("Check if even one of the boolean variable is true: " + (var1 || var2));
        System.out.println("Change the state of the var1 to false: " + (!var1));
        System.out.println("Change the state of the var2 to false: " + (!var2));
    }

}
