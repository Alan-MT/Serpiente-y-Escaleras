package Archivos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class CargadorDeArchivos {

    public Vector<Aeropuerto> leerFichero(File archivo, JTextArea text) throws FileNotFoundException, IOException {
        Vector<Aeropuerto> Aero = new Vector<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] campos = separarCampos(linea);
            //pasamos el texto a objeto
            Aeropuerto aero = DepartamentoAdministracion.ContruirAeropuerto(campos);
            if (aero != null) {
                Aero.add(aero);
            }
            text.append("\n" + linea);
        }
        fr.close();
        return Aero;
    }

    private String[] separarCampos(String linea) {
        String inicioVehiculo = "(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }

  
}
