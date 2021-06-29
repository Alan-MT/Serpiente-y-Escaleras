package ArchivosBina;


import Jugadores.Players;
import interfazGrafica.Reporte;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JTextArea;

public class CargadorDeArchivos {

    public Vector<Players> leerFichero(File archivo, JTextArea text) throws FileNotFoundException, IOException {
        Vector<Players> jug = new Vector<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] campos = separarCampos(linea);
            //pasamos el texto a objeto
            Players aero = Reporte.ontruirJUgador(campos);
            if (aero != null) {
                jug.add(aero);
            }
            text.append("\n" + linea);
        }
        fr.close();
        return jug;
    }

    private String[] separarCampos(String linea) {
        String inicioVehiculo = "(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }

  
}
