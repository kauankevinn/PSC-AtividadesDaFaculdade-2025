package Sala2_Daniel.Lista_08;

import java.util.Scanner;

public class ImprimirV2 {
    /*
    Faça um programa para imprimir: 
    1 
    1 2 
    1 2 3 
    ..... 
    1 2 3 ... n 
    para um n informado pelo usuário.  
    Use uma função que receba um valor n inteiro imprima até a n-ésima linha.    
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número:");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
