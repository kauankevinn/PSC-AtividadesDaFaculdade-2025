package Sala1_Ricardo_Bicalho.Atv_Sala.Sala04_1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, a;

        System.out.println("Informe seu peso e sua altura:");
        p = sc.nextDouble();
        a = sc.nextDouble();
        double imc = p/(a*a);
        System.out.printf("Seu IMC é: %.2f",imc);

        sc.close();
    }
}
