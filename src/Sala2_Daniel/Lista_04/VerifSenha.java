package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class VerifSenha {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while (true) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite sua senha: ");
                String senha = sc.nextLine();

                if (nome.equals(senha)) {
                    System.out.println("A senha não pode ser a mesma do nome de usuário! \nTente novamente.");
                }else{
                    System.out.println("Seja bem vindo!\n"+nome);
                    break;
                }
            }
        }
    }
}
