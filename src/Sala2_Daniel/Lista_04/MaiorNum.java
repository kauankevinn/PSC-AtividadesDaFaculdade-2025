package Sala2_Daniel.Lista_04;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] numeros = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o " + (i + 1) + "º número:");
                numeros[i] = sc.nextDouble();
            }
            double maior = Arrays.stream(numeros).max().getAsDouble();
            System.out.println("O maior número é: " + maior);
        }
    }
}