package Tablero.Posibilidades;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PIerdeTurno {

    public PIerdeTurno() {

    }

    public JLabel pierdeturno(JLabel pierde, int fila, int columna) {

        ///imagen origen
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/P1.jpg")).getImage();
//escala imagen
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
//asigna a componenente JLabel
        pierde.setIcon(imageIcon);
        //Icon perde = new javax.swing.ImageIcon(getClass().getResource("/Tablero/imagenesPosi/P1.jpg"));
        //pierde.setIcon(perde);

        return pierde;
    }

}
