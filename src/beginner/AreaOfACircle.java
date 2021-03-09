package beginner;

import java.util.Locale;
import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double n = 3.14159;
        double A = n * (R*R);
        System.out.printf("A=%.4f%n",A);
    }
}
