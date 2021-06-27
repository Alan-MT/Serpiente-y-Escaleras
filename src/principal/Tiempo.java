package principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tiempo extends Thread {

    private int minuto1, minuto2, segundo, decimal;
    private final JLabel hora;

    public Tiempo(JLabel hora) {
        this.minuto1 = 0;
        this.minuto2 = 0;
        this.segundo = 0;
        this.decimal = 0;
        this.hora = hora;
    }

    public void run() {
        try {

            for (double i = 0.1; i < 999; i++) {
                Thread.sleep(1000);
                if (segundo == 5 && decimal == 9) {
                    segundo = 0;
                    decimal = 0;
                    minuto2 += 1;
                    if (minuto2 == 9) {
                        minuto1 += 1;
                    }
                } else if (decimal == 9) {
                    decimal = 0;
                    segundo += 1;
                } else if (decimal >= 0) {
                    decimal += 1;
                }
                hora.setText(minuto1 + minuto2 + ":" + segundo + decimal);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public int getDecimal() {
        return decimal;
    }

    public int getMinuto1() {
        return minuto1;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getMinuto2() {
        return minuto2;
    }

}
