package Listas.Lista_03;

import java.util.Scanner;

public class Equacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;
        int res;

        System.out.println("Escreva o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Escreva o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Selecione uma das opções: \n 1: Soma \n 2: Subtração \n 3: Multiplicação \n 4: Elevação");
        res = sc.nextInt();

        switch (res) {
            case 1:
                double s = n1+n2;
                System.out.printf("A soma dos números é: %.2f",s);
                break;
            case 2:
                double sub = n1-n2;
                System.out.printf("A Subtração dos números é: %.2f",sub);
                break;
            case 3:
                double m = n1*n2;
                System.out.printf("A Multiplicação dos números é: %.2f",m);
                break;
            case 4:
                double e = Math.pow(n1, n2);
                System.out.printf("%f elevado a %f é: %.2f",n1,n2,e);
                break;
        
            default:
                System.out.println("Verifique se digitou o número corretamente!");
                break;
        }
        sc.close();
    }
}
