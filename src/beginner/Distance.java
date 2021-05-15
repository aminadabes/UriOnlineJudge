package beginner;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int distanceOtherCar = distance * 2;
        System.out.println(distanceOtherCar + " minutos");
    }
}
