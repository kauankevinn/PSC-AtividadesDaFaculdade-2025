package Sala1_Ricardo_Bicalho.Listas.Lista04;

import java.util.Scanner;

public class Ex04 {

    // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar o ano com 365 dias e mês com 30 dias. (Idade = 30 anos)

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite a idade em anos: ");
            int ano = sc.nextInt();
            
            System.out.println("Digite a idade em meses: ");
            int mes = sc.nextInt();
            
            System.out.println("Digite a idade em dias: ");
            int dia = sc.nextInt();

            System.out.println("Sua idade total em dias é: "+((ano*365)+(mes*30)+dia));
            
        }
    }
}
