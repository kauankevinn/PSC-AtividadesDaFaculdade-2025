package Sala2_Daniel.Lista_10;

import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    Scanner sc = new Scanner(System.in);

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(){
        if (idade <= 21) {
            altura+=0.05;
        }
        idade++;
    }
    public void engordar(){
        System.out.println("Quantos kg você engordou?");
        double engordar = sc.nextDouble();
        peso+= engordar;
    }
    public void emagrecer(){
        System.out.println("Quantos kg você emagreceu?");
        double emagrecer = sc.nextDouble();
        peso-= emagrecer;
    }
    public void crescer(){
        System.out.println("Quantos centímetros você cresceu?");
        double crescimento = sc.nextDouble();
        altura += (crescimento/100);
    }
    public void exibirDados(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nPeso: "+peso+"\nAltura: "+altura);
    }
}
