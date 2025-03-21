package Sala2_Daniel.Lista_02;

import java.util.Scanner;

public class LitroGas {

    //Calcula o valor da gasolina e quanto se deve pagar.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float n1, n2, m;
        System.out.println("Qual o preço do litro da gasolina?");
        n1 = sc.nextFloat();
        System.out.println("Quantos litros você está comprando?");
        n2 = sc.nextFloat();
        m = n1*n2;
        System.out.printf("Você deve pagar um total de: R$ %.2f%n", m);
        
        sc.close();
    }
}
