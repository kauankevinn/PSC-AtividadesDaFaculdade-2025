package Sala2_Daniel.Lista_03;

import java.util.Scanner;

public class OrdemNum {

    //Ordena números e mostra a média deles.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;
        float m;

        System.out.println("Escreva o primeiro número");
        n1 = sc.nextInt();
        System.out.println("Escreva o segundo número");
        n2 = sc.nextInt();
        System.out.println("Escreva o terceiro número");
        n3 = sc.nextInt();

        m = (n1+n2+n3)/3.0f;

        int maior = Math.max(n1, Math.max(n2, n3));
        int menor = Math.min(n1, Math.min(n2, n3));

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        System.out.println("A média dos números é: "+m);
        
        sc.close();
    }
    
}
