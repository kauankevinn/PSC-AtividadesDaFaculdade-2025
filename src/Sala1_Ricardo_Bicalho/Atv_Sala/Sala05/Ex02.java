package Sala1_Ricardo_Bicalho.Atv_Sala.Sala05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("O antecessor do número é :"+(n1-1));
        System.out.println("O sucessor do número é: "+(n1+1));
        sc.close(); 

    }
    

}
