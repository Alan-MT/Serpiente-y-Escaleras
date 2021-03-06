package interfazGrafica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ArchivosBina.LectorBinario;
import Jugadores.Players;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.Manejador;

/**
 *
 * @author blue
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JRadioButton();
        reportes = new javax.swing.JRadioButton();
        salir = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 250, 210));

        iniciarPartida.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        iniciarPartida.setText("Iniciar Partida");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        reportes.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        reportes.setText("Reportes");
        getContentPane().add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        salir.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        salir.setText("Salir");
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        aceptar.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        jLabel2.setText("Bienvenidos a Escaleras y Serpientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
          seleccion();
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void seleccion(){
        if(iniciarPartida.isSelected()){
          Manejador pt = new Manejador();
          this.dispose();
       }else if(reportes.isSelected()){
         
           Reporte r = new Reporte();
            LectorBinario lec = new LectorBinario();
            Vector<Players> jug = new Vector<>();
       
            try {
                lec.leerjugadoras(jug);
                r.ReporteJugadoreas(jug);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
                

           
           r.setVisible(true);
            
        
        }else if(salir.isSelected()){
              //Se selecion?? acabar as?? que nos despedimos
	      JOptionPane.showMessageDialog(null, "Gracias por jugar. Hasta pronto");
	      System.exit(0); 
        
        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton iniciarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton reportes;
    private javax.swing.JRadioButton salir;
    // End of variables declaration//GEN-END:variables
}
