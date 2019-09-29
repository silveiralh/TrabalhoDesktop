package View;

import Model.Serie;
import Controller.CadastrarSerieDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Massallys - Rique
 */
public class SeriesV extends javax.swing.JFrame {

    Serie s = new Serie();
    CadastrarSerieDAO cadastroDao = new CadastrarSerieDAO();
    public SeriesV() {
        initComponents();
        setLocationRelativeTo(this);
    }
    

    public void reloadTableSeries(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTserielist.getModel();
        dtm.setRowCount(0);
        
        ArrayList<Serie> series = this.cadastroDao.getSeriesCadastradas();
        
        for(Serie serie : series){
            String assistindo;
            
            if(serie.getSendoAssistida()){
                assistindo = "Assistindo";
            }else if(serie.getFoiAssitida()){
                assistindo = "Assistida";
            }
            else{
                assistindo = "Não assistida";
            }
            
            dtm.addRow(new Object[]{serie.getTituloSerie(), serie.getTemporada(), assistindo});
        }
        
    }
    
    public void getSerieAtual(){
        String nome = jTnomes.getText();
        int temporada = Integer.parseInt( jTtemporada.getText());
        boolean marcador = jCassistindo.isSelected();
            
        s = new Serie(nome, temporada, marcador);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPprincipal = new javax.swing.JPanel();
        jLnomeprincipal = new javax.swing.JLabel();
        jLnomeSerie = new javax.swing.JLabel();
        jLmarcador = new javax.swing.JLabel();
        jCassistido = new javax.swing.JCheckBox();
        jCassistindo = new javax.swing.JCheckBox();
        jTnomes = new javax.swing.JTextField();
        jBadicionars = new javax.swing.JButton();
        jBeditars = new javax.swing.JButton();
        jBexcluirs = new javax.swing.JButton();
        jLnomeprincipal1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTserielist = new javax.swing.JTable();
        jBleituratxt = new javax.swing.JButton();
        jBgravacaotxt = new javax.swing.JButton();
        jTtemporada = new javax.swing.JTextField();
        jLnomeSerie1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPprincipal.setPreferredSize(new java.awt.Dimension(627, 345));

        jLnomeprincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLnomeprincipal.setText("Series");

        jLnomeSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLnomeSerie.setText("Nome da Serie:");

        jLmarcador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLmarcador.setText("Marcador:");

        jCassistido.setText("Assistido");
        jCassistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCassistidoActionPerformed(evt);
            }
        });

        jCassistindo.setText("Assistindo");
        jCassistindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCassistindoActionPerformed(evt);
            }
        });

        jTnomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomesActionPerformed(evt);
            }
        });

        jBadicionars.setText("Adicionar");
        jBadicionars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarsActionPerformed(evt);
            }
        });

        jBeditars.setText("Editar");
        jBeditars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarsActionPerformed(evt);
            }
        });

        jBexcluirs.setForeground(new java.awt.Color(255, 0, 0));
        jBexcluirs.setText("Excluir");
        jBexcluirs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirsActionPerformed(evt);
            }
        });

        jLnomeprincipal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLnomeprincipal1.setText("Series List");

        jTserielist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serie", "Temporada", "Marcador"
            }
        ));
        jTserielist.setPreferredSize(new java.awt.Dimension(300, 60));
        jScrollPane2.setViewportView(jTserielist);

        jBleituratxt.setText("leitura.txt");

        jBgravacaotxt.setText("gravacao.txt");

        jTtemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtemporadaActionPerformed(evt);
            }
        });

        jLnomeSerie1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLnomeSerie1.setText("Temporada:");

        javax.swing.GroupLayout jPprincipalLayout = new javax.swing.GroupLayout(jPprincipal);
        jPprincipal.setLayout(jPprincipalLayout);
        jPprincipalLayout.setHorizontalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCassistindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCassistido)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBadicionars)
                            .addComponent(jTnomes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLnomeSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addComponent(jLnomeSerie1)
                                .addGap(71, 71, 71)
                                .addComponent(jLmarcador))
                            .addComponent(jTtemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLnomeprincipal)
                                    .addComponent(jBeditars))
                                .addGap(98, 98, 98)
                                .addComponent(jBexcluirs)))
                        .addGap(51, 51, 51))))
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBgravacaotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLnomeprincipal1)
                            .addComponent(jBleituratxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPprincipalLayout.setVerticalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLnomeprincipal)
                .addGap(18, 18, 18)
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnomeSerie)
                    .addComponent(jLmarcador)
                    .addComponent(jLnomeSerie1))
                .addGap(14, 14, 14)
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCassistido)
                    .addComponent(jCassistindo)
                    .addComponent(jTnomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadicionars)
                    .addComponent(jBeditars)
                    .addComponent(jBexcluirs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jBgravacaotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBleituratxt)
                .addGap(16, 16, 16)
                .addComponent(jLnomeprincipal1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCassistindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCassistindoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCassistindoActionPerformed

    private void jBadicionarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarsActionPerformed
               
        getSerieAtual();
            
        this.cadastroDao.cadastrarSerie(s);
            
        reloadTableSeries();
 
        jTnomes.setText("");
    
    }//GEN-LAST:event_jBadicionarsActionPerformed

    private void jTtemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtemporadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtemporadaActionPerformed

    private void jTnomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomesActionPerformed

    private void jBeditarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarsActionPerformed
        getSerieAtual();
        cadastroDao.atualizarSerie(s, jTserielist.getSelectedRow());
        reloadTableSeries();
    }//GEN-LAST:event_jBeditarsActionPerformed

    private void jBexcluirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirsActionPerformed
        cadastroDao.excluirSerie(jTserielist.getSelectedRow());
        reloadTableSeries();
    }//GEN-LAST:event_jBexcluirsActionPerformed

    private void jCassistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCassistidoActionPerformed
        
    }//GEN-LAST:event_jCassistidoActionPerformed

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
            java.util.logging.Logger.getLogger(SeriesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeriesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeriesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeriesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeriesV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBadicionars;
    private javax.swing.JButton jBeditars;
    private javax.swing.JButton jBexcluirs;
    private javax.swing.JButton jBgravacaotxt;
    private javax.swing.JButton jBleituratxt;
    private javax.swing.JCheckBox jCassistido;
    private javax.swing.JCheckBox jCassistindo;
    private javax.swing.JLabel jLmarcador;
    private javax.swing.JLabel jLnomeSerie;
    private javax.swing.JLabel jLnomeSerie1;
    private javax.swing.JLabel jLnomeprincipal;
    private javax.swing.JLabel jLnomeprincipal1;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTnomes;
    private javax.swing.JTable jTserielist;
    private javax.swing.JTextField jTtemporada;
    // End of variables declaration//GEN-END:variables
}
