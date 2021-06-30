/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosBina;


import Jugadores.Players;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.Vector;

/**
 *
 * @author alanm
 */
public class LectorBinario {
     

    public void leerjugadoras(Vector<Players> jug) throws FileNotFoundException, IOException, ClassNotFoundException {
        String[] archivos = EscritorBinario.FILE_JUGADORES.list();
        for (int i = 0; i < archivos.length; i++) {
            ObjectInputStream lector;
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(EscritorBinario.FILE_JUGADORES + "/" + archivo));
            Players jg = (Players) lector.readObject();
            jug.add(jg);
            lector.close();
        }
      }
    
}
