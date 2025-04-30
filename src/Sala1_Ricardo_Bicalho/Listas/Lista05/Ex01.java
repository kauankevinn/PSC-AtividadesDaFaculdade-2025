package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex01 {

    // Desenvolva um código no Portugol Studio que leia um número inteiro e mostre uma mensagem indicado se o número informado é múltiplo de 3 ou não.

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Escreva um número: ");
            int n1 = sc.nextInt();
            if (n1 % 3 == 0) {
                System.out.println("Seu número é múltiplo de 3");
            }else{
                System.out.println("Seu número não é múltiplo de 3");
            }

        }
    }
}
