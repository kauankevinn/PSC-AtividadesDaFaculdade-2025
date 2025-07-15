package Sala2_Daniel.Lista_10;

import java.util.Scanner;

public class Bola {
    private String cor;
    private String material;
    private double circuferencia;

    Scanner sc = new Scanner(System.in);
    
    public Bola(String cor, String material, double circuferencia) {
        this.cor = cor;
        this.material = material;
        this.circuferencia = circuferencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor() {
        System.out.println("Para qual cor você deseja trocar? ");
        this.cor = sc.nextLine();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCircuferencia() {
        return circuferencia;
    }

    public void setCircuferencia(double circuferencia) {
        this.circuferencia = circuferencia;
    }
}
