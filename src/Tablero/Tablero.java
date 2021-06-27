package Tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alanm
 */
public class Tablero {

    JPanel panel;
    JLabel[][] matriz;

    public Tablero(JPanel panel) {
        this.panel = panel;
    }

    public void crearMatriz(int fila, int columna) {
        panel.removeAll();
        matriz = new JLabel[fila][columna];
        fila = 600 / fila;
        columna = 300 / columna;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                JLabel lable = new JLabel("lbl1" + String.valueOf(i + 1) + ", " + String.valueOf(i + 1));
                lable.setBounds(fila * i, columna * j, fila, columna);
                lable.setForeground(Color.blue);
                matriz[i][j] = lable;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panel.add(matriz[i][j]);
            }
        }
        panel.repaint();
    }
    
}
