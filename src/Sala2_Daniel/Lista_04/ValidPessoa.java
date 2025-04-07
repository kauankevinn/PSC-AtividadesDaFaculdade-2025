package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class ValidPessoa {
    /* 
    Faça um programa que leia e valide as seguintes informações: Nome: maior que 3 caracteres; 
    Idade: entre 0 e 150; 
    Salário: maior que zero; 
    Sexo: 'f' ou 'm'; 
    Estado Civil: 's', 'c', 'v', 'd'; 
     */

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String nome, sexo, estcivil;
            int idade;
            double salario;

                while (true) {
                    System.out.println("Me diga seu nome:");
                    nome = sc.nextLine();
                    if (nome.length() <= 3) {
                        System.out.println("Seu nome precisa ser maior que 3 letras!");
                    } else { 
                        break;  
                    } 
                }
                while (true) {
                    try {
                        System.out.println("Me diga sua idade:");
                        idade = sc.nextInt();
                        if (idade < 0 || idade > 150) {
                            System.out.println("Você não ta nem vivo parceiro!\nTente novamente.");
                        } else { 
                            sc.nextLine();
                         break;  
                        } 
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Digite números válidos!");
                        sc.nextLine();
                    }
                }
                while (true) {
                    System.out.println("Me diga seu sexo (m/f):");
                    sexo = sc.nextLine();
                 if (sexo.equals("m") || sexo.equals("f")) {
                    break;
                } else { 
                  System.out.println("Digite valores válidos"); 
                } 
                }
                while (true) {
                    try {
                        System.out.println("Qual seu salário?");
                        salario = sc.nextDouble();
                        if (salario > 0) {
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Seu salário tem que ser maior que zero!");
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Digite um número válido!");
                        sc.nextLine();
                    }
                }
                while (true) {
                    System.out.println("Qual seu estado civil? ( s , c , v , d )");
                    estcivil = sc.nextLine();
                    if (estcivil.equalsIgnoreCase("s") || estcivil.equalsIgnoreCase("c") || estcivil.equalsIgnoreCase("v") || estcivil.equalsIgnoreCase("d")) {
                        break;
                    } else {
                        System.out.println("Digite uma opção válida ( s , c , v , d )");
                    }
            }
            System.out.println("Dados válidos! \nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nSalário: " + salario + "\nEstado Civil: " + estcivil);
        }
    }
}
