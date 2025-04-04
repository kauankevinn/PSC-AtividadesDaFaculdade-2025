package Sala1_Ricardo_Bicalho.Atv_Sala.Sala05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = sc.nextDouble();
        
        System.out.println("O dobro: "+(n1*2));
        System.out.println("O triplo: "+(n1*3));
        System.out.printf("A terça parte arredondada: %.2f",(n1/3));

        sc.close(); 

        

    }
}
