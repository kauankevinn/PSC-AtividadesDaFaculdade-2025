package Sala2_Daniel.Lista_04;

import java.util.Arrays;
import java.util.Scanner;

public class ImpSomMed {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] numeros = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o " + (i + 1) + "º número:");
                numeros[i] = sc.nextDouble();
            }
            double soma = Arrays.stream(numeros).sum();
            double media = soma/numeros.length;
            System.out.println("A soma dos números é: " + soma+"\nA média dos números é: "+media);
        }
    }
}