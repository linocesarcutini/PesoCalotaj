package pesocalota;

import java.awt.event.KeyEvent;
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
        lblpesoPreto = new javax.swing.JLabel();
        txtDiamExterno = new javax.swing.JTextField();
        txtDiamFuro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtRaioEsferico = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblTituloResultado1 = new javax.swing.JLabel();
        lblTituloResultado2 = new javax.swing.JLabel();
        lblpesoGalv = new javax.swing.JLabel();
        lblpesoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peso Calota");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

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
        lblTituloResultado.setText("Peso preto");
        lblTituloResultado.setPreferredSize(new java.awt.Dimension(85, 15));

        lblpesoPreto.setText("?");
        lblpesoPreto.setPreferredSize(new java.awt.Dimension(75, 20));

        txtDiamExterno.setPreferredSize(new java.awt.Dimension(75, 20));
        txtDiamExterno.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDiamExternoFocusGained(evt);
            }
        });
        txtDiamExterno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtDiamExternoKeyReleased(evt);
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
        txtDiamFuro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtDiamFuroKeyReleased(evt);
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
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtAlturaKeyReleased(evt);
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
        txtRaioEsferico.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtRaioEsfericoKeyReleased(evt);
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

        lblTituloResultado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloResultado1.setText("Peso Galv.");
        lblTituloResultado1.setPreferredSize(new java.awt.Dimension(85, 15));

        lblTituloResultado2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloResultado2.setText("Total");
        lblTituloResultado2.setPreferredSize(new java.awt.Dimension(85, 15));

        lblpesoGalv.setText("?");
        lblpesoGalv.setPreferredSize(new java.awt.Dimension(75, 20));

        lblpesoTotal.setText("?");
        lblpesoTotal.setPreferredSize(new java.awt.Dimension(75, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(lblDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiamFuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(lblTituloResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRaioEsferico, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiamFuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiamExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpesoPreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpesoGalv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpesoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpesoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpesoGalv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

        float pesoFinal = peso.GetPeso() + peso.PesoGalv();
        this.lblpesoPreto.setText(String.valueOf(peso.GetPeso() + " kg"));
        this.lblpesoGalv.setText(String.valueOf(peso.PesoGalv() + " kg"));
        this.lblpesoTotal.setText(String.valueOf(pesoFinal + " kg"));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtDiamExternoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDiamExternoFocusGained
    {//GEN-HEADEREND:event_txtDiamExternoFocusGained
        txtDiamExterno.selectAll();
    }//GEN-LAST:event_txtDiamExternoFocusGained

    private void txtDiamFuroFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDiamFuroFocusGained
    {//GEN-HEADEREND:event_txtDiamFuroFocusGained
        txtDiamFuro.selectAll();
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

    private void txtDiamExternoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDiamExternoKeyReleased
    {//GEN-HEADEREND:event_txtDiamExternoKeyReleased
        int key = evt.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER)
        {
            txtDiamFuro.requestFocus();
        }
    }//GEN-LAST:event_txtDiamExternoKeyReleased

    private void txtDiamFuroKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDiamFuroKeyReleased
    {//GEN-HEADEREND:event_txtDiamFuroKeyReleased
        int key = evt.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER)
        {
            txtAltura.requestFocus();
        }
    }//GEN-LAST:event_txtDiamFuroKeyReleased

    private void txtAlturaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAlturaKeyReleased
    {//GEN-HEADEREND:event_txtAlturaKeyReleased
        int key = evt.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER)
        {
            txtRaioEsferico.requestFocus();
        }
    }//GEN-LAST:event_txtAlturaKeyReleased

    private void txtRaioEsfericoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtRaioEsfericoKeyReleased
    {//GEN-HEADEREND:event_txtRaioEsfericoKeyReleased
        int key = evt.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER)
        {
            btnCalcular.requestFocus();
        }
    }//GEN-LAST:event_txtRaioEsfericoKeyReleased

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
    private javax.swing.JLabel lblTituloResultado;
    private javax.swing.JLabel lblTituloResultado1;
    private javax.swing.JLabel lblTituloResultado2;
    private javax.swing.JLabel lblpesoGalv;
    private javax.swing.JLabel lblpesoPreto;
    private javax.swing.JLabel lblpesoTotal;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtDiamExterno;
    private javax.swing.JTextField txtDiamFuro;
    private javax.swing.JTextField txtRaioEsferico;
    // End of variables declaration//GEN-END:variables
}
