package pesocalota;

import javax.swing.ImageIcon;

public class PesoCalota extends javax.swing.JFrame
{

    public PesoCalota()
    {
        initComponents();
        
        ImageIcon imagemTituloJanela = new ImageIcon("M:\\Projetos\\PROGRAMAS\\Brametal.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblDiamExterno = new javax.swing.JLabel();
        lblDiamFuro = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblRaioEsferico = new javax.swing.JLabel();
        lblTituloResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtDiamExterno = new javax.swing.JTextField();
        txtDiamFuro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtRaioEsferico = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peso Calota");

        lblDiamExterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiamExterno.setText("Diametro Externo");
        lblDiamExterno.setPreferredSize(new java.awt.Dimension(85, 15));

        lblDiamFuro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiamFuro.setText("Diametro Furo");
        lblDiamFuro.setPreferredSize(new java.awt.Dimension(85, 15));

        lblAltura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAltura.setText("Altura");
        lblAltura.setPreferredSize(new java.awt.Dimension(85, 15));

        lblRaioEsferico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRaioEsferico.setText("Raio Esférico");
        lblRaioEsferico.setPreferredSize(new java.awt.Dimension(85, 15));

        lblTituloResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloResultado.setText("Resultado");
        lblTituloResultado.setPreferredSize(new java.awt.Dimension(85, 15));

        lblResultado.setText("?");
        lblResultado.setPreferredSize(new java.awt.Dimension(75, 20));

        txtDiamExterno.setPreferredSize(new java.awt.Dimension(75, 20));
        txtDiamExterno.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDiamExternoFocusGained(evt);
            }
        });

        txtDiamFuro.setPreferredSize(new java.awt.Dimension(75, 20));
        txtDiamFuro.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDiamFuroFocusGained(evt);
            }
        });

        txtAltura.setPreferredSize(new java.awt.Dimension(75, 20));
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtAlturaFocusGained(evt);
            }
        });

        txtRaioEsferico.setPreferredSize(new java.awt.Dimension(75, 20));
        txtRaioEsferico.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtRaioEsfericoFocusGained(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.setPreferredSize(new java.awt.Dimension(85, 23));
        btnCalcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiamFuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiamFuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiamExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiamFuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiamFuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaioEsferico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRaioEsferico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalcularActionPerformed
    {//GEN-HEADEREND:event_btnCalcularActionPerformed
        CalculoPeso peso = new CalculoPeso(Float.parseFloat(this.txtDiamExterno.getText()),
                Float.parseFloat(this.txtDiamFuro.getText()),
                Float.parseFloat(this.txtAltura.getText()),
                Float.parseFloat(this.txtRaioEsferico.getText()));

        this.lblResultado.setText(String.valueOf(peso.GetPeso()) + "Kg");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtDiamExternoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDiamExternoFocusGained
    {//GEN-HEADEREND:event_txtDiamExternoFocusGained
        txtDiamExterno.selectAll();
    }//GEN-LAST:event_txtDiamExternoFocusGained

    private void txtDiamFuroFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDiamFuroFocusGained
    {//GEN-HEADEREND:event_txtDiamFuroFocusGained
        txtDiamExterno.selectAll();
    }//GEN-LAST:event_txtDiamFuroFocusGained

    private void txtAlturaFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtAlturaFocusGained
    {//GEN-HEADEREND:event_txtAlturaFocusGained
        txtAltura.selectAll();
    }//GEN-LAST:event_txtAlturaFocusGained

    private void txtRaioEsfericoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtRaioEsfericoFocusGained
    {//GEN-HEADEREND:event_txtRaioEsfericoFocusGained
        txtRaioEsferico.selectAll();
    }//GEN-LAST:event_txtRaioEsfericoFocusGained

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PesoCalota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PesoCalota().setVisible(true);
            }
        });
    }

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
