package Listas.Lista_03;

import java.util.Scanner;

public class MaquinaVenda {
    
    //Máquina de venda Automática.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vcompra = 100;  // Valor da compra
        System.out.println("O valor da sua compra deu: R$" + vcompra);

        System.out.print("Digite o valor que deseja pagar: ");
        int vpago = sc.nextInt();

        int troco = vpago - vcompra;

        // Verificando se o valor pago é suficiente
        if (vcompra > vpago) {
            System.out.println("Você ainda deve pagar: R$" + (vcompra - vpago));
        } else if (vcompra == vpago) {
            System.out.println("Muito bem, aqui está sua compra!");
        } else {
            System.out.println("Seu troco é de: R$" + troco);

            // Array com as notas disponíveis
            int[] notas = {50, 20, 10, 5, 2, 1};

            // Percorrendo as notas e calculando quantas de cada uma
            for (int i = 0; i < notas.length; i++) {
                int qtdNotas = troco / notas[i];  // Quantas notas do valor atual podem ser dadas
                troco = troco % notas[i];  // Atualiza o troco restante

                // Exibe o número de notas de cada valor
                if (qtdNotas > 0) {
                    System.out.println("Notas de R$" + notas[i] + ": " + qtdNotas);
                }
            }
        }

        sc.close();  
    }
}
