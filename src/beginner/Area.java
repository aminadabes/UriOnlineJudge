package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double PI = 3.14159;

        double rectangledTriangle = (A * C) / 2;
        double circle = PI * Math.pow(C, 2);
        double trapezium =  ((A + B) * C) / 2;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n" , rectangledTriangle);
        System.out.printf("CIRCULO: %.3f%n" , circle);
        System.out.printf("TRAPEZIO: %.3f%n" , trapezium);
        System.out.printf("QUADRADO: %.3f%n" , square);
        System.out.printf("RETANGULO: %.3f%n" , rectangle);
    }
}
