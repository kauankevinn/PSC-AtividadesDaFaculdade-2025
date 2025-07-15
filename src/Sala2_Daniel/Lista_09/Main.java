package Sala2_Daniel.Lista_09;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 20, "Branco", "65498432275", "Azuis");
        
        System.out.print(pessoa.getNome() + " ");
        pessoa.correr();
    }
}
