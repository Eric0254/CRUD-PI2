/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.testepi;

import DAO.ProdutosDAO;
import com.mycompany.testepi.MODEL.Produtos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class CadProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadProdutos
     */
    public CadProdutos() {
        initComponents();
        btnGroup.add(radID);
        btnGroup.add(radTipo);
        btnAlterar.setEnabled(false); 
        btnAlterar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        radID = new javax.swing.JRadioButton();
        radTipo = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnAlterarProduto = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbProd = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Produtos");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Buscar produto:");

        jButton2.setText("Procurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        radID.setText("ID");

        radTipo.setText("Tipo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(radID)
                    .addComponent(radTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(radTipo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nome", "Preço", "Quantidade", "ID"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        jButton5.setText("Novo Cadastro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        jLabel1.setText("Nome:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Quantidade:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Produto:");

        cmbProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computador", "Headset", "Teclado", "Mouse", "HD" }));
        cmbProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Gerado:");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbProd, javax.swing.GroupLayout.Alignment.LEADING, 0, 454, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, jButton1});

        jTabbedPane1.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método de validaçaõ e cadastro o produto.
     * 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{ String tipoProduto = cmbProd.getSelectedItem().toString();
         String nome = txtNome.getText();
         int qtd = Integer.parseInt(txtQtd.getText());
            double preco = Double.parseDouble(txtPreco.getText().replace(",", "."));
        
            
            if (txtNome.getText().trim().equals("")){
                throw new Exception("Digite o nome do produto!");
            }     
      
        Produtos objProduto = new Produtos();
        objProduto.setNome(nome);
        objProduto.setPreco(preco);
        objProduto.setQuantidade(qtd);
        objProduto.setTipo(tipoProduto);
        
        
        ProdutosDAO.Cadastrar(objProduto);
        String id = String.valueOf(objProduto.getID());
        jLabel8.setText(id);
      }
        
        
      
        catch(NumberFormatException e){
            if (txtPreco.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "Digite o Preço do produto!");
            } if (txtQtd.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "Digite a quantidade do produto!");   
            } 
            JOptionPane.showMessageDialog(this, "Digite somente números!" );
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdActionPerformed
    
    /**
     * Método para ir a tela de cadastro
     * 
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jTabbedPane1.setEnabledAt(1, true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton5ActionPerformed
    
    /**
     * Método para excluir um produto
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int linhaSelecionada =  tabelaProduto.getSelectedRow();
        int id = Integer.parseInt(tabelaProduto.getValueAt(linhaSelecionada, 4).toString());
       if (linhaSelecionada >=0){
           DefaultTableModel modelo = (DefaultTableModel) tabelaProduto.getModel();
           ProdutosDAO.Excluir(id);
           modelo.removeRow(linhaSelecionada);
           
       }
       else{
           JOptionPane.showMessageDialog(this, "Selecione uma linha");
       }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * Método para buscar um produto através de dois tipos diferentes
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(btnGroup.getSelection()==null){
            JOptionPane.showMessageDialog(this, "Selecione uma das opções para procurar");
        }
        if(radID.isSelected()){
            if (txtBusca.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite o ID do produto para busca-lo");
            }
        BuscarProduto(txtBusca.getText());
        }
        
        if(radTipo.isSelected()){
            if (txtBusca.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Esse tipo de produto não existe");
            }
            BuscarProdutoTipo(txtBusca.getText());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * Método para puxar os dados da tabela, deixar o botão de alterar da tela de cadastros visível e ativo, e encaminhar para tela de alteração
     * @param evt 
     */
    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        int linhaSelecionada =  tabelaProduto.getSelectedRow();
        
        btnAlterar.setEnabled(true);
        btnAlterar.setVisible(true);
        try{
            if(linhaSelecionada>=0){
            jTabbedPane1.setSelectedIndex(1);
            cmbProd.setSelectedItem(tabelaProduto.getModel().getValueAt(linhaSelecionada, 0).toString());
            txtNome.setText(tabelaProduto.getModel().getValueAt(linhaSelecionada, 1).toString());
            txtPreco.setText(tabelaProduto.getModel().getValueAt(linhaSelecionada, 2).toString());
            txtQtd.setText(tabelaProduto.getModel().getValueAt(linhaSelecionada, 3).toString());
            jLabel8.setText(tabelaProduto.getModel().getValueAt(linhaSelecionada, 4).toString());
              
        }else{
                throw new Exception ("Selecione a linha");
            }}catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed
    
    /**
     * Método que altera os dados do produto, limpa os dados inseridos nos campos e desativa o botão de alterar
     * @param evt 
     */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarProduto();
        txtPreco.setText("");
        txtQtd.setText("");
        txtNome.setText("");
        jLabel8.setText("");
        desativarBotao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * Método para limpar os dados inseridos nos campos
     * @param evt 
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtPreco.setText("");
        txtQtd.setText("");
        txtNome.setText("");
        jLabel8.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed
    
    /**
     * Método para realizar a busca dos produtos através do ID
     * @param Busca Paramêtro que realiza a busca
     */
    public void BuscarProduto(String Busca){
        DefaultTableModel Modelo = (DefaultTableModel) tabelaProduto.getModel();
        Modelo.setNumRows(0);
        ProdutosDAO produtosDAO = new ProdutosDAO();
        
        for(Produtos pro : produtosDAO.BuscarProduto(Busca)){
            Modelo.addRow(new Object[]{
            
                pro.getTipo(),
                pro.getNome(),
                pro.getPreco(),
                pro.getQuantidade(),
                pro.getID()
        });
        }
    }
    
    /**
     * Método para realizar a busca dos produtos através do Tipo
     * @param Busca Paramêtro que realiza a busca
     */
    public void BuscarProdutoTipo(String Busca){
        DefaultTableModel Modelo = (DefaultTableModel) tabelaProduto.getModel();
        Modelo.setNumRows(0);
        ProdutosDAO produtosDAO = new ProdutosDAO();
        
        for(Produtos pro : produtosDAO.BuscarProdutoTipo(Busca)){
            Modelo.addRow(new Object[]{
            
                pro.getTipo(),
                pro.getNome(),
                pro.getPreco(),
                pro.getQuantidade(),
                pro.getID()
        });
        }
    }
    
    /**
     * Método para alterar os dados produtos
     */
    private void alterarProduto(){
        try{ String tipoProduto = cmbProd.getSelectedItem().toString();
         String nome = txtNome.getText();
         int qtd = Integer.parseInt(txtQtd.getText());
            double preco = Double.parseDouble(txtPreco.getText().replace(",", "."));
            String id1 = jLabel8.getText().toString();
            int id = Integer.parseInt(id1);

            if (txtNome.getText().trim().equals("")){
                throw new Exception("Digite o nome do produto!");
            }     
      
        Produtos objProduto = new Produtos();
        objProduto.setNome(nome);
        objProduto.setPreco(preco);
        objProduto.setQuantidade(qtd);
        objProduto.setTipo(tipoProduto);
        objProduto.setID(id);
        ProdutosDAO.Alterar(objProduto);
        
        }
        
        
      
        catch(NumberFormatException e){
            if (txtPreco.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "Digite o Preço do produto!");
            } if (txtQtd.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "Digite a quantidade do produto!");   
            } 
            JOptionPane.showMessageDialog(this, "Digite somente números!" );
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    /**
     * Método para desativar o botão alterar
     */
    public void desativarBotao(){
        btnAlterar.setEnabled(false);
        btnAlterar.setVisible(false); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radID;
    private javax.swing.JRadioButton radTipo;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}