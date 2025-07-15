package Sala1_Ricardo_Bicalho.Listas.Lista11;

import java.util.Scanner;

public class Ex02 {

    /*
    Elabore um programa em Java que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    */  
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while (true) {
                System.out.println("Quantos funcionários trabalham na empresa?");
                int funcionarios = sc.nextInt();

                if (funcionarios <= 0) {
                    System.out.println("Numero de funcionários inválido!");
                    continue;
                } 

                double somaSalario = 0.0; 

                for(int i = 1; i<=funcionarios; i++){
                    System.out.println("Quanto o funcionário "+i+" Recebe por mês?");
                    double salario = sc.nextDouble();
                    somaSalario += salario;
                }
                  
                double mediaSalario = somaSalario/funcionarios;
                System.out.printf("A média salarial da empresa é: R$ %.2f",mediaSalario);
                break;
            }
        }
    }
}
