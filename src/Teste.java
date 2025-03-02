import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n1, n2;
        int soma, sub, mult;
        float div;

        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println("A soma dos núemros é: "+soma );
        System.out.println("A subtração dos núemros é: "+sub );
        System.out.println("A multiplicação dos núemros é: "+mult );
        System.out.println("A divisão dos núemros é: "+div );

    }

}
