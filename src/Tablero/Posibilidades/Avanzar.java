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
import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class Avanzar extends Casilla {

    public Avanzar() {

    }
    /**
     * 
     * @param image
     * @param fila
     * @param columna
     * @return 
     */
    @Override
    public JLabel subirImagen(JLabel image, int fila, int columna) {
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/Avanzar.png")).getImage();
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        image.setIcon(imageIcon);
        return image;
    }

    @Override
    public void Accion(Players jugPlayers) {
        int random = (int)(Math.random()*(4-1)+1);
        jugPlayers.getFicha().aumentarPosicion(random);
        JOptionPane.showMessageDialog(null, "Avanzaste "+random+" Casillas");
    }

}
