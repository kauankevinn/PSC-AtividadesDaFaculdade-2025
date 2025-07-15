package Sala2_Daniel.Lista_07;
import java.util.Scanner;

public class Listas {

/* Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: 
"Telefonou para a vítima?" 
"Esteve no local do crime?" 
"Mora perto da vítima?" 
"Devia para a vítima?" 
"Já trabalhou com a vítima?"  
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como  "Assassino". Caso contrário, ele será classificado como "Inocente"
 */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?", 
            "Mora perto da vítima?", 
            "Devia para a vítima?", 
            "Já trabalhou com a vítima?" 
        };

        int[] resposta = new int[5];
        
        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]+" Digite 0 para não e 1 para sim");
            resposta[i] = sc.nextInt();
        }
        int soma = 0;
        for(int s : resposta){
            soma += s;
        }
        if (soma == 2) {
            System.out.println("Você foi classificado como suspeito!");
        }else if (soma == 3 || soma == 4) {
            System.out.println("Você foi classificado como cúmplice!");
        }else if (soma == 5) {
            System.out.println("Você é o Assassino!");
        }else{
            System.out.println("Você é inocente!");
        }

        }
    }
}
