package DecisionMaking;

public class If_Statements {

    static void main() {
        int score = 97;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        int age = 28;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You must get a driving license first.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
    }

}
