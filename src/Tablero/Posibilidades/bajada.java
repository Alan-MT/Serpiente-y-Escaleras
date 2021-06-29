package Tablero.Posibilidades;

import Jugadores.Players;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class bajada extends Casilla {
    
    public bajada(){
        
    }

    @Override
    public JLabel subirImagen(JLabel image, int fila, int columna) {
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/Serpiente.png")).getImage();
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        image.setIcon(imageIcon);
        return image;
    }

    @Override
    public void Accion(Players jugPlayers) {
        int random = (int)(Math.random()*(12-7)+7);
        jugPlayers.getFicha().restarPosicion(random);
        JOptionPane.showMessageDialog(null, "Bajaste");
    }

}
