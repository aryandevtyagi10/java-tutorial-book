public class CustomExceptionDemo {

    // Method that checks age
    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age is less than 18 - Not Eligible to Vote.");
        } else {
            System.out.println("Eligible to Vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // change this to test other values
        } catch (AgeInvalidException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}



