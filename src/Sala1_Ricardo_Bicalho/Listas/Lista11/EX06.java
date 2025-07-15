package Sala1_Ricardo_Bicalho.Listas.Lista11;

import java.util.Scanner;

public class EX06 {

    /*
     O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
     */

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Qual o custo de fábrica do carro?");
            double custoFabrica = sc.nextDouble();

            double percentagemDistribuidor = custoFabrica*0.28;
            double percentagemImposto = custoFabrica*0.45; 
            double custoConsumidor = custoFabrica+percentagemDistribuidor+percentagemImposto;

            System.out.printf("O custo para o consumidor final será de: R$%.2f",custoConsumidor);
        }
    }
}
