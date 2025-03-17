package Listas.Lista_03;

import java.util.Scanner;

public class AutoMak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vcompra, vpago, troco;
        vcompra = 100;
        System.out.println("O valor da sua compra deu: R$"+vcompra);
        vpago = sc.nextInt();
        troco = vpago - vcompra;
        if (vcompra > vpago) {
            System.out.println("Você ainda deve pagar: "+(vcompra - vpago));
        }else if (vcompra == vpago) {
            System.out.println("Muito bem aqui está sua compra!");
        }else{
            System.out.println("Seu troco é de: "+troco);
            
            int[] notas = {50, 20, 10, 5, 2, 1};

            for (int i = 0; i < notas.length; i++) {
                int qtdNotas = troco/notas[i];
                troco = troco%notas[i];
                if (qtdNotas > 0) {
                    System.out.println("Notas de R$" + notas[i] + ": " + qtdNotas);
                }
            }
        }

        sc.close();
    }
    
}
