package Listas.Lista_02;

import java.util.Scanner;

public class SubSomMultNum {

    //Subtração, Multiplicação e Soma de dois números.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Informe o primeiro e o segundo número: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
       
        System.out.println("A soma dos números é: "+(n1+n2));
        System.out.println("A subtração dos números é: "+(n1-n2));
        System.out.println("A multiplicação dos números é: "+(n1*n2));

        sc.close();
    }
}
