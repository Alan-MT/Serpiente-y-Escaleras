package principal;

import interfazGrafica.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Jugadores.Players;
import Tablero.Dado;
import Tablero.Tablero;
import interfazGrafica.Tablerolable;
import static java.awt.Frame.NORMAL;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class Partida {

    private Vector<Players> jugadores;
    private Registro rg;
    private Tablerolable lab;
    private int contador = 0;
    private Dado dado;

    public Partida() {
        this.rg = new Registro();
        rg.setVisible(true);
        this.jugadores = new Vector<>();
        this.lab = new Tablerolable();
        this.dado = new Dado();

        this.rg.getIngresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = rg.getNombre().getText();
                    String apellido = rg.getApellido().getText();
                    if (nombre.length() > 1 && apellido.length() > 1) {
                        registrarJugador(nombre, apellido);
                        rg.mostrarJugadoresEnTabla(jugadores);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingresa un nombre Valido ");
                    }
                    rg.getNombre().setText("");
                    rg.getNombre().requestFocus();
                    rg.getApellido().setText("");
                    rg.getApellido().requestFocus();
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre vÃ¡lido.");
                }
            }

        });

        this.rg.getIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorJugadores();
            }
        });

        this.lab.getLanzar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dado.Dadod(lab.getDadoun(), lab.getDado2s());
            }
        });
    }

    /**
     *
     * @param nombre
     * @param apellido Cuenta el maximo de jugadores para que nose pase del
     * maxmiom de jugaores
     */
    public void registrarJugador(String nombre, String apellido) {
        if (contador < 6) {
            Players jugador = new Players(nombre, apellido);
            jugadores.add(jugador);
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "el maximo de jugadores es 6");
        }
    }

    /**
     * Cuanta los minimos de jugadores para inicializar el tablero
     */
    public void contadorJugadores() {
        if (contador > 1) {
            Tablero tab = new Tablero(lab.getjPanel1());
            tab.crearMatriz(Integer.parseInt(rg.getNumFilas().getText()), Integer.parseInt(rg.getNumeroColum().getText()));
            lab.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe se minimo 2 Jugadores");
        }
    }

}
