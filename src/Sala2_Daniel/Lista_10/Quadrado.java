package Sala2_Daniel.Lista_10;

import java.util.Scanner;

public class Quadrado {
    double tamanhoLado;

    Scanner sc = new Scanner(System.in);

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado() {
        System.out.println("Qual o tamanho do lado?");
        tamanhoLado = sc.nextDouble();
    }

    public void calcular(){
        double area = tamanhoLado*tamanhoLado;
        System.out.println("A área do seu quadrado é: "+area);
    }
}
