package strings;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int teste = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < teste; i++){
            texto = sc.nextLine();
            define(texto);
        }
    }

    public static void define(String texto){
        aumentar(texto.toCharArray());

    }
    public static void aumentar(char c[]){
        int posicao = 0;
        char d[];
        d = c;
        for(int i = 0; i < c.length; i++){
            posicao = c[i] + 3;
            if(c[i] >= 65 && c[i] <= 122){
                c[i] = (char) posicao;
            }
        }
        inverter(c);
    }
    public static void inverter(char c[]){
        String d = "";
        for(int i = c.length - 1; i >=0; i--){
            d += c[i];
        }
        voltarMedate(d.toCharArray());
    }
    public static void voltarMedate(char c[]){
        int posicao = 0;
        for(int i = 0; i < c.length; i++){
            posicao = c[i] - 1;
            if(i > c.length / 2 - 1){
                c[i] = (char) posicao;
            }
        }
        mostrar(c);
    }
    public static void mostrar(char c[]){
        System.out.println(c);
    }
}
