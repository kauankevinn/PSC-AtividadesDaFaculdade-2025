package Sala1_Ricardo_Bicalho.Atv_Sala.Sala04_1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("A qual potência você deseja elevar esse número?");
        int n2 = sc.nextInt();

        double res = Math.pow(n1, n2);
        System.out.println("O resultado é: "+res); 

        sc.close();
    }
}
