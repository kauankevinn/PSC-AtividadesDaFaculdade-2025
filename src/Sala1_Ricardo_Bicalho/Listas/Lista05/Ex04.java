package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex04 {

    /*Crie um algoritmo que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois. Depois mostre e informe que tipo de triângulo:
     - EQUILÁTERO: todos os lados iguais;
     - ISÓSCELES: dois lados iguais;
     - ESCALENO: todos os lados diferentes.
    */
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
