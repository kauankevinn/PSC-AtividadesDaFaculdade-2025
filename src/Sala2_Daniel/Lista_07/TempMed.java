package Sala2_Daniel.Lista_07;
import java.util.Scanner;

public class TempMed {

    /* 
    Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das
    temperaturas e  mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro,
    2 – Fevereiro, . . . ). 
    */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubor", "Novembro", "Dezembro"};

            Double[] temperatura = new Double[12];

                for(int i = 0; i < meses.length; i++){
                System.out.println("Qual foi a temperatura média de "+meses[i]+" ?");
                temperatura[i] = sc.nextDouble();
            }

            double soma = 0;

            for(double t : temperatura) soma += t;
            // O código acima é uma forma mais enxuta para escrever este mesmo código:
            /*
             for (int i = 0; i < temperatura.length; i++) {
                double t = temperatura[i];
                soma += t;
             } 
             */
            double mediaAnual = soma/meses.length;
            System.out.printf("Média anual: %.2f°C%n",mediaAnual);

            System.out.println("Meses com temperatura acima da média:");
            for(int i = 0; i < temperatura.length; i++){
                if (temperatura[i] > mediaAnual) {
                    System.out.printf("  %s: %.2f°C%n", meses[i], temperatura[i]);
                }
            }

        }
    }
}
