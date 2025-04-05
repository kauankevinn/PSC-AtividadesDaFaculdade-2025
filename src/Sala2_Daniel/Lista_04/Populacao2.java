package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class Populacao2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double p1, p2, taxA, taxB;
            int anos = 0;
            System.out.println("Digite a população inicial e a taxa de crescimento da primeira cidade: ");
            p1 = sc.nextDouble();
            taxA = sc.nextDouble();
            System.out.println("Digite a população inicial e a taxa de crescimento da segunda cidade: ");
            p2 = sc.nextDouble();
            taxB = sc.nextDouble();

            while (p1 < p2) {
                p1 +=(p1*taxA);
                p2 +=(p2*taxB);
                anos++;
            }
            System.out.println("Cidade A:"+p1+"\nCidade B:"+p2+"\nDemorou "+anos+" para a cidade A chegar na população da cidade B");
                
            }
        }
    }

