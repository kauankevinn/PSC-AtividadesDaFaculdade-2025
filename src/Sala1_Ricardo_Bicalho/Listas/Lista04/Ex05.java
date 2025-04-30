package Sala1_Ricardo_Bicalho.Listas.Lista04;

import java.util.Scanner;

public class Ex05 {
    
   /*Um estudo mostrou que o lucro de uma viagem estadual é 55% vindo de pessoas que pagam a passagem
inteira e 45% de estudantes que pagam meia. Uma passagem de ônibus custa 30 reais. Sabendo disso, crie
um programa que leia quanto a empresa de ônibus acumulou no caixa após um dia de trabalho e calcule e
exiba a estimativa de quantos passageiros de cada tipo andaram de ônibus naquele dia. (Acumulou no caixa
após um dia = 250)
*/

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quanto foi acumulado no caixa das pessoas que pagam inteira: ");
            int inteira = sc.nextInt();
            System.out.println("Quanto foi acumulado no caixa das pessoas que pagam meia: ");
            int meia = sc.nextInt();
            
            int passInteira = (int) Math.round((0.55 * inteira) / 30);
            int passMeia = (int) Math.round((0.45 * meia) / 15);

            System.out.println("Passageiros que pagaram inteiro: "+passInteira);
            System.out.println("Passageiros que pagaram meia: "+passMeia);
        }
    }

}
