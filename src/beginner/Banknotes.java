package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int auxDivisao=0;
        int auxSubtracao=0;

        System.out.println(valor);

        auxDivisao = valor/100;
        System.out.println(auxDivisao+ " nota(s) de R$ 100,00");

        auxSubtracao = valor - (auxDivisao*100);

        auxDivisao =  auxSubtracao/50;
        System.out.println(auxDivisao+ " nota(s) de R$ 50,00");
        auxSubtracao = auxSubtracao - (auxDivisao*50);

        auxDivisao =  auxSubtracao/20;
        System.out.println(auxDivisao+ " nota(s) de R$ 20,00");
        auxSubtracao = auxSubtracao - (auxDivisao*20);

        auxDivisao =  auxSubtracao/10;
        System.out.println(auxDivisao+ " nota(s) de R$ 10,00");
        auxSubtracao = auxSubtracao - (auxDivisao*10);

        auxDivisao =  auxSubtracao/5;
        System.out.println(auxDivisao+ " nota(s) de R$ 5,00");
        auxSubtracao = auxSubtracao - (auxDivisao*5);

        auxDivisao =  auxSubtracao/2;
        System.out.println(auxDivisao+ " nota(s) de R$ 2,00");
        auxSubtracao = auxSubtracao - (auxDivisao*2);

        auxDivisao =  auxSubtracao/1;
        System.out.println(auxDivisao+ " nota(s) de R$ 1,00");
        auxSubtracao = auxSubtracao - (auxDivisao*1);
    }
}
