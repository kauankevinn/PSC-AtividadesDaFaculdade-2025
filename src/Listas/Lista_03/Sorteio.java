package Listas.Lista_03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n1, n2, maior, menor;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        maior = Math.max(n1, n2);
        menor = Math.min(n1, n2);

        System.out.println("O maior número é: "+maior);

        int ran = ThreadLocalRandom.current().nextInt(menor, maior +1 );

        if (ran % 2 == 0) {
            System.out.println("O número sorteado é " + ran + " e ele é par.");
        }else {
            System.out.println("O número sorteado é " + ran + " e ele é ímpar.!");
        }
  
        sc.close();
    }
}
