package Sala2_Daniel.Lista_10;

import java.util.Scanner;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo;

    Scanner sc = new Scanner(System.in);

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0; 
    }

    public void alterarNome(){
        System.out.println("Qual o novo nome?");
        nomeCorrentista = sc.nextLine();
    }

    public void deposito(){
        System.out.println("Quanto você deseja depositar?");
        double depositar = sc.nextDouble();
        if (depositar < 0) {
            System.out.println("Apenas valores acima de 0");
        }else{
            saldo += depositar;
        }
    }

    public void saque(){
        System.out.println("Quanto você deseja sacar?");
        double sacar = sc.nextDouble();
        if (sacar > saldo) {
            System.out.println("Transação inválida");
        }else{
            saldo -= sacar;
        }
    }

    public void exibirDados(){
        System.out.println("Numero da Conta: "+numeroConta+"\nNome Correntista: "+nomeCorrentista+"\nSaldo: "+saldo);
    }
}
