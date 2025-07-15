package Sala2_Daniel.Lista_08.ConvHora;

public class Conversor {
    public static int converterPara12Horas(int hora24, int minuto, char amPm) {
        if (hora24 == 0) {
            amPm = 'A';
            return 12;
        } else if (hora24 == 12) {
            amPm = 'P';
            return 12;
        } else if (hora24 > 12) {
            amPm = 'P';
            return hora24 - 12;
        } else {
            amPm = 'A';
            return hora24;
        }
    }
}
