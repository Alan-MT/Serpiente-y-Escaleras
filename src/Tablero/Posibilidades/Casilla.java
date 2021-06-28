/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero.Posibilidades;

import Jugadores.Players;
import javax.swing.JLabel;

/**
 *
 * @author alanm
 */
public abstract class Casilla {
    
    public abstract JLabel subirImagen(JLabel image,int fila, int columna);
    
    public abstract void Accion(Players jugPlayers);
    
}
