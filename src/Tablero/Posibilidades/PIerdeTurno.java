package Tablero.Posibilidades;

import Jugadores.Players;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PIerdeTurno extends Casilla{

    public PIerdeTurno() {

    }


    @Override
    public JLabel subirImagen(JLabel image, int fila, int columna) {
                ///imagen origen
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/P1.jpg")).getImage();
//escala imagen
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
//asigna a componenente JLabel
        image.setIcon(imageIcon);
        //Icon perde = new javax.swing.ImageIcon(getClass().getResource("/Tablero/imagenesPosi/P1.jpg"));
        //pierde.setIcon(perde);

        return image;
    }


    @Override
    public void Accion(Players jugPlayers) {
        jugPlayers.setPenalizado(false);
        JOptionPane.showMessageDialog(null, "Perdiste un Turno");    
    }

}
