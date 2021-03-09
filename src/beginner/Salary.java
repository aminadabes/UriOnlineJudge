package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberEmployee = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double hourValue = sc.nextDouble();
        double salary = hoursWorked * hourValue;

        System.out.println("NUMBER = " + numberEmployee);
        System.out.printf("SALARY = U$ %.2f%n", salary);


    }
}
