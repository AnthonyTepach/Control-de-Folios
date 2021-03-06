/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.vistas;

import com.tepach.modelo.GetSet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author inspector
 */
public class V_Admin extends javax.swing.JFrame {

    /**
     * Creates new form V_Admin
     */
    private String user, id, tipo, msj;

    public V_Admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public V_Admin(GetSet a) {
        initComponents();
        this.setLocationRelativeTo(null);
        user = a.getUser();
        id = a.getId();
        tipo = a.getTipo();
        msj = user;
        jl_usuario.setText(msj);
        jl_titulo.setText(user + " - " + id);
        panel_escaner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_logo = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();
        jl_report = new javax.swing.JLabel();
        jl_user = new javax.swing.JLabel();
        jl_proyect = new javax.swing.JLabel();
        jl_client = new javax.swing.JLabel();
        jl_escan = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jp_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 143, 231));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(12, 79, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/InicioSe.png"))); // NOI18N
        jPanel1.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));

        jl_usuario.setFont(new java.awt.Font("Dubai Light", 0, 36)); // NOI18N
        jl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 272, 39));

        jl_report.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jl_report.setForeground(new java.awt.Color(240, 240, 240));
        jl_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/line-graph.png"))); // NOI18N
        jl_report.setText("  Reportes");
        jl_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_reportMouseExited(evt);
            }
        });
        jPanel1.add(jl_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 512, 242, 40));

        jl_user.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jl_user.setForeground(new java.awt.Color(240, 240, 240));
        jl_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/customer-service.png"))); // NOI18N
        jl_user.setText("  Usuarios");
        jl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_userMouseExited(evt);
            }
        });
        jPanel1.add(jl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 242, 40));

        jl_proyect.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jl_proyect.setForeground(new java.awt.Color(240, 240, 240));
        jl_proyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/check-box.png"))); // NOI18N
        jl_proyect.setText("  Proyectos");
        jl_proyect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_proyectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_proyectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_proyectMouseExited(evt);
            }
        });
        jPanel1.add(jl_proyect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 242, 40));

        jl_client.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jl_client.setForeground(new java.awt.Color(240, 240, 240));
        jl_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/luggage.png"))); // NOI18N
        jl_client.setText("  Clientes");
        jl_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_clientMouseExited(evt);
            }
        });
        jPanel1.add(jl_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 242, 40));

        jl_escan.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jl_escan.setForeground(new java.awt.Color(240, 240, 240));
        jl_escan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tepach/imagen/barcode-scanner(1).png"))); // NOI18N
        jl_escan.setText("  Escanerar");
        jl_escan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_escanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_escanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_escanMouseExited(evt);
            }
        });
        jPanel1.add(jl_escan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 242, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        jPanel4.setBackground(new java.awt.Color(24, 143, 231));
        jPanel4.setPreferredSize(new java.awt.Dimension(670, 525));

        jPanel5.setBackground(new java.awt.Color(12, 79, 135));

        jPanel2.setBackground(new java.awt.Color(224, 55, 55));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(141, 197, 239));

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jl_titulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 670, 20));

        javax.swing.GroupLayout jp_principalLayout = new javax.swing.GroupLayout(jp_principal);
        jp_principal.setLayout(jp_principalLayout);
        jp_principalLayout.setHorizontalGroup(
            jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jp_principalLayout.setVerticalGroup(
            jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jp_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 670, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_userMouseExited
        // TODO add your handling code here:
        jl_user.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        jl_user.setBackground(new Color(12, 79, 135));
        jl_user.setOpaque(true);
    }//GEN-LAST:event_jl_userMouseExited

    private void jl_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_userMouseEntered
        // TODO add your handling code here:
        jl_user.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_user.setBackground(new Color(24, 143, 231));
        jl_user.setOpaque(true);
    }//GEN-LAST:event_jl_userMouseEntered

    private void jl_proyectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_proyectMouseExited
        // TODO add your handling code here:
        jl_proyect.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_proyect.setBackground(new Color(12, 79, 135));
        jl_proyect.setOpaque(true);
    }//GEN-LAST:event_jl_proyectMouseExited

    private void jl_proyectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_proyectMouseEntered
        // TODO add your handling code here:
        jl_proyect.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_proyect.setBackground(new Color(24, 143, 231));
        jl_proyect.setOpaque(true);

    }//GEN-LAST:event_jl_proyectMouseEntered

    private void jl_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_clientMouseExited
        // TODO add your handling code here:
        jl_client.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_client.setBackground(new Color(12, 79, 135));
        jl_client.setOpaque(true);
    }//GEN-LAST:event_jl_clientMouseExited

    private void jl_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_clientMouseEntered
        // TODO add your handling code here:
        jl_client.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_client.setBackground(new Color(24, 143, 231));
        jl_client.setOpaque(true);
    }//GEN-LAST:event_jl_clientMouseEntered

    private void jl_reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_reportMouseExited
        // TODO add your handling code here:
        jl_report.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_report.setBackground(new Color(12, 79, 135));
        jl_report.setOpaque(true);
    }//GEN-LAST:event_jl_reportMouseExited

    private void jl_reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_reportMouseEntered
        // TODO add your handling code here:
        jl_report.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_report.setBackground(new Color(24, 143, 231));
        jl_report.setOpaque(true);
    }//GEN-LAST:event_jl_reportMouseEntered

    private void jl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_userMouseClicked
        // TODO add your handling code here:
        if (tipo.equals("admin")) {
            panel_usuarios();
        } else {
            JOptionPane.showMessageDialog(this, "Debes ser Administrador para gestionar a los usuarios", "Error de Autentificación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jl_userMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        //
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Validar", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            try {
                Thread.sleep(1000);
                System.exit(0);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error del Hilo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jl_proyectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_proyectMouseClicked
        // TODO add your handling code here:
        if (tipo.equals("admin") || tipo.equals("super")) {
            panel_proyecto();
        } else {
            JOptionPane.showMessageDialog(this, "Debes ser Administrador o Supervisor para gestionar a los proyectos", "Error de Autentificación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jl_proyectMouseClicked

    private void jl_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_reportMouseClicked

        if (tipo.equals("admin") || tipo.equals("super")) {
            panel_reportes();
        } else {
            JOptionPane.showMessageDialog(this, "Debes ser Administrador o Supervisor para gestionar a los reportes", "Error de Autentificación", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jl_reportMouseClicked

    private void jl_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_clientMouseClicked
        // TODO add your handling code here:
        if (tipo.equals("admin") || tipo.equals("super")) {
            panel_cliente();
        } else {
            JOptionPane.showMessageDialog(this, "Debes ser Administrador o Supervisor para gestionar a los clientes", "Error de Autentificación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jl_clientMouseClicked

    private void jl_escanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_escanMouseClicked
        // TODO add your handling code here:

        panel_escaner();
    }//GEN-LAST:event_jl_escanMouseClicked

    private void jl_escanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_escanMouseEntered
        // TODO add your handling code here:
        jl_escan.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_escan.setBackground(new Color(24, 143, 231));
        jl_escan.setOpaque(true);
    }//GEN-LAST:event_jl_escanMouseEntered

    private void jl_escanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_escanMouseExited
        // TODO add your handling code here:
        jl_escan.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        jl_escan.setBackground(new Color(12, 79, 135));
        jl_escan.setOpaque(true);
    }//GEN-LAST:event_jl_escanMouseExited

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
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jl_client;
    private javax.swing.JLabel jl_escan;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_proyect;
    private javax.swing.JLabel jl_report;
    public static javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_user;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JPanel jp_principal;
    // End of variables declaration//GEN-END:variables
public void panel_reportes() {
        jp_Reportes jpp = new jp_Reportes();
        jpp.setSize(670, 580);
        jpp.setLocation(0, 0);
        jp_principal.removeAll();
        jp_principal.add(jpp, BorderLayout.CENTER);
        jp_principal.revalidate();
        jp_principal.repaint();
    }

    public void panel_cliente() {
        jp_cliente jpp = new jp_cliente(getter());
        jpp.setSize(670, 580);
        jpp.setLocation(0, 0);
        jp_principal.removeAll();
        jp_principal.add(jpp, BorderLayout.CENTER);
        jp_principal.revalidate();
        jp_principal.repaint();
    }

    public void panel_escaner() {
        jp_escaner jpp = new jp_escaner();
        jpp.setSize(670, 580);
        jpp.setLocation(0, 0);
        jp_principal.removeAll();
        jp_principal.add(jpp, BorderLayout.CENTER);
        jp_principal.revalidate();
        jp_principal.repaint();
    }

    public void panel_proyecto() {
        jp_proyecto jpp = new jp_proyecto();
        jpp.setSize(670, 580);
        jpp.setLocation(0, 0);
        jp_principal.removeAll();
        jp_principal.add(jpp, BorderLayout.CENTER);
        jp_principal.revalidate();
        jp_principal.repaint();
    }

    public void panel_usuarios() {
        jp_usuarios jpp = new jp_usuarios();
        jpp.setSize(670, 580);
        jpp.setLocation(0, 0);
        jp_principal.removeAll();
        jp_principal.add(jpp, BorderLayout.CENTER);
        jp_principal.revalidate();
        jp_principal.repaint();
    }

    private GetSet getter() {
        GetSet gs = new GetSet();
        gs.setId(this.id);
        gs.setUser(this.user);
        gs.setTipo(this.tipo);
        return gs;
    }
}
