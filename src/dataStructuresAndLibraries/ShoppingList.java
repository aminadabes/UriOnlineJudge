package dataStructuresAndLibraries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) throws IOException {

        ArrayList<String> itens = new ArrayList<>();
        ArrayList<String> itens2 = new ArrayList<>();
        ArrayList<String> itens3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            itens.add(sc.nextLine());
        }

        for(int i=0; i<2; i++){
            itens2.add(sc.nextLine());
        }

        for(int i=0; i<4; i++){
            itens3.add(sc.nextLine());
        }
        System.out.println(itens.stream()
                .distinct()
                .collect(Collectors.joining(" ")));
        System.out.println(itens2.stream()
                .distinct()
                .collect(Collectors.joining(" ")));
        System.out.println(itens3.stream()
                .distinct()
                .collect(Collectors.joining(" ")));
    }
}
