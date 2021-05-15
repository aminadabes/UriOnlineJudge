package beginner;

import java.util.Locale;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int aux = (int) valor;
        int moedas = (int) (valor*100)%100;

        System.out.println("NOTAS:");
        System.out.println( (aux / 100) + " nota(s) de R$ 100.00");
        aux = aux % 100;
        System.out.println( (aux / 50) + " nota(s) de R$ 50.00");
        aux = aux % 50;
        System.out.println( (aux / 20) + " nota(s) de R$ 20.00");
        aux = aux % 20;
        System.out.println( (aux / 10) + " nota(s) de R$ 10.00");
        aux = aux % 10;
        System.out.println( (aux / 5) + " nota(s) de R$ 5.00");
        aux = aux % 5;
        System.out.println( (aux / 2) + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        aux = aux % 2;
        System.out.println( aux + " moeda(s) de R$ 1.00");
        System.out.println( (moedas/50) + " moeda(s) de R$ 0.50");
        moedas %= 50;
        System.out.println( (moedas/25) + " moeda(s) de R$ 0.25");
        moedas %= 25;
        System.out.println( (moedas/10) + " moeda(s) de R$ 0.10");
        moedas %= 10;
        System.out.println( (moedas/5) + " moeda(s) de R$ 0.05");
        moedas %= 5;
        System.out.println( moedas + " moeda(s) de R$ 0.01");
    }

}