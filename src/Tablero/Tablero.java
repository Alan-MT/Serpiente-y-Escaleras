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
        int fi = fila;
        int col = columna;
        fila = 600 / fila;
        columna = 300 / columna;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == 0) {
                    JLabel vacio4 = new JLabel("INICIO", JLabel.CENTER);
                    vacio4.setBounds(fila * i, columna * j, fila, columna);
                    vacio4.setOpaque(true);
                    vacio4.setForeground(Color.red);
                    vacio4.setBackground(Color.WHITE);
                    matriz[i][j] = vacio4;
                } else if (j+1 == matriz[0].length && i+1  == matriz.length) {
                    JLabel vacio5 = new JLabel("FIN", JLabel.CENTER);
                    vacio5.setBounds(fila * i, columna * j, fila, columna);
                    vacio5.setOpaque(true);
                    vacio5.setForeground(Color.red);
                    vacio5.setBackground(Color.WHITE);
                    matriz[i][j] = vacio5;

                } else {
                    switch ((int) (Math.random() * 8)) {
                        case 0:
                            JLabel vacio = new JLabel();
                            vacio.setBounds(fila * i, columna * j, fila, columna);
                            vacio.setOpaque(true);
                            vacio.setBackground(Color.PINK);
                            matriz[i][j] = vacio;
                            break;
                        case 1:
                            JLabel lables = new JLabel();
                            PIerdeTurno pt = new PIerdeTurno();
                            pt.subirImagen(lables, fila, columna);
                            lables.setBounds(fila * i, columna * j, fila, columna);
                            matriz[i][j] = lables;
                            break;
                        case 2:
                            JLabel avanza = new JLabel();
                            Avanzar p = new Avanzar();
                            p.subirImagen(avanza, fila, columna);
                            avanza.setBounds(fila * i, columna * j, fila, columna);
                            matriz[i][j] = avanza;
                            break;
                        case 3:
                            JLabel subida = new JLabel();
                            subida sub = new subida();
                            sub.subirImagen(subida, fila, columna);
                            subida.setBounds(fila * i, columna * j, fila, columna);
                            matriz[i][j] = subida;
                            break;
                        case 4:
                            JLabel bajar = new JLabel();
                            bajada ba = new bajada();
                            ba.subirImagen(bajar, fila, columna);
                            bajar.setBounds(fila * i, columna * j, fila, columna);
                            matriz[i][j] = bajar;
                            break;
                        case 5:
                            JLabel retorc = new JLabel();
                            Retrocede r = new Retrocede();
                            r.subirImagen(retorc, fila, columna);
                            retorc.setBounds(fila * i, columna * j, fila, columna);
                            matriz[i][j] = retorc;
                            break;
                        case 6:
                            JLabel vacio1 = new JLabel();
                            vacio1.setBounds(fila * i, columna * j, fila, columna);
                            vacio1.setOpaque(true);
                            vacio1.setBackground(Color.YELLOW);
                            matriz[i][j] = vacio1;
                            break;
                        case 7:
                            JLabel vacio2 = new JLabel();
                            vacio2.setBounds(fila * i, columna * j, fila, columna);
                            vacio2.setOpaque(true);
                            vacio2.setBackground(Color.GREEN);
                            matriz[i][j] = vacio2;
                            break;
                        case 8:
                            JLabel vacio3 = new JLabel();
                            vacio3.setBounds(fila * i, columna * j, fila, columna);
                            vacio3.setOpaque(true);
                            vacio3.setBackground(Color.BLUE);
                            matriz[i][j] = vacio3;
                            break;

                    }
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
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panel.add(matriz[i][j]);
            }
        }

        panel.repaint();

    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel[][] getMatriz() {
        return matriz;
    }

}
