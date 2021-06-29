/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;


import Jugadores.Players;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author alanm
 */
public class EscritorBinario {

    public static final File FILE_JUGADORES = new File("C:\\Users\\alanm\\Documents\\NetBeansProjects\\Practica4\\src\\Archivos\\Jugadores");

    public void guardarJugadores(Vector<Players> jug) throws IOException, FileNotFoundException {
        FileOutputStream fileOutput;
        ObjectOutputStream salida;
        for (Players play : jug) {
            fileOutput = new FileOutputStream(FILE_JUGADORES + "/" +play.getId()+""+ play.getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(play);
            salida.close();
        }
    }


}