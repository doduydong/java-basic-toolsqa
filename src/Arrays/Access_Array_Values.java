package Arrays;

public class Access_Array_Values {

    static void main(String[] args) {
        String[] carMakes = new String[7];

        carMakes[0] = "BMW";
        carMakes[1] = "AUDI";
        carMakes[2] = "TOYOTA";
        carMakes[3] = "SUZUKI";
        carMakes[4] = "HONDA";
        carMakes[5] = "TESLA";
        carMakes[6] = "VINFAST";

        int ilength = carMakes.length;
        System.out.println("Length of the Array is: " + ilength);

        String firstValue = carMakes[0];
        System.out.println("First value of the Array is: " + firstValue);

        String lastValue = carMakes[ilength - 1];
        System.out.println("Last value of the Array is: " + lastValue);

        for (int i = 0; i <= ilength - 1; i++) {
            System.out.println("The value stored at the position " + i + " in Array is: " + carMakes[i]);
        }
    }

}
