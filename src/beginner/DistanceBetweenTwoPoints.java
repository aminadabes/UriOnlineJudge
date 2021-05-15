package beginner;

import java.util.Locale;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double p1 = (x2-x1) * (x2-x1);
        double p2 = (y2-y1) * (y2-y1);
        double distanc = Math.sqrt(p1+p2);
        System.out.printf("%.4f%n",distanc);


    }
}
