/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero.Posibilidades;

import Jugadores.Players;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alanm
 */
public class subida extends Casilla {
    
    public subida(){
        
    }


    @Override
    public JLabel subirImagen(JLabel image, int fila, int columna) {
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/Subida.jpg")).getImage();
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        image.setIcon(imageIcon);
        return image;
    }

    @Override
    public void Accion(Players jugPlayers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
