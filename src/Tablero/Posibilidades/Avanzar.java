/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero.Posibilidades;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alanm
 */
public class Avanzar {

    public Avanzar() {

    }

    public JLabel Avanzar(JLabel avanza, int fila, int columna) {
        //imagen origen
        Image img = new ImageIcon(getClass().getResource("/Tablero/imagenesPosi/Avanzar.png")).getImage();
//escala imagen
        Image newimg = img.getScaledInstance(fila, columna, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
//asigna a componenente JLabel
        avanza.setIcon(imageIcon);
       // Icon perde = new javax.swing.ImageIcon(getClass().getResource("/Tablero/imagenesPosi/Avanzar.png"));
       // avanza.setIcon(perde);
        return avanza;
    }

}
