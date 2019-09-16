package View;

import Model.Movie;
import Controller.CadastrarMovieDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoviesV extends javax.swing.JFrame {
    
    Movie m = new Movie();
    CadastrarMovieDAO cadastroM = new CadastrarMovieDAO();
    
    
    public void LoadListaFilmes(){
    }
    
    public MoviesV() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPprincipal = new javax.swing.JPanel();
        jLnomeprincipal = new javax.swing.JLabel();
        jLnomeFilme = new javax.swing.JLabel();
        jLmarcador = new javax.swing.JLabel();
        jCassistido1 = new javax.swing.JCheckBox();
        jTnomefilme = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLnomeprincipal1 = new javax.swing.JLabel();
        jBadicionarf = new javax.swing.JButton();
        jBeditarf = new javax.swing.JButton();
        jBexcluirf = new javax.swing.JButton();
        JCbgenero = new javax.swing.JComboBox();
        jLgenero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPprincipal.setMaximumSize(new java.awt.Dimension(627, 345));
        jPprincipal.setPreferredSize(new java.awt.Dimension(627, 345));

        jLnomeprincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLnomeprincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLnomeprincipal.setText("Movie List");
        jLnomeprincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLnomeFilme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLnomeFilme.setText("Nome do Filme:");

        jLmarcador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLmarcador.setText("Marcador:");

        jCassistido1.setText("Assistido");

        jTnomefilme.setText("Filme");
        jTnomefilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomefilmeActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLnomeprincipal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLnomeprincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLnomeprincipal1.setText("Movie");
        jLnomeprincipal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBadicionarf.setText("Adicionar");
        jBadicionarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarfActionPerformed(evt);
            }
        });

        jBeditarf.setForeground(new java.awt.Color(240, 240, 240));
        jBeditarf.setText("Editar");
        jBeditarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarfActionPerformed(evt);
            }
        });

        jBexcluirf.setBackground(new java.awt.Color(255, 0, 0));
        jBexcluirf.setForeground(new java.awt.Color(255, 0, 0));
        jBexcluirf.setText("Excluir");

        JCbgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comédia", "Romance", "Terror", "Suspense", "Sitcom", "Sci-fi", "Outros" }));
        JCbgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCbgeneroActionPerformed(evt);
            }
        });

        jLgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLgenero.setText("Gênero");

        jButton1.setText("gravacao.txt");

        jButton2.setText("leitura.txt");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Filme", "Gênero", "Marcador"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPprincipalLayout = new javax.swing.GroupLayout(jPprincipal);
        jPprincipal.setLayout(jPprincipalLayout);
        jPprincipalLayout.setHorizontalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBadicionarf)
                            .addComponent(jLnomeFilme)
                            .addComponent(jTnomefilme, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPprincipalLayout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPprincipalLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1)))
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLgenero)
                                    .addComponent(JCbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBeditarf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBexcluirf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPprincipalLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCassistido1)
                                            .addComponent(jLmarcador))))
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                                .addComponent(jLnomeprincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(297, 297, 297))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                                .addComponent(jLnomeprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))))))
        );
        jPprincipalLayout.setVerticalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLnomeprincipal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLmarcador)
                            .addComponent(jLgenero)))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLnomeFilme)
                        .addGap(2, 2, 2)))
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnomefilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCassistido1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBadicionarf)
                            .addComponent(jBeditarf)
                            .addComponent(jBexcluirf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLnomeprincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBadicionarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarfActionPerformed
       jTnomefilme.setText("");
       jBadicionarf.setEnabled(true);
       
        try {
            cadastroM.cadastrarFilme(m);
            jBadicionarf.addActionListener(jTnomefilme.getAction());
        } catch (Exception ex) {
            Logger.getLogger(MoviesV.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_jBadicionarfActionPerformed

    private void JCbgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCbgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCbgeneroActionPerformed

    private void jBeditarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeditarfActionPerformed

    private void jTnomefilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomefilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomefilmeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoviesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviesV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCbgenero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBadicionarf;
    private javax.swing.JButton jBeditarf;
    private javax.swing.JButton jBexcluirf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCassistido1;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLmarcador;
    private javax.swing.JLabel jLnomeFilme;
    private javax.swing.JLabel jLnomeprincipal;
    private javax.swing.JLabel jLnomeprincipal1;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTnomefilme;
    // End of variables declaration//GEN-END:variables
}
