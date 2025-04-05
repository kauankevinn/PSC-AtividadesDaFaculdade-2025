package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class Populacao {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            double p1 = 80000, p2 = 200000, taxA = 0.03, taxB = 0.015;
            int anos = 0;
            while (p1 < p2) {
                p1 +=(p1*taxA);
                p2 +=(p2*taxB);
                anos++;
            }
            System.out.println("Cidade A:"+p1+"\nCidade B:"+p2+"\nAnos que demorou para a cidade A chegar na população da cidade B: "+anos);
                
            }
        }
    }

