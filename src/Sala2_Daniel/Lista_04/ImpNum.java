package Sala2_Daniel.Lista_04;

import java.util.Scanner;

public class ImpNum {

    //Faça um programa que imprima na tela os números de 1 a 20, um abaixo do  outro. Depois modifique o programa para que ele mostre os números um ao  lado do outro.

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 1; i <= 20; i++){
                System.out.print(i + " ");
            }
        }
    }
}
