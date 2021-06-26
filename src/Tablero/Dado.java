package Tablero;

import Jugadores.Players;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Dado {
    
    public Dado(){
        
    }
    
        public void Dadod(JLabel dadoun,JLabel dado2s) {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        Icon uno = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado1.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado2.png"));
        Icon tres = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado3.png"));
        Icon cua = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado4.png"));
        Icon cin = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado5.png"));
        Icon seis = new javax.swing.ImageIcon(getClass().getResource("/Dados imagenes/dado6.png"));

        switch (dado1) {
            case 1:
                dadoun.setIcon(uno);
                break;
            case 2:
                dadoun.setIcon(dos);
                break;
            case 3:
                dadoun.setIcon(tres);
                break;
            case 4:
                dadoun.setIcon(cua);
                break;
            case 5:
                dadoun.setIcon(cin);
                break;
            case 6:
                dadoun.setIcon(seis);
                break;
        }
        switch (dado2) {
            case 1:
                dado2s.setIcon(uno);
                break;
            case 2:
                dado2s.setIcon(dos);
                break;
            case 3:
                dado2s.setIcon(tres);
                break;
            case 4:
                dado2s.setIcon(cua);
                break;
            case 5:
                dado2s.setIcon(cin);
                break;
            case 6:
                dado2s.setIcon(seis);
                break;
        }

        int resultado = dado1 + dado2;
        JOptionPane.showMessageDialog(null, " Resultado" + resultado);

    }
}
