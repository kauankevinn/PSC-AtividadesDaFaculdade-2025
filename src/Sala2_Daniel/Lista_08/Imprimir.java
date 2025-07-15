package Sala2_Daniel.Lista_08;

import java.util.Scanner;

public class Imprimir {
    /*
    Faça um programa para imprimir: 
    1 
    2 2 
    3 3 3 
    ..... 
    n n n n n n ... n 
    para um n informado pelo usuário.  
    Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número:");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
