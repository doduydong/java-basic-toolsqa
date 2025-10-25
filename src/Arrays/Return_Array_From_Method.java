package Arrays;

public class Return_Array_From_Method {

    static void main(String[] args) {
        String[] carMakes = returnArray();

        for (int i = 0; i <= carMakes.length - 1; i++) {
            System.out.println("Printing all the values of an Array: " + carMakes[i]);
        }
    }

    static String[] returnArray() {
        return new String[]{"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA", "TESLA", "VINFAST"};
    }

}
