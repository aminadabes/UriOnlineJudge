package beginner;

import java.util.Locale;
import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int speed = sc.nextInt();
        double consumo = 12;
        double result = (time*speed)/consumo;

        System.out.printf("%.3f%n", result);

       /* 10 70.833  2  15.333  22  122.833
          85        92          67*/











    }
}
