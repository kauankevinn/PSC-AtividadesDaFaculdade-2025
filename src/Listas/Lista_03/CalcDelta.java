package Listas.Lista_03;

import java.util.Scanner;

public class CalcDelta {

    //Cálculo de Bhaskara.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Informe o coeficiente a: ");
        a = sc.nextDouble();
        System.out.println("Informe o coeficiente b: ");
        b = sc.nextDouble();
        System.out.println("Informe o coeficiente c: ");
        c = sc.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente!");
        }else if (a == 0 && b != 0) {
            double x = -c/b;
            System.out.println("Essa é uma equação de primeiro grau: "+x);
        }else {
            //calcula o delta
            double d = (b*b) - (4*a*c);

            if (d < 0) {    
                System.out.println("Esta equação não possui raízes reais.");
            }else{
                //define a raiz de delta 
                double rd = Math.sqrt(d);
                if (d == 0) {
                    double x = -b/(2*a);
                    System.out.println("Esta equação possui duas raízes reais iguais: "+x);
                }else{
                    double x1 = (-b+rd)/(2*a);
                    double x2 = (-b-rd)/(2*a);
                    System.out.println("Esta equação possui duas raízes reais diferentes: "+x1+" e "+x2);
                }
            } 
            
            
        }

        sc.close();
    }
}