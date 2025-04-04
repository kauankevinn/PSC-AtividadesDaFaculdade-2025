package Sala1_Ricardo_Bicalho.Listas.Lista05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Escreva um número: ");
            int n1 = sc.nextInt();
            if (n1 % 3 == 0) {
                System.out.println("Seu número é múltiplo de 3");
            }else{
                System.out.println("Seu número não é múltiplo de 3");
            }

        }
    }
}
