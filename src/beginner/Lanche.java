package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    /**
     * beecrowd | 1038
        Lanche
        Adaptado por Neilor Tonin, URI  Brasil

    Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
    quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

    Entrada
    O arquivo de entrada contém dois valores inteiros correspondentes ao código e à 
    quantidade de um item conforme tabela acima.

    Saída
    O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, 
    com 2 casas após o ponto decimal.
     */

     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double preco;

        switch (codigo) {
            case 1:
            preco = 4.00;
                System.out.printf("Total: R$ %.2f%n" , preco * quantidade);
                break;
            case 2:
             preco = 4.50;
             System.out.printf("Total: R$ %.2f%n" , preco * quantidade);
                break;
            case 3:
             preco = 5.00;
             System.out.printf("Total: R$ %.2f%n" , preco * quantidade);
                break;
            case 4:
             preco = 2.00;
             System.out.printf("Total: R$ %.2f%n" , preco * quantidade);
                break; 
            case 5:
             preco = 1.50;
             System.out.printf("Total: R$ %.2f%n" , preco * quantidade);
                break;        
            default:
                break;
        }

     }
}