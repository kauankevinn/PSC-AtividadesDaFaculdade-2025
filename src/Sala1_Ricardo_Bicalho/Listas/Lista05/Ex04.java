package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            int l1, l2, l3;
            System.out.println("Digite o tamanho dos lado do seu triângulo: ");
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();
             //Verifica se os valores formam um triângulo válido
            if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
                if (l1 == l2 && l2 == l3) {
                     //lados iguais 
                    System.out.println("Seu triângulo é um equilatero!");
                }else if (l1 != l2 && l1 != l3 && l2 != l3 ) {
                     //lados diferentes  
                    System.out.println("Seu triângulo é escaleno!");
                }else{
                     //Dois lados iguais 
                    System.out.println("Seu triângulo é isóceles");
                }
            }else{
                System.out.println("Os valores informados não formam um triângulo!");
            }

        }
    }
}
