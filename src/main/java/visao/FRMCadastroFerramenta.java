
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FRMCadastroFerramenta extends JFrame {

    private JButton jBGerenciamento;

    public FRMCadastroFerramenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLFerramenta = new javax.swing.JLabel();
        jLMarca = new javax.swing.JLabel();
        jLCustoAquisição = new javax.swing.JLabel();
        jTFFerramenta = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFCusto = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBGerenciamento = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Ferramenta");

        jLFerramenta.setText("Ferramenta");

        jLMarca.setText("Marca");

        jLCustoAquisição.setText("Custo de aquisição");

        jTFFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFerramentaActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Confirmar");

        jBGerenciamento.setText("Gerenciamneto de Ferramentas");

        jBVoltar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLFerramenta)
                                .addComponent(jLMarca)
                                .addComponent(jLCustoAquisição)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBGerenciamento)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBVoltar))
                                .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFMarca)
                            .addComponent(jTFFerramenta))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLFerramenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLCustoAquisição)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBGerenciamento)
                    .addComponent(jBVoltar))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTFFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFerramentaActionPerformed
}
private void jBGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {
    // Cria uma nova instância de FRMGerenciamentoFerramenta
  
    FRMCadastroFerramenta gerenciamentoFerramentas = new FRMCadastroFerramenta();
    
    // Define a operação padrão ao fechar a janela (opcional)
    gerenciamentoFerramentas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    // Torna a janela visível
    gerenciamentoFerramentas.setVisible(true);
}

private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {
    // Fecha a janela atual
    this.dispose();
}

    }//GEN-LAST:event_jTFFerramentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBGerenciamento;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLCustoAquisição;
    private javax.swing.JLabel jLFerramenta;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFCusto;
    private javax.swing.JTextField jTFFerramenta;
    private javax.swing.JTextField jTFMarca;
    // End of variables declaration//GEN-END:variables

