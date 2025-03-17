package Listas.Lista_02;

import java.util.Scanner;

public class EuroTrip {
    
    //Calcula valor das viagens baseado no que é inserido e na quantidade de pessoas. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float v1,v2,v3,t;
        int p;

        System.out.println("Qual o valor da viagem à Alemanha?");
        v1 = sc.nextFloat();
        System.out.println("Qual o valor da viagem à Portugal?");
        v2 = sc.nextFloat();
        System.out.println("Qual o valor da viagem à Itália?");
        v3 = sc.nextFloat();
        System.out.println("Quantas pessoas vão nessa viagem?");
        p = sc.nextInt();
        t = (v1+v2+v3)*p;
        System.out.printf("O total da viagem para %d pessoas fica: R$ %.2f",p,t);
        
        sc.close();
    }
    
}
