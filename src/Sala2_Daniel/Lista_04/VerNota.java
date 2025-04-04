package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class VerNota {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Me dê uma nota entre 0 e 10");
            

            while (true) {
                double n1 = sc.nextDouble();
                if (n1 >= 0 && n1 <= 10) {
                    System.out.println("sua nota é: "+n1);
                    break;
                }else{
                    System.out.println("Digite um número válido!");
                }
                
            }
            


        }
    }

}
