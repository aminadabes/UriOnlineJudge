package beginner;

import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double saleTotal = sc.nextDouble();
        double salaryTotal = fixedSalary + saleTotal * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", salaryTotal);

    }
}
