package Sala2_Daniel.Lista_08.Funcao;

import java.util.Scanner;

public class Funcao {
    
    public void soma (){
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite três números e te darei a soma deles: ");

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        double soma = n1+n2+n3;
        System.out.println("A soma dos números é: "+soma); 

        sc.close();
    }
}
