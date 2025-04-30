package Sala1_Ricardo_Bicalho.Listas.Lista04;

import java.util.Scanner;

public class Ex03 {

    //Na construção civil, sabe-se que 8 pedreiros levam 72 horas para construir um muro. Faça um programa que leia a quantidade de pedreiros disponíveis e informe quantas horas eles demorarão para terminar o muro. (Quantidade de pedreiros disponíveis = 16)
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quantos pedreiros estão trabalhando no seu muro? ");
            int pedreiros = sc.nextInt();
            System.out.println("Seus pedreiros levarão "+((8*72)/pedreiros)+"hrs para completar seu muro.");
        }
    }
    
}
