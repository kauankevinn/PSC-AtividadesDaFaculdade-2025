package Sala2_Daniel.Lista_08.Imposto;

public class SomaImposto {
    public void imposto(double taxaImposto, double custo){
        taxaImposto = taxaImposto/100*custo;
        custo = taxaImposto+custo;
        System.out.println("O custo do produto pós imposto é: "+custo);
    }
}
