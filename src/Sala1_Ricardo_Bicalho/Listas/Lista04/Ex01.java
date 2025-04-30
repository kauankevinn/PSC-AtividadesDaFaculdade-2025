package Sala1_Ricardo_Bicalho.Listas.Lista04;

import java.util.Scanner;

public class Ex01 {

    //Crie um programa que receba uma temperatura em Celsius (28 graus) e a converta e exiba usando as escalas Kelvin e Fahrenheit
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite uma temperatura em Celsius: ");
            int celsius = sc.nextInt();
            System.out.println("Sua temperatura em Farenheit é: "+((1.8 *celsius ) +32)); 
            System.out.println("Sua temperatura em Kelvin é: "+(celsius+273.15));
        }
    }
    
}
