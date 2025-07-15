package Sala2_Daniel.Lista_07;
import java.util.ArrayList;
import java.util.Scanner;

public class LerNum {
    /*
    Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado).  
    Após esta entrada de dados, faça: 
    Mostre a quantidade de valores que foram lidos;     
    Exiba todos os valores na ordem em que foram informados,um ao lado do outro; 
    Exiba todos os valores na ordem inversa à que foram informados, um abaixo  do outro; 
    Calcule e mostre a soma dos valores;    
    Calcule e mostre a média dos valores;   
    Calcule e mostre a quantidade de valores acima da média calculada;  
    Calcule e mostre a quantidade de valores abaixo de sete;    
    Encerre o programa com uma mensagem. 
    */

 public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número: ");
            numeros.add(sc.nextInt());

            System.out.println("Deseja continuar? (-1 para encerrar)");
            int resposta = sc.nextInt();

            if (resposta == -1) {
                //Quantidade de valores digitados
                System.out.println("\nQauntidade de valores digitados: "+numeros.size());
                //Valores em ordem
                System.out.print("\nValores na ordem informada: ");
                for (int num : numeros) {
                    System.out.print(num + " ");
                }
                // Exibir todos os valores na ordem inversa
                System.out.println("\nValores na ordem inversa:");
                for (int i = numeros.size() - 1; i >= 0; i--) {
                    System.out.println(numeros.get(i));
                }
                //soma dos valores 
                int soma = 0;
                for(int s : numeros) soma += s;
                System.out.println("\nA soma dos números é: " + soma);

                //média dos valores 
                double media = soma/numeros.size();
                System.out.println("\nA média dos valores é: "+media);

                //Valores acima da média 
                int acimaMedia = 0;
                for(int n : numeros){
                    if (n > media) {
                        acimaMedia++;
                    }
                } System.out.println("\nQuantidade de valores acima da média: " + acimaMedia);
                       
                //valores abaixo de sete 
                int abaixoDeSete = 0;
                for(int n : numeros){
                    if (n < 7) {
                        abaixoDeSete++;
                    }
                } System.out.println("\nQuantidade de valores abaixo de 7: " + abaixoDeSete);
                

                System.out.println("\nFim do programa!");

                break;
            }else{
                continue;
            }
        }
    }
    

 }
}
