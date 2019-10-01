package View;

import Model.Movie;
import Controller.CadastrarMovieDAO;
import Controller.ControleBinario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;

public class MoviesV extends javax.swing.JFrame {
    
    Movie m = new Movie();
     CadastrarMovieDAO cadastroDao = new CadastrarMovieDAO();
    ControleBinario contrArq = new ControleBinario();
    
    public MoviesV() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    public void reloadTableFilmes(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        
        ArrayList<Movie> filmes = this.cadastroDao.getFilmesCadastrados();
        
        for(Movie movie : filmes){
            String assistido;
            
            if(movie.getFoiAssistido()){
                assistido = "Sim";
            }else{
                assistido = "Não";
            }
            dtm.addRow(new Object[]{movie.getTituloFilme(), movie.getGenero(), assistido});
        }
        
    }
    
    public void getFilmeAtual(){
        String nome = jTnomefilme.getText();
        String genero = String.valueOf(JCbgenero.getSelectedItem());
        boolean marcador = jCassistido1.isSelected();
            
        m = new Movie(nome, genero, marcador);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jBgravarTxt = new javax.swing.JButton();
        jBlerTxt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jCassistido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCassistido1ActionPerformed(evt);
            }
        });

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

        jBeditarf.setText("Editar");
        jBeditarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarfActionPerformed(evt);
            }
        });

        jBexcluirf.setForeground(new java.awt.Color(255, 0, 0));
        jBexcluirf.setText("Excluir");
        jBexcluirf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirfActionPerformed(evt);
            }
        });

        JCbgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comédia", "Romance", "Terror", "Suspense", "Sitcom", "Sci-fi", "Outros" }));
        JCbgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCbgeneroActionPerformed(evt);
            }
        });

        jLgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLgenero.setText("Gênero");

        jBgravarTxt.setText("gravacao.obj");
        jBgravarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarTxtActionPerformed(evt);
            }
        });

        jBlerTxt.setText("leitura.obj");
        jBlerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlerTxtActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Gênero", "Assistido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addGap(0, 286, Short.MAX_VALUE)
                        .addComponent(jLnomeprincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBadicionarf)
                            .addComponent(jLnomeFilme)
                            .addComponent(jTnomefilme, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addComponent(jBlerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jSeparator1)
                                .addGap(79, 79, 79))
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLgenero)
                                    .addComponent(JCbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBeditarf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBexcluirf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPprincipalLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCassistido1)
                                            .addComponent(jLmarcador))))
                                .addGap(29, 29, 29))
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addComponent(jBgravarTxt)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLnomeprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
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
                        .addComponent(jBgravarTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBlerTxt)
                        .addGap(20, 20, 20)))
                .addComponent(jLnomeprincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBadicionarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarfActionPerformed
        getFilmeAtual();
            
        this.cadastroDao.cadastrarFilme(m);
            
        reloadTableFilmes();
 
        jTnomefilme.setText("");
    }//GEN-LAST:event_jBadicionarfActionPerformed

    private void JCbgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCbgeneroActionPerformed
        JCbgenero.setVisible(true);
        int i = 0;
        
        try{
            jBadicionarf.getActionCommand();
            JCbgenero.getSelectedItem();

            //System.out.println(JCbgenero.getSelectedItem());
        }catch(Exception e){
            System.out.println("Gênero não encontrado.");
        }
        
    }//GEN-LAST:event_JCbgeneroActionPerformed

    private void jBeditarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarfActionPerformed
        getFilmeAtual();
        cadastroDao.atualizarFilme(m, jTable2.getSelectedRow());
        reloadTableFilmes();
    }//GEN-LAST:event_jBeditarfActionPerformed

    private void jTnomefilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomefilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomefilmeActionPerformed

    private void jCassistido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCassistido1ActionPerformed
        jCassistido1.setEnabled(true);
        int i = 0;
        
        try{
            jBadicionarf.getActionCommand();
            jCassistido1.isSelected();
            
            //jCassistido1.isSelected() == m.getFoiAssistido()

            //System.out.println("Selecionado");
        }catch(Exception e){
            System.out.println("Marcador não selecionado.");
        }

    }//GEN-LAST:event_jCassistido1ActionPerformed

    private void jBexcluirfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirfActionPerformed
        cadastroDao.excluirFilme(jTable2.getSelectedRow());
        reloadTableFilmes();
    }//GEN-LAST:event_jBexcluirfActionPerformed

    private void jBgravarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarTxtActionPerformed
        ArrayList<Movie> filmes = this.cadastroDao.getFilmesCadastrados();
        
        evt.getActionCommand();
        
        contrArq.escreverMovie(m);
        //contrArq.escreverMovie(filmes, rootPaneCheckingEnabled);
        
        
    }//GEN-LAST:event_jBgravarTxtActionPerformed

    private void jBlerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlerTxtActionPerformed
        String arquivo = null;

        try {
            contrArq.leitorMovie();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MoviesV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBlerTxtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCbgenero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBadicionarf;
    private javax.swing.JButton jBeditarf;
    private javax.swing.JButton jBexcluirf;
    private javax.swing.JButton jBgravarTxt;
    private javax.swing.JButton jBlerTxt;
    private javax.swing.JCheckBox jCassistido1;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLmarcador;
    private javax.swing.JLabel jLnomeFilme;
    private javax.swing.JLabel jLnomeprincipal;
    private javax.swing.JLabel jLnomeprincipal1;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTnomefilme;
    // End of variables declaration//GEN-END:variables
}
