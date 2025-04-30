package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex03 {

    /*Crie um programa no Portugol Studio que leia 3 notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida:
     - Média até 4.9: REPROVADO
     - Média entre 5.0 e 6.9: RECUPERAÇÃO
     - Média 7.0 ou superior: APROVADO
    */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double n1,n2,n3,media;
            System.out.println("Informe suas notas: ");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = (n1+n2+n3)/3;
            System.out.printf("Sua média é: %.2f %n",media);

            if (media >= 7) {
                System.out.println("Aprovado!");
            }else if(media <= 4.9){
                System.out.println("Reprovado!");
            }else{
                System.out.println("Recuperação!");
            }
        }
    }
}
