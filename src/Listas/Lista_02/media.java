package Listas.Lista_02;

import java.util.Scanner;

public class media {

    //Calcula a média das notas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,n4,media;
        System.out.println("Informe suas notas: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        media = (n1+n2+n3+n4)/4;
        System.out.println("Sua média é: "+media);
        
        sc.close();
    }
}
