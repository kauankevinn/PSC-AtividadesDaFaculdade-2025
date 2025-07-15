package Sala2_Daniel.Lista_10;

import java.util.Scanner;

public class Retangulo {

    Scanner sc = new Scanner(System.in);

    double ladoA;
    double ladoB;
    
    double basePiso;
    double alturaPiso;
    double areaPiso;

    double compRodape;
    
    double perimetro;
    double area;

    // lados piso 
    public double getComprimentoPiso() {
        return areaPiso;
    }
    public void setComprimentoPiso() {
        System.out.println("Qual a largura do piso: ");
        alturaPiso = sc.nextDouble();
        System.out.println("Qual o comprimento do piso: ");
        basePiso = sc.nextDouble();
        areaPiso = alturaPiso*basePiso;
    }

    //lados rodapé 
    public double getComprimentoRodape() {
        return compRodape;
    }
    public void setComprimentoRodape(){
        System.out.println("Digite o comprimento do rodapé:");
        compRodape = sc.nextDouble();
    }
    
    // Lado retângulo 
    public double getAreaRetalgulo() {
        return area;
    }
    public void setRetangulo() {
        System.out.println("Qual o valor do lado A: ");
        ladoA = sc.nextDouble();
        System.out.println("Qual o valor do lado B: ");
        ladoB = sc.nextDouble();
    }
    // Cálculos
    public void calcularArea(){
        area = ladoA*ladoB;
       System.out.println("A área do retângulo é: "+area);
    }
    public void calcularPerimetro(){
        perimetro = (ladoA+ladoB)*2;
        System.out.println("O perímetro do retângulo é: "+perimetro);
    }
    public void materiais(){
        double pisoGasto = Math.ceil(area/areaPiso);
        double rodapeGasto = Math.ceil(perimetro/compRodape);
        System.out.println("Para completar a área você vai gastar "+pisoGasto+"m2 de piso e "+rodapeGasto+" rodapés");
    }
}
