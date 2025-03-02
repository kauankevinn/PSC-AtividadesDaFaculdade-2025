import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int idade;
        double altura;
        String nome;

        System.out.println("Digite seu nome e sobrenome: ");
        nome = sc.nextLine();
        System.out.println("Olá "+nome);
        System.out.println("Poderia me informar sua idade e altura?");
        idade = sc.nextInt();
        altura = sc.nextDouble();
        System.out.println("Muito bem "+nome+"você tem "+idade+" anos e "+altura+"m de altura!");

    }
}
