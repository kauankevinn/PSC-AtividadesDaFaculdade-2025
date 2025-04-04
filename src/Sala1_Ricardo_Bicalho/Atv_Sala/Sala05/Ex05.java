package Sala1_Ricardo_Bicalho.Atv_Sala.Sala05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m;

        System.out.println("Digete uma disância em metros:");
        m = sc.nextDouble();
        System.out.println("A distância em km é: "+(m/1000));
        System.out.println("A distância em hm é: "+(m/100));
        System.out.println("A distância em dam é: "+(m/10));
        System.out.println("A distância em dm é: "+(m*10));
        System.out.println("A distância em cm é: "+(m*100));
        System.out.println("A distância em mm é: "+(m*1000));

        sc.close();
    }
}
