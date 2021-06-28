package Tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Tablero.Posibilidades.*;

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

                switch ((int) (Math.random() * 3)) {
                    case 0:
                        JLabel vacio = new JLabel();
                        vacio.setBounds(fila * i, columna * j, fila, columna);
                        vacio.setOpaque(true);
                        vacio.setBackground(Color.BLACK);
                        matriz[i][j] = vacio;
                        break;
                    case 1:
                        JLabel lables = new JLabel();
                        PIerdeTurno pt = new PIerdeTurno();
                        pt.pierdeturno(lables, fila, columna);
                        lables.setBounds(fila * i, columna * j, fila, columna);
                        matriz[i][j] = lables;
                        break;
                    case 2:
                        JLabel avanza = new JLabel();
                        Avanzar p = new Avanzar();
                        p.Avanzar(avanza, fila, columna);
                        avanza.setBounds(fila * i, columna * j, fila, columna);
                        matriz[i][j] = avanza;
                        break;
                    case 3:
                        break;

                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panel.add(matriz[i][j]);
            }
        }
        panel.repaint();
    }

    public void MatrizArchivos() {

    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel[][] getMatriz() {
        return matriz;
    }

    
}
