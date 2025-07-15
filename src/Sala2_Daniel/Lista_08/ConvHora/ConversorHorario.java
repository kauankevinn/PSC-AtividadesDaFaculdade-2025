package Sala2_Daniel.Lista_08.ConvHora;

import java.util.Scanner;

public class ConversorHorario {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

                char continuar;

            do {

                System.out.print("Digite a hora (0 a 23): ");
                int hora24 = scanner.nextInt();

                System.out.print("Digite os minutos (0 a 59): ");
                int minuto = scanner.nextInt();

                // Variável para armazenar se é A.M. ou P.M.
                char amPm;

                int hora12 = Conversor.converterPara12Horas(hora24, minuto, hora24 >= 12 ? 'P' : 'A');

                Saida.exibirHorario12Horas(hora12, minuto, hora24 >= 12 ? 'P' : 'A');

                System.out.print("Deseja converter outro horário? (s/n): ");
                continuar = scanner.next().toLowerCase().charAt(0);

            } while (continuar == 's');

        }
    }
}
