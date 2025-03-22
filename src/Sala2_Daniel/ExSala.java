package Sala2_Daniel;

import java.util.Scanner;

public class ExSala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;
        int amizades, a1, a2, a3, ex;

        System.out.println("Quantas amizades você fez na cidade?");
        amizades = sc.nextInt();
        alegria = amizades*10;
        
        if (amizades == 0 ) {
            tristeza += 30;
        }

        System.out.println("Pontos Alelgria e Tristeza:\nAlegria: "+alegria+"\nTristeza: "+tristeza);

         System.out.println("Quantos pontos você fez na A1?");
        a1 = sc.nextInt();
        System.out.println("Quantos pontos você fez na A2?");
        a2 = sc.nextInt();
        System.out.println("Quantos pontos você fez na A3?");
        a3 = sc.nextInt();

        double media = (a1+a2+a3)/3.0;

        System.out.printf("Sua média final é: %.2f",media);

        if (media >= 7) {
            alegria =+ 50;
        }else{
            tristeza =+ 50;
        }

        System.out.println("\nPontos Alelgria e Tristeza:\nAlegria: "+alegria+"\nTristeza: "+tristeza);

        System.out.println("Quantos exercícios você conseguiu fazer?");
        ex = sc.nextInt();
        alegria =+ (ex*10);
        tristeza =+ ((10-ex)*10);

        System.out.println("Pontos Alelgria e Tristeza:\nAlegria: "+alegria+"\nTristeza: "+tristeza);

        sc.close();
    }
    
}
