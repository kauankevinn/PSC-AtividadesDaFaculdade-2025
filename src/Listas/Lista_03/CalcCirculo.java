package Listas.Lista_03;

import java.util.Scanner;

public class CalcCirculo {

    //Calcula o perímetro e área de um círculo, também o volume de uma esfera

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;
        double pi = 3.141592;
        double raio;

        System.out.println("Escolha uma das opções: \n 1: calcular e imprimir o perímetro do círculo. \n 2: calcular e imprimir a área do círculo. \n 3: calcular e imprimir o volume da esfera.");
        opcao = sc.nextInt();
        System.out.println("Me informe o raio do círculo ou esfera: ");
        raio = sc.nextDouble();
        
        switch (opcao) {
            case 1 :
                double p = 2*pi*raio;
                System.out.printf("O perímetro do seu círculo é: %.2f",p);
                break;
            case 2 :
                double a = pi*(raio*raio);
                System.out.printf("A área do seu círculo é: %.2f",a);
                break;
            case 3 :
                double v = (4.0/3.0)*pi*Math.pow(raio, 3);
                System.out.printf("O Volume da sua esfera é de: %.2f",v);
                break;
        
            default:
                System.out.println("Verifique se digitou o número corretamente!");
                break;
        }
        
        sc.close();
    }
}
