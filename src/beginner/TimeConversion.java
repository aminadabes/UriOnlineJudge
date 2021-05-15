package beginner;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int h, m, s;
        h = N / 3600;
        N = N % 3600;
        m = N / 60;
        N = N % 60;
        s= N / 1;
        System.out.printf("%d:%d:%d\n", h,m,s);

    }

}
