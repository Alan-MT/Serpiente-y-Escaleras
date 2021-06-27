package principal;

import javax.swing.JOptionPane;

public class Tiempo extends Thread {

    private int minuto = 0;
    private int segundo = 0;
    private int decimal = 0;

    public Tiempo() {
        this.minuto = 0;
        this.segundo = 0;
        this.decimal = 0;
    }

    public void run() {
        try {
            for (double i = 0.1; i < 999; i++) {

                Thread.sleep(1000);
                if (segundo == 5 && decimal == 9) {
                    segundo = 0;
                    decimal = 0;
                    minuto += 1;
                } else if (decimal == 9) {
                    decimal = 0;
                    segundo += 1;
                } else if (decimal >= 0) {
                    decimal += 1;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public int getDecimal() {
        return decimal;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

}
