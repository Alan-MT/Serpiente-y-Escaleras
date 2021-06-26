package principal;

import interfazGrafica.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Jugadores.Players;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class Partida {

    private Vector<Players> jugadores;
    private Registro rg;

    public Partida() {
        this.rg = new Registro();
        rg.setVisible(true);
        this.jugadores = new Vector<>();

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
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre válido.");
                }
            }

        });
        
        this.rg.getIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public void registrarJugador(String nombre, String apellido) {
        Players jugador = new Players(nombre, apellido);
        jugadores.add(jugador);
    }

}
