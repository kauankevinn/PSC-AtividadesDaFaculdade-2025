package Sala2_Daniel.Lista_08.ConvHora;

public class Saida {
    public static void exibirHorario12Horas(int hora, int minuto, char amPm) {
        String periodo = (amPm == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora, minuto, periodo);
    }
}
