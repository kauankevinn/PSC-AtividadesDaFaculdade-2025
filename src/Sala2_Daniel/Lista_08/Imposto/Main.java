package Sala2_Daniel.Lista_08.Imposto;

public class Main {
    /*
     Faça um programa com uma função chamada somaImposto. A função possui  dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre  vendas expressa em porcentagem e custo, que é o custo de um item antes do  imposto. A função “altera” o valor de custo para incluir o imposto sobre  vendas. 
     */
    public static void main(String[] args) {
        SomaImposto si = new SomaImposto();
        si.imposto(0, 100);
    }
}
