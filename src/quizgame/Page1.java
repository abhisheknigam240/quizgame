/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author abhis
 */
public class Page1 extends javax.swing.JFrame {
    private Timer timer;
    private int secondsLeft;
    /**
     * Creates new form Page1
     */
    public Page1() {
        initComponents();
        secondsLeft = 30;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondsLeft--;
                if (secondsLeft >= 0) {
                    jLabel2.setText(secondsLeft + "");
                } else {
                    ((Timer)e.getSource()).stop();
                    TimeOut ob1 = new TimeOut();
                    ob1.setVisible(true);
                    dispose();
                }
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 40, 50));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton1");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 40, 40));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 50, 50));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton3");
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png"))); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 50, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("30");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 100, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/Page1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 850, 480));

        jButton1.setText("jButton1");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 383, 140, 60));

        jButton2.setText("jButton2");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 3, 100, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulbon.png")));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulbon.png")));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulbon.png")));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulbon.png")));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/bulboff.png")));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Back1 ob = new Back1();
        ob.setVisible(true);
        timer.stop();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            Correct ob = new Correct();
            ob.setVisible(true);
            timer.stop();
            this.setVisible(false);
        }
        else if(jRadioButton2.isSelected()||jRadioButton3.isSelected()||jRadioButton4.isSelected()){
            Incorrect obj = new Incorrect();
            obj.setVisible(true);
            timer.stop();
            this.setVisible(false);
        }
        else{
            NotSelected ob2 = new NotSelected();
            ob2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
