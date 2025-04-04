package Sala1_Ricardo_Bicalho.Atv_Sala.Sala05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,media;
        System.out.println("Informe suas notas: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        media = (n1+n2+n3)/3;
        System.out.println("Sua média é: "+media);

        sc.close();
    }
}
