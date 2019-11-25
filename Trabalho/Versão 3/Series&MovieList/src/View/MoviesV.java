package View;

import Model.Movie;
import Controller.MovieController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MoviesV extends javax.swing.JFrame {
    
    Movie m = new Movie();
    MovieController cadastroDao = new MovieController();
    String oldTitle;
    
    public MoviesV() {
        initComponents();
        setLocationRelativeTo(this);
        reloadTableFilmes();
    }
    
    
    public void reloadTableFilmes(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        
        ArrayList<Movie> filmes = MovieController.getAllMoviesArray();
        
        for(Movie movie : filmes){
            String assistido;
            
            if(movie.getSeen()){
                assistido = "Sim";
            }else{
                assistido = "Não";
            }
            dtm.addRow(new Object[]{movie.getTitle(), movie.getGenre(), assistido});
        }
        
    }
   
    
    public void getFilmeAtual(){
        String title = jTnomefilme.getText();
        String genre = String.valueOf(JCbgenero.getSelectedItem());
        boolean seen = jCassistido1.isSelected();
            
        m = new Movie(title, genre, seen);
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
        jBexcluirf = new javax.swing.JButton();
        JCbgenero = new javax.swing.JComboBox();
        jLgenero = new javax.swing.JLabel();
        jBgravarTxt = new javax.swing.JButton();
        jBlerTxt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbEditar = new javax.swing.JButton();
        jbApagar = new javax.swing.JButton();

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

        jbEditar.setText("Editar Filme");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbApagar.setText("Apagar Filme");
        jbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPprincipalLayout = new javax.swing.GroupLayout(jPprincipal);
        jPprincipal.setLayout(jPprincipalLayout);
        jPprincipalLayout.setHorizontalGroup(
            jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLnomeprincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBadicionarf)
                            .addComponent(jLnomeFilme)
                            .addComponent(jTnomefilme, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLgenero)
                            .addComponent(JCbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBgravarTxt)
                            .addComponent(jBlerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBexcluirf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPprincipalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCassistido1)
                                    .addComponent(jLmarcador))))
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane3)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLnomeprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addGroup(jPprincipalLayout.createSequentialGroup()
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jbEditar)
                        .addGap(151, 151, 151)
                        .addComponent(jbApagar)))
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
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnomefilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCassistido1))
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBadicionarf)
                            .addComponent(jBexcluirf)))
                    .addGroup(jPprincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jBgravarTxt)))
                .addGap(18, 18, 18)
                .addComponent(jBlerTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLnomeprincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbApagar))
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBadicionarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarfActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que gostaria de cadastrar o Filme?", "Cadastro de Filme", JOptionPane.YES_NO_OPTION);
        
        if (op == 0) {
            getFilmeAtual();
            
            if(MovieController.newMovie(m))
                JOptionPane.showMessageDialog(null, "Filme "+m.getTitle()+" cadastrado com sucesso!", "Cadastro de Filme", JOptionPane.PLAIN_MESSAGE);
           
        }
        reloadTableFilmes();
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
        //cadastroDao.excluirFilme(jTable2.getSelectedRow());
        //reloadTableFilmes();
    }//GEN-LAST:event_jBexcluirfActionPerformed

    private void jBgravarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarTxtActionPerformed
        /*
        ArrayList<Movie> filmes = this.cadastroDao.getFilmesCadastrados();
        
        evt.getActionCommand();
        
        contrArq.escreverMovie(m);
        //contrArq.escreverMovie(filmes, rootPaneCheckingEnabled);
        */
        
    }//GEN-LAST:event_jBgravarTxtActionPerformed

    private void jBlerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlerTxtActionPerformed
        /*
        String arquivo = null;

        try {
            contrArq.leitorMovie();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MoviesV.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_jBlerTxtActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int row = jTable2.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser alterado.", "Selecionar registro", 0);
            return;
        }
       
        Object titleObj = jTable2.getValueAt(row, 0);
        oldTitle = titleObj.toString();
        new EditMovieV(oldTitle, this).setVisible(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApagarActionPerformed
        int row = jTable2.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser alterado.", "Selecionar registro", 0);
            return;
        }
       
        Object titleObj = jTable2.getValueAt(row, 0);
        oldTitle = titleObj.toString();
        
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que gostaria de apagar o Filme \""+oldTitle+"\"?", "Delete de Filme", JOptionPane.YES_NO_OPTION);
        
        if (op == 0) {
            getFilmeAtual();
            
            if(MovieController.deleteMovie(oldTitle))
                JOptionPane.showMessageDialog(null, "Filme \""+oldTitle+"\" apagado com sucesso!", "Cadastro de Filme", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Erro de delete.");
        }
        reloadTableFilmes();
    }//GEN-LAST:event_jbApagarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCbgenero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBadicionarf;
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
    private javax.swing.JButton jbApagar;
    private javax.swing.JButton jbEditar;
    // End of variables declaration//GEN-END:variables
}
