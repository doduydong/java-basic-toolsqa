package Arrays;

public class Pass_Array_To_Method {

    static void main(String[] args) {
        String[] carMakes = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "TESLA", "VINFAST"};

        printArray(carMakes);
    }

    static void printArray(String[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Printing all the values of an Array: " + array[i]);
        }
    }

}
