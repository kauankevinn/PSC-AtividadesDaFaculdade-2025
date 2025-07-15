package Sala2_Daniel.Lista_09;

public class Pessoa {
    private String nome;
    private int idade;
    private String cor;
    private String cpf;
    private String corDosOlhos;

    public Pessoa(String nome, int idade, String cor, String cpf, String corDosOlhos){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.cpf = cpf;
        this.corDosOlhos = corDosOlhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public void correr(){
        System.out.println("está correndo!");
    }

    public void pilotarMoto(){
        System.out.println("Vrum Vrum");
    }

    public void mexer(){
        System.out.println("está me mexendo!");
    }

    public void agredir(){
        System.out.println("está agredindo alguém...");
    }

    public void xingar(){
        System.out.println("Disse: Vai se #@!$%!");
    }
}
