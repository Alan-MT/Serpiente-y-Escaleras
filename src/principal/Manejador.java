package principal;

import interfazGrafica.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Jugadores.Players;
import Tablero.Dado;
import Tablero.Ficha.Ficha;
import Tablero.Posibilidades.Avanzar;
import Tablero.Posibilidades.Casilla;
import Tablero.Posibilidades.PIerdeTurno;
import Tablero.Posibilidades.Retrocede;
import Tablero.Posibilidades.bajada;
import Tablero.Posibilidades.subida;
import Tablero.Tablero;
import interfazGrafica.Tablerolable;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class Manejador {

    private Vector<Players> jugadores;
    private Registro rg;
    private Tablerolable lab;
    private int contador = 0;
    private Dado dado;
    private Tiempo horario;
    private Tablero tab;
    private PIerdeTurno pt;
    private Avanzar p;
    private subida sub;
    private bajada ba;
    private Retrocede r;
    private Vector<Casilla> cas;

    public Manejador() {
        this.rg = new Registro();
        rg.setVisible(true);
        this.jugadores = new Vector<>();
        this.lab = new Tablerolable();
        this.dado = new Dado();
        this.horario = new Tiempo(lab.getHorario());
        this.tab = new Tablero(lab.getjPanel1());
        this.pt = new PIerdeTurno();
        this.p = new Avanzar();
        this.sub = new subida();
        this.ba = new bajada();
        this.r = new Retrocede();
        this.cas = new Vector<>();

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
                Collections.sort(jugadores);
                contadorJugadores();
                lab.tablaposicion(jugadores);
                rg.dispose();

            }
        });

        this.lab.getLanzar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
                dado.Dadod(lab.getDadoun(), lab.getDado2s());
                MatrizArchivos();
                siguienteJugador();
                lab.tablaposicion(jugadores);

            }
        });
        this.cas.add(p);
        this.cas.add(pt);
        this.cas.add(sub);
        this.cas.add(ba);
        this.cas.add(r);
    }

    public void siguienteJugador() {
        getJugadores().add(getJugadores().get(0));
        getJugadores().remove(0);
    }

    /**
     *
     * @param nombre
     * @param apellido Cuenta el maximo de jugadores para que nose pase del
     * maxmiom de jugaores
     */
    public void registrarJugador(String nombre, String apellido) {
        if (contador < 6) {
            Ficha ficha = new Ficha(ficha(contador));
            Players jugador = new Players(ficha, nombre, apellido);
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
            lab.setVisible(true);
            tab.crearMatriz(Integer.parseInt(rg.getNumFilas().getText()), Integer.parseInt(rg.getNumeroColum().getText()), pt, p, sub, ba, r);
            horario.start();
        } else {
            JOptionPane.showMessageDialog(null, "Debe se minimo 2 Jugadores");
        }
    }

    public void MatrizArchivos() {
        for (int i = 0; i < tab.getMatriz().length; i++) {
            for (int j = 0; j < tab.getMatriz()[0].length; j++) {
                System.err.println(tab.getMatriz()[i][j].getText());

            }
        }

        tab.getPanel().repaint();

    }

    public String ficha(int numero) {
        if (numero == 1) {
            return "Amarillo";
        } else if (numero == 2) {
            return "Rojo";
        } else if (numero == 3) {
            return "Azul";
        } else if (numero == 4) {
            return "Verde";
        }
        if (numero == 5) {
            return "Cafe";
        } else {
            return "Negro";
        }
    }

    private void jugar() {
        Players jugador = getJugadores().get(0);
        String posicion =""; 
        jugador.getFicha().aumentarPosicion(dado.Dadod(lab.getDadoun(), lab.getDado2s()));
        for (int i = 0; i < tab.getMatriz().length; i++) {
            for (int j = 0; j < tab.getMatriz()[0].length; j++) {
                if ((i+j) == jugador.getFicha().getPosicion()) {
                    posicion = tab.comparar(tab.getMatriz()[i][j].getText());
                    break;
                }
                

            }
        }
        switch(posicion){
            case "Turno" :
                p.Accion(jugador);
                break;
            case "subida":
                break;
            case "retorc":
                break;
            case "bajar":
                break;
            case "avanza":
                break;
            case "FIN":
                break;
            default:
                break;
        }
    }

    public Vector<Players> getJugadores() {
        return jugadores;
    }

    public Vector<Casilla> getCas() {
        return cas;
    }

}
