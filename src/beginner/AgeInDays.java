package beginner;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personsAge = sc.nextInt();
        int year, month, day;

        year = personsAge / 365;
        personsAge = personsAge % 365;
        month = personsAge / 30;
        personsAge = personsAge % 30;
        day = personsAge;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", year, month, day);
    }
}
