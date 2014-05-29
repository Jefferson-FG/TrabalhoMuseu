

package museupoo.GUI;

import br.com.fatec.vo.EventoVO;
import br.com.fatec.vo.ObraVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import museupoo.Content;
import museupoo.UTIL.Util;

public class ManutencaoEventos extends javax.swing.JFrame {
    Content content;
    /**
     * Creates new form ContactEditor
     */
    public ManutencaoEventos() {
        initComponents();
        setFocusSequence();
      
            
    }

    ManutencaoEventos(Content content) {
        this();
        this.content = content;
        carregaEventos();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();
        bttAdicionarObras = new javax.swing.JButton();
        bttRemoverObras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDescicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTexto2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTexto1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        cntMaxEntradas = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        spnIni = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spnFinal = new javax.swing.JSpinner();
        bttCancelar = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("E-mail Contacts");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Eventos "));
        jPanel1.setName(""); // NOI18N

        tblEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descriçao", "Texto 1", "Texto 2", "Data Inicio", "Data Final", "Max Entradas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEventos);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Gerenciar e Adicionar Eventos"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Obras "));

        tblObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo"
            }
        ));
        jScrollPane4.setViewportView(tblObras);

        bttAdicionarObras.setText("Adicionar");
        bttAdicionarObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAdicionarObrasActionPerformed(evt);
            }
        });

        bttRemoverObras.setText("Atualizar");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .add(jPanel3Layout.createSequentialGroup()
                .add(0, 62, Short.MAX_VALUE)
                .add(bttRemoverObras)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bttAdicionarObras))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bttAdicionarObras)
                    .add(bttRemoverObras))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setText("Descriçao");

        jLabel5.setText("Texto 1");

        jLabel6.setText("Texto 2");

        txtTexto2.setColumns(20);
        txtTexto2.setRows(5);
        jScrollPane2.setViewportView(txtTexto2);

        txtTexto1.setColumns(20);
        txtTexto1.setRows(5);
        jScrollPane3.setViewportView(txtTexto1);

        jLabel7.setText("Maximo de Entradas");

        jLabel1.setText("Inicio:");

        spnIni.setModel(new javax.swing.SpinnerDateModel());

        jLabel2.setText("Final:");

        spnFinal.setModel(new javax.swing.SpinnerDateModel());

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 247, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jLabel5)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(12, 12, 12)
                                .add(jLabel6))))
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                            .add(jLabel7)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(cntMaxEntradas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(spnFinal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                            .add(jLabel3)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(txtDescicao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(36, 36, 36)
                            .add(jLabel1)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(spnIni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtDescicao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(spnIni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(cntMaxEntradas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel2)
                        .add(spnFinal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bttCancelar.setText("Cancelar");
        bttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarActionPerformed(evt);
            }
        });

        bttSalvar.setText("Salvar / Cadastrar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(142, 134, 134));
        jLabel9.setText("Selecione a obra na tabela para realizar alterações...");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel9)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(bttSalvar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bttCancelar)
                .add(15, 15, 15))
        );

        layout.linkSize(new java.awt.Component[] {bttCancelar, bttSalvar}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bttSalvar)
                    .add(bttCancelar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Dados Pessoais");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttAdicionarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAdicionarObrasActionPerformed
        // TODO add your handling code here:
        
        SelecionaObra o = new SelecionaObra(content);
        o.setVisible(true);
    }//GEN-LAST:event_bttAdicionarObrasActionPerformed

    private void tblEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEventosMouseClicked
        // TODO add your handling code here:
        
        int linha = tblEventos.getSelectedRow();//pegando linha selecionada
        EventoVO o = new EventoVO();
        o.setDescricao(tblEventos.getValueAt(linha , 0).toString());
        
        
        
        try {
            o = content.eventoDAO.buscar(o);
        } catch (Exception ex) {
            Logger.getLogger(ManutencaoObras.class.getName()).log(Level.SEVERE, null, ex);
            o = null;
        }
        
        
        if(o != null)
        {
            txtDescicao.setText(o.getDescricao());
            txtTexto1.setText(o.getTexto1());
            txtTexto2.setText(o.getTexto2());
            cntMaxEntradas.setValue(o.getMaxEntradas());
            
            buscarObrasExposicao();
        }
        
    }//GEN-LAST:event_tblEventosMouseClicked

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        // TODO add your handling code here:
        
        
         try{
        Date c1 = (Date)spnIni.getValue();
        Calendar cal1= Calendar.getInstance();
        cal1.set(c1.getYear()+1900,c1.getMonth(),c1.getDate());
        
        
        Date c2 = (Date)spnIni.getValue();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(c2.getYear()+1900,c2.getMonth(),c2.getDate());
        
        EventoVO vo = new EventoVO();
        
        vo.setDataInicio(cal1);
        vo.setDataFinal(cal2);
        vo.setDescricao(txtDescicao.getText());
        vo.setTexto1(txtTexto1.getText());
        vo.setTexto2(txtTexto2.getText());
        vo.setMaxEntradas((int) cntMaxEntradas.getValue());
        
        content.eventoDAO.alterar(vo);
        
        
        
            txtDescicao.setText("");
            txtTexto1.setText("");
            txtTexto2.setText("");
            cntMaxEntradas.setValue(0);
            
            carregaEventos();
        
        }
        catch(Exception ex)
        {
        //porra n guento mais...
           return;
        }
         
         
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_bttCancelarActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoEventos().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAdicionarObras;
    private javax.swing.JButton bttCancelar;
    private javax.swing.JButton bttRemoverObras;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JSpinner cntMaxEntradas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner spnFinal;
    private javax.swing.JSpinner spnIni;
    private javax.swing.JTable tblEventos;
    private javax.swing.JTable tblObras;
    private javax.swing.JTextField txtDescicao;
    private javax.swing.JTextArea txtTexto1;
    private javax.swing.JTextArea txtTexto2;
    // End of variables declaration//GEN-END:variables

    private void setFocusSequence() {
       
    
        
        
    }

    private void carregaEventos() {
        
        DefaultTableModel model =  (DefaultTableModel) tblEventos.getModel();
            List<EventoVO> lista = null;
        try {
              lista= content.eventoDAO.lista("");
        } catch (Exception ex) {
            Logger.getLogger(ManutencaoObras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(lista != null)
        for(EventoVO o : lista)
        {
            String[] s = new String[]{o.getDescricao(),o.getTexto1(),o.getTexto2(),Util.DateTimeString(o.getDataInicio()),Util.DateTimeString(o.getDataFinal()),o.getMaxEntradas()+""};
            model.addRow(s);
        }
        
        
    }

    private void buscarObrasExposicao() 
    {
       
           try {
          String  sql = "select Obra.* from Obra join Exposicao where Obra.idObra = Exposicao.idObra ";
        
        Statement st = null;
    //Contem o resultado de um SELECT
        ResultSet rs = null;
        st =content.bf.getConexao().createStatement();
        rs = st.executeQuery(sql);
        List<ObraVO> listaEvento = new ArrayList();
     
            if(rs.next())
            {
                //existe
                content.bf.getConexao().close();
                do
                    listaEvento.add(new ObraVO(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6)));
                while(rs.next()); 
                
                content.getEventoAtual().setObras((ArrayList<ObraVO>) listaEvento);
                
                atualizaObras();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManutencaoEventos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManutencaoEventos.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
    }

    private void atualizaObras() {
        
       ObraVO[] o = content.getEventoAtual().getObras();
        DefaultTableModel model =  (DefaultTableModel) tblObras.getModel();
        model.setRowCount(0);
        for(ObraVO ob : o)
        {
            String[] s = new String[]{ob.getDescricao(),ob.getIdTipo()+""};
            model.addRow(s);
        }
    }
    
}
