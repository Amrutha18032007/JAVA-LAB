package bill;

import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input old and current meter readings
        System.out.print("Enter old reading: ");
        int oldReading = scanner.nextInt();

        System.out.print("Enter current reading: ");
        int currentReading = scanner.nextInt();

        // Calculate units consumed
        int units = currentReading - oldReading;

        if (units < 0) {
            System.out.println("Invalid input: Current reading cannot be less than old reading.");
        } else {
            int charge = 0;

            if (units <= 50) {
                charge = units * 1;
            } else if (units <= 100) {
                charge = 50 * 1 + (units - 50) * 2;
            } else if (units <= 200) {
                charge = 50 * 1 + 50 * 2 + (units - 100) * 3;
            } else if (units <= 400) {
                charge = 50 * 1 + 50 * 2 + 100 * 3 + (units - 200) * 4;
            } else {
                charge = 50 * 1 + 50 * 2 + 100 * 3 + 200 * 4 + (units - 400) * 5;
            }

            System.out.println("Units consumed: " + units);
            System.out.println("Electricity bill amount: Rs " + charge);
        }

        scanner.close();
    }
}
