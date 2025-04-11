package Sala1_Ricardo_Bicalho.Atv_Sala.Sala06;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int[] numeros = new int[5];
            int soma = 0;
            try {
                for(int i = 0; i < 5; i++ ){
                    System.out.println("Digite o "+(i+1)+"° número: ");
                    numeros[i] = sc.nextInt();
                }
                System.out.println("Números armazenados no array: ");
                for(int i = 0; i < 5; i++){
                    System.out.println((i+1)+"° posição: "+numeros[i]);           
                }

                for(int i = 0; i < 5; i++ ){
                    soma += numeros[i];
                }
                System.out.println("A soma dos números é: "+soma);

            } catch (Exception e) {
                System.out.println("Algo deu errado!");
            }
            
        }
    }
}
