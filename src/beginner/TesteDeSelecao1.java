package beginner;

import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int somaCD = C+D;
        int somaAB = A+B;

        if(B > C && D > A && somaCD > somaAB & C > 0 && D > 0 && A % 2 == 0  ){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
