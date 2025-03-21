package Sala1_Ricardo_Bicalho.Atv_Sala.Sala04_1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res, temp;

        System.out.println("Escolha a temperatura desejada que converterei: \n 1.Celsius \n 2.Farenheit \n 3.Kelvin");
        res = sc.nextInt();
        System.out.println("Digite a temperatura: ");
        temp = sc.nextInt();

        int k = temp+273;
        double c = (temp-32)*(5.0/9.0);
        double f = 1.8*temp+32;

        switch (res) {
            case 1:    
                System.out.printf("Sua temperatura em Kelvin é: %d \nSua temperatura em Farenheit é: %.2f",k,f);
                break;
            case 2:
                System.out.printf("Sua temperatura em Kelvin é: %d \nSua temperatura em Celsius é: %.2f",k,c);
                break;
            case 3:
                System.out.printf("Sua temperatura em Celsius é: %.2f \nSua temperatura em Farenheit é: %.2f",c,f);
                break;
        
            default:
                System.out.println("Digite um número válido!");
                break;
        }

        sc.close();
    }
}
