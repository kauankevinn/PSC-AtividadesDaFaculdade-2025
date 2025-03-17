package Listas.Lista_02;

import java.util.Scanner;

public class Scan {

    //Introdução ao Scanner.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um número:");
        n = sc.nextInt();
        System.out.println("Seu número é: "+n);

        sc.close();
    }
}
