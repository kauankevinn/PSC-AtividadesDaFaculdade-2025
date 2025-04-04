package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex03 {
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
