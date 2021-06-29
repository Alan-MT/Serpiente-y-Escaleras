/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import Archivos.LectorBinario;
import Jugadores.Players;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alanm
 */
public class Reporte extends javax.swing.JFrame {
    
        private LectorBinario lec;

    /**
     * Creates new form Reporte
     */
    public Reporte() {
        initComponents();
        this.lec = new LectorBinario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 153, 153,100));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "ID", "Partidas Ganadas", "Partidas Perdidas", "Partidas Jugadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 490, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Reporte de Jugadores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoreporte.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 519, 322));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void ReporteJugadoreas(Vector<Players> avn){
        DefaultTableModel d = (DefaultTableModel) getjTable1().getModel();
        d.setRowCount(0);
        for (Players av : avn) {
            Object[] row = new Object[7];
            row[0] = av.getNombre();
            row[1] = av.getApellido();
            row[2] = av.getId();
            row[3] = av.getPartidaG();
            row[4] = av.getPartidaP();
            row[5] = av.getPartidasJ();
            d.addRow(row);

        }
        getjTable1().setModel(d);

    }
    
    
    
        public static Players ontruirJUgador(String[] play) {
        Players aero = null;
        aero = new Players(play[0], play[1], Integer.parseInt(play[2]),Integer.parseInt(play[3]), Integer.parseInt(play[4]), Integer.parseInt(play[5]));
        return aero;

    }

    public JTable getjTable1() {
        return jTable1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
