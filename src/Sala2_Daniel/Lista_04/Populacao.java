package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class Populacao {

    //Supondo que a população de um país A seja da ordem de 80000 habitantes  com uma taxa anual de crescimento de 3% e que a população de B seja 200000  habitantes com uma taxa de crescimento de 1.5%.  Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,  mantidas as taxas de crescimento.

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

