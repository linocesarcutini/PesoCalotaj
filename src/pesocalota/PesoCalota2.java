package pesocalota;

public class PesoCalota2 extends javax.swing.JFrame
{

    public PesoCalota2()
    {
        initComponents();
        setTitle("Peso Calota");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblDiamExterno = new javax.swing.JLabel();
        lblDiamFuro = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblRaioEsferico = new javax.swing.JLabel();
        txtDiamExterno = new javax.swing.JTextField();
        txtDiamFuro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtRaioEsferico = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTituloResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblDiamExterno.setText("Diametro Externo");

        lblDiamFuro.setText("Diametro Furo");

        lblAltura.setText("Altura");

        lblRaioEsferico.setText("Raio Esférico");

        txtDiamExterno.setPreferredSize(new java.awt.Dimension(80, 25));
        txtDiamExterno.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDiamExternoFocusGained(evt);
            }
        });

        txtDiamFuro.setPreferredSize(new java.awt.Dimension(80, 25));
        txtDiamFuro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDiamFuroFocusGained(evt);
            }
        });

        txtAltura.setPreferredSize(new java.awt.Dimension(80, 25));
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtAlturaFocusGained(evt);
            }
        });

        txtRaioEsferico.setPreferredSize(new java.awt.Dimension(80, 25));
        txtRaioEsferico.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtRaioEsfericoFocusGained(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.setPreferredSize(new java.awt.Dimension(85, 30));
        btnCalcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalcularActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(85, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTituloResultado.setText("Resultado");
        lblTituloResultado.setPreferredSize(new java.awt.Dimension(85, 25));

        lblResultado.setForeground(new java.awt.Color(51, 51, 255));
        lblResultado.setPreferredSize(new java.awt.Dimension(85, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lblTituloResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblDiamExterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblDiamFuro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtDiamFuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDiamExterno)
                                        .addComponent(txtDiamExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDiamFuro)
                                        .addComponent(txtDiamFuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAltura)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblRaioEsferico)
                                        .addComponent(txtRaioEsferico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTituloResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }

    private void txtDiamExternoFocusGained(java.awt.event.FocusEvent evt)
    {//GEN-FIRST:event_txtDiamExternoFocusGained
        txtDiamExterno.selectAll();
    }//GEN-LAST:event_txtDiamExternoFocusGained

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_btnCalcularActionPerformed
        CalculoPeso peso = new CalculoPeso(Float.parseFloat(this.txtDiamExterno.getText()),
                Float.parseFloat(this.txtDiamFuro.getText()),
                Float.parseFloat(this.txtAltura.getText()),
                Float.parseFloat(this.txtRaioEsferico.getText()));

        this.lblResultado.setText(String.valueOf(peso.GetPeso()) + "Kg");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtDiamFuroFocusGained(java.awt.event.FocusEvent evt)
    {//GEN-FIRST:event_txtDiamFuroFocusGained
        txtDiamFuro.selectAll();
    }//GEN-LAST:event_txtDiamFuroFocusGained

    private void txtAlturaFocusGained(java.awt.event.FocusEvent evt)
    {//GEN-FIRST:event_txtAlturaFocusGained
        txtAltura.selectAll();
    }//GEN-LAST:event_txtAlturaFocusGained

    private void txtRaioEsfericoFocusGained(java.awt.event.FocusEvent evt)
    {//GEN-FIRST:event_txtRaioEsfericoFocusGained
        txtRaioEsferico.selectAll();
    }//GEN-LAST:event_txtRaioEsfericoFocusGained

//    public static void main(String args[])
//    {
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        }
//        catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() ->
//        {
//            new PesoCalota().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblDiamExterno;
    private javax.swing.JLabel lblDiamFuro;
    private javax.swing.JLabel lblRaioEsferico;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTituloResultado;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtDiamExterno;
    private javax.swing.JTextField txtDiamFuro;
    private javax.swing.JTextField txtRaioEsferico;
    // End of variables declaration//GEN-END:variables
}
