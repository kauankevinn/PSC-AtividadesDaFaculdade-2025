package Sala2_Daniel.Lista_07;
import java.util.Scanner;

public class Empresa {
    
    /* 
    Utilize uma lista para resolver o problema a seguir. 
    Uma empresa paga seus vendedores com base em comissões. 
    O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana.  
    Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, 
    ou seja, um total de $470. 
    Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários 
    nos seguintes intervalos de valores: 
    $200 - $299 
    $300 - $399 
    $400 - $499 
    $500 - $599 
    $600 - $699 
    $700 - $799 
    $800 - $899 
    $900 - $999 
    $1000 em diante
    */
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] contadores = new int[9];

             System.out.println("Digite as vendas brutas dos vendedores (ou -1 para encerrar):");

            while (true) {

                System.out.print("Vendas do vendedor: $");
                double venda = sc.nextDouble();

                if (venda == -1) {
                    break;
                }

                // Calcula o salário com base nas vendas
                double salario = 0.09 * venda;
                int indice = (int)(salario / 100);

                if (indice < 0) {
                    indice = 0; 
                } else if (indice >= 8) {
                    indice = 8;
                }

                contadores[indice]++;
                    
            }

             String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
            "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 ou mais"
            };

            // Exibe os resultados
            System.out.println("\nDistribuição de salários:");
            for (int i = 0; i < contadores.length; i++) {
                System.out.println(faixas[i] + ": " + contadores[i] + " vendedor(es)");
            }
        }
    }
}
