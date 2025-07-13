// Custom Exception Class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class AccountBalanceChecker {
    // Store account information
    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
    private static String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
    private static double bal[] = {10000.00, 12000.00, 5600.8, 999.00, 1100.55};

    public static void main(String[] args) {
        System.out.println("ACCNO\tCUSTOMER\tBALANCE");
        boolean hasLowBalance = false;

        for (int i = 0; i < accno.length; i++) {
            System.out.println(accno[i] + "\t" + name[i] + "\t\t" + bal[i]);

            // Check for balance below 1000 and print warning
            if (bal[i] < 1000) {
                hasLowBalance = true;
                try {
                    throw new MyException("⚠️ Balance is less than 1000 for account " + accno[i] + " (" + name[i] + ")");
                } catch (MyException e) {
                    System.out.println("Warning: " + e.getMessage());
                }
            }
        }

        if (!hasLowBalance) {
            System.out.println("\n✅ All accounts have sufficient balance.");
        }
    }
}