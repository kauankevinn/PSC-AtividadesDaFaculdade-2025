package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex02 {

    // Elabore um programa que leia 3 números inteiros e mostre ao usuário qual é o maior e qual é o menor.

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            System.out.println("Digite o terceiro número: ");
            int n3 = sc.nextInt();

            int maior = Math.max(Math.max(n1, n2), n3);
            int menor = Math.min(Math.min(n1, n2), n3);

            System.out.println("O maior número é: "+maior);
            System.out.println("O menor número é: "+menor);
            
        }
    }
}
