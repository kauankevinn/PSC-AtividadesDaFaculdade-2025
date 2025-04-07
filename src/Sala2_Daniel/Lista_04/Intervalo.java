package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            int maior = Math.max(n1, n2);
            int menor = Math.min(n1, n2);

            for(int i = menor; i <= maior; i++){
                System.out.println(i);
            }
        }
        
    }
}
