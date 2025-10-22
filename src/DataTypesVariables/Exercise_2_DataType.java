package DataTypesVariables;

public class Exercise_2_DataType {

    static void main(String[] args) {
        // Boolean
        boolean testResult;

        testResult = true;
        System.out.println("Test result is: " + testResult);

        testResult = false;
        System.out.println("Test result is: " + testResult);

        // Integer
        int carSpeed;

        carSpeed = 60;
        System.out.println("Car is running at the speed of: " + carSpeed);

        carSpeed = carSpeed + 10;
        System.out.println("Car is running at the speed of: " + carSpeed);

        // Character
        char jChar;

        jChar = 'J';
        System.out.println("The value of char is: " + jChar);

        // Decimal
        double pi;

        pi = 3.14159265359;
        System.out.println("PI: " + pi);

        // Multiple initialization
        int a = 10, b = 20, c = 30;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);
    }

}
