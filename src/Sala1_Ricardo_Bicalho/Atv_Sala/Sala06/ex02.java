package Sala1_Ricardo_Bicalho.Atv_Sala.Sala06;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int idade;
            System.out.println("Qual a sua idade? ");
            idade = sc.nextInt();

         if(idade >= 18){
            System.out.println("Informe seus dados: ");
            System.out.println("Seu nome:");
            String nome = sc.next();
            System.out.println("CPF: ");
            double cpf = sc.nextInt();
            System.out.println("Deseja marcar a sua prova?(S/N)");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Seu exame está marcado");
            } else {
                System.out.println("Seu exame não foi marcado");
            }
         } else{
            System.out.println("Você não tem idade o suficiente para isso!");
         }
        }
    }   
}