package visao;

public class FRMCentral extends javax.swing.JFrame {

    
    public FRMCentral() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMICadastroFerramenta = new javax.swing.JMenuItem();
        jMICadastroAmigo = new javax.swing.JMenuItem();
        jMIEmprestimoFerramenta = new javax.swing.JMenuItem();
        jMIConcluirEmprestimo = new javax.swing.JMenuItem();
        jMIGerenciamentoFerramentas = new javax.swing.JMenuItem();
        jMIGerenciamentoAmigos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIRelatorioAtivo = new javax.swing.JMenuItem();
        jMIRelatorioFerramenta = new javax.swing.JMenuItem();
        jMIEstatisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central de Cadastros");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Bem Vindo!");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMICadastroFerramenta.setText("Cadastro de Ferramentas");
        jMICadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastroFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadastroFerramenta);

        jMICadastroAmigo.setText("Cadastro de Amigos");
        jMICadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastroAmigoActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadastroAmigo);

        jMIEmprestimoFerramenta.setText("Empréstimo de Ferramentas");
        jMIEmprestimoFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmprestimoFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(jMIEmprestimoFerramenta);

        jMIConcluirEmprestimo.setText("Concluir Empréstimo");
        jMIConcluirEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConcluirEmprestimoActionPerformed(evt);
            }
        });
        jMenu1.add(jMIConcluirEmprestimo);

        jMIGerenciamentoFerramentas.setText("Gerenciamento de Ferramentas");
        jMIGerenciamentoFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciamentoFerramentasActionPerformed(evt);
            }
        });
        jMenu1.add(jMIGerenciamentoFerramentas);

        jMIGerenciamentoAmigos.setText("Gerenciamento de Amigos");
        jMIGerenciamentoAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciamentoAmigosActionPerformed(evt);
            }
        });
        jMenu1.add(jMIGerenciamentoAmigos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        jMIRelatorioAtivo.setText("Empréstimos Ativos");
        jMIRelatorioAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelatorioAtivoActionPerformed(evt);
            }
        });
        jMenu2.add(jMIRelatorioAtivo);

        jMIRelatorioFerramenta.setText("Ferramentas e Custos");
        jMIRelatorioFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelatorioFerramentaActionPerformed(evt);
            }
        });
        jMenu2.add(jMIRelatorioFerramenta);

        jMIEstatisticas.setText("Estatísticas");
        jMIEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEstatisticasActionPerformed(evt);
            }
        });
        jMenu2.add(jMIEstatisticas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFechar)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jBFechar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIEmprestimoFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmprestimoFerramentaActionPerformed
       FRMEmprestimoFerramenta emprestimoFerramenta = new FRMEmprestimoFerramenta();
    emprestimoFerramenta.setVisible(true);
    }//GEN-LAST:event_jMIEmprestimoFerramentaActionPerformed

    private void jMIRelatorioAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRelatorioAtivoActionPerformed
        FRMRelatorioAtivo relatorioAtivo = new FRMRelatorioAtivo();
    relatorioAtivo.setVisible(true);
    }//GEN-LAST:event_jMIRelatorioAtivoActionPerformed

    private void jMIRelatorioFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRelatorioFerramentaActionPerformed
       FRMRelatorioFerramenta relatorioFerramenta = new FRMRelatorioFerramenta();
       relatorioFerramenta.setVisible(true);
    }//GEN-LAST:event_jMIRelatorioFerramentaActionPerformed

    private void jMICadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastroFerramentaActionPerformed
     FRMCadastroFerramenta cadastroFerramenta = new FRMCadastroFerramenta();
    cadastroFerramenta.setVisible(true);
    }//GEN-LAST:event_jMICadastroFerramentaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     FRMGerenciamentoFerramenta gerenciamentoFerramenta = new FRMGerenciamentoFerramenta();
    gerenciamentoFerramenta.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMIGerenciamentoFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciamentoFerramentasActionPerformed
        FRMGerenciamentoFerramenta gerenciamentoFerramenta = new FRMGerenciamentoFerramenta ();
    gerenciamentoFerramenta.setVisible(true);
    }//GEN-LAST:event_jMIGerenciamentoFerramentasActionPerformed

    private void jMICadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastroAmigoActionPerformed
        FRMCadastroAmigo cadastroAmigo = new FRMCadastroAmigo ();
    cadastroAmigo.setVisible(true);
    }//GEN-LAST:event_jMICadastroAmigoActionPerformed

    private void jMIGerenciamentoAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciamentoAmigosActionPerformed
      FRMGerenciamentoAmigo gerenciamentoAmigo = new FRMGerenciamentoAmigo ();
    gerenciamentoAmigo.setVisible(true);
    }//GEN-LAST:event_jMIGerenciamentoAmigosActionPerformed

    private void jMIConcluirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConcluirEmprestimoActionPerformed
        FRMConcluir concluirEmprestimo = new FRMConcluir();
    concluirEmprestimo.setVisible(true);
    }//GEN-LAST:event_jMIConcluirEmprestimoActionPerformed

    private void jMIEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEstatisticasActionPerformed
      FRMEstatisticas estatisticas = new FRMEstatisticas();
    estatisticas.setVisible(true);
    }//GEN-LAST:event_jMIEstatisticasActionPerformed
       private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FRMCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMCentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMICadastroAmigo;
    private javax.swing.JMenuItem jMICadastroFerramenta;
    private javax.swing.JMenuItem jMIConcluirEmprestimo;
    private javax.swing.JMenuItem jMIEmprestimoFerramenta;
    private javax.swing.JMenuItem jMIEstatisticas;
    private javax.swing.JMenuItem jMIGerenciamentoAmigos;
    private javax.swing.JMenuItem jMIGerenciamentoFerramentas;
    private javax.swing.JMenuItem jMIRelatorioAtivo;
    private javax.swing.JMenuItem jMIRelatorioFerramenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}