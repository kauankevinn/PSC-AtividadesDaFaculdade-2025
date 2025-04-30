package Sala1_Ricardo_Bicalho.Listas.Lista04;

import java.util.Scanner;

public class Ex02 {
    
    // Considere a seguinte regra de proporcionalidade: Um passo é equivalente a 0,82 metros. Crie um programa que leia uma distância em quilômetros e calcule e exiba quanto é essa distância em passos. (Distância = 8km)

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite uma kilometragem: ");
            int km = sc.nextInt()*1000;
            System.out.printf("Essa distância em passos é: %.2f",(km/0.82));
        }
    }

}
