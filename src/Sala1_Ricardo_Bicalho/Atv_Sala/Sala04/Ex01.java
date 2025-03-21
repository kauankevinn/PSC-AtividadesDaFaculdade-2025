package Sala1_Ricardo_Bicalho.Atv_Sala.Sala04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat nf = new DecimalFormat("#.00");

        int b = 20;
        int s = 200;
        int c = 50;
        int ch = 60;
        int qblusa, qsapato, qcalca, qchapeu; 
        double tot1, tot2;

        System.out.println("Temos esses produtos: \n1.Blusa R$ 20,00\n2.Sapato R$ 200,00\n3.Calça R$ 50,00\n4.Chapéu R$ 60,00\nQuantos de cada um você quer levar?");
        qblusa = sc.nextInt();
        qsapato = sc.nextInt();
        qcalca = sc.nextInt();
        qchapeu = sc.nextInt();
        tot1 = qblusa+qsapato+qcalca+qchapeu;

        tot2 = (qblusa*b)+(qsapato*s)+(qcalca*c)+(qchapeu*ch);

        if (tot1 >= 4) {
            tot2 = tot2*0.8;
            System.out.println("Você teve desconto de 20 o total da compra é: "+nf.format(tot2));
        }else{
            System.out.println("Você não teve desoconto o total da compra é: "+nf.format(tot2));
        }

        sc.close();
    }
}
