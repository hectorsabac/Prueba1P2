/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Visual
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicializar = new javax.swing.JToggleButton();
        jugarFijo = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        addPalabras = new javax.swing.JToggleButton();
        jugarAleatorio = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu Ahorcado");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ahorcado Fijo:");

        inicializar.setText("Inicializar Palabra");
        inicializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicializarActionPerformed(evt);
            }
        });

        jugarFijo.setText("Jugar");
        jugarFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarFijoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ahorcado Aleatorio:");

        addPalabras.setText("Añadir palabras");
        addPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPalabrasActionPerformed(evt);
            }
        });

        jugarAleatorio.setText("Jugar");
        jugarAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarAleatorioActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(inicializar)
                    .addComponent(jugarFijo)
                    .addComponent(jLabel3)
                    .addComponent(jugarAleatorio)
                    .addComponent(salir)
                    .addComponent(addPalabras))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPalabras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicializar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jugarFijo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jugarAleatorio)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarFijoActionPerformed
        try {
            JuegoAhorcadoFijo juegoFijo = new JuegoAhorcadoFijo(FijoPalabras.palabraFija);
            juegoFijo.jugar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Fije una palabra primero.");
        }
    }//GEN-LAST:event_jugarFijoActionPerformed

    private void inicializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicializarActionPerformed
        FijoPalabras fijo = new FijoPalabras();
        
        setVisible(false);
        fijo.setVisible(true);
        fijo.setLocationRelativeTo(null);
    }//GEN-LAST:event_inicializarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jugarAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarAleatorioActionPerformed
        Random random = new Random();
        
        int rand = random.nextInt(AdminPalabrasSecretas.palabrasSecretas.size());
        
        JuegoAhorcadoAzar juegoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.palabrasSecretas);
        juegoAzar.jugar();
    }//GEN-LAST:event_jugarAleatorioActionPerformed

    
    
    private void addPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPalabrasActionPerformed
        addPalabras add = new addPalabras();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_addPalabrasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addPalabras;
    private javax.swing.JToggleButton inicializar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugarAleatorio;
    private javax.swing.JToggleButton jugarFijo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
