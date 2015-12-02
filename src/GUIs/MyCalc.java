/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author Rewdon
 */
public class MyCalc extends javax.swing.JFrame implements ActionListener {

    private Double firstNumber, secondNumber, ans, thirdNumber;
    static int operator = 0;
    DecimalFormat decfor = new DecimalFormat("##.##");// setting the decimal points

    /**
     * Creates new form MyCalc
     */
    public MyCalc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        key8 = new javax.swing.JButton();
        key7 = new javax.swing.JButton();
        key9 = new javax.swing.JButton();
        key4 = new javax.swing.JButton();
        key5 = new javax.swing.JButton();
        key6 = new javax.swing.JButton();
        key1 = new javax.swing.JButton();
        key2 = new javax.swing.JButton();
        key0 = new javax.swing.JButton();
        key3 = new javax.swing.JButton();
        keyDec = new javax.swing.JButton();
        keyAns = new javax.swing.JButton();
        keyP = new javax.swing.JButton();
        keyC = new javax.swing.JButton();
        keyD = new javax.swing.JButton();
        keyM = new javax.swing.JButton();
        keySign = new javax.swing.JButton();
        keyS = new javax.swing.JButton();
        keyA = new javax.swing.JButton();
        Display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        key8.setText("8");
        key8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key8ActionPerformed(evt);
            }
        });

        key7.setText("7");
        key7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key7ActionPerformed(evt);
            }
        });

        key9.setText("9");
        key9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key9ActionPerformed(evt);
            }
        });

        key4.setText("4");
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });

        key5.setText("5");
        key5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key5ActionPerformed(evt);
            }
        });

        key6.setText("6");
        key6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key6ActionPerformed(evt);
            }
        });

        key1.setText("1");
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });

        key2.setText("2");
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        key0.setText("0");
        key0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key0ActionPerformed(evt);
            }
        });

        key3.setText("3");
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });

        keyDec.setText(".");
        keyDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyDecActionPerformed(evt);
            }
        });

        keyAns.setText("=");
        keyAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyAnsActionPerformed(evt);
            }
        });

        keyP.setText("%");
        keyP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPActionPerformed(evt);
            }
        });

        keyC.setText("C");
        keyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyCActionPerformed(evt);
            }
        });

        keyD.setText("/");
        keyD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyDActionPerformed(evt);
            }
        });

        keyM.setText("*");
        keyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyMActionPerformed(evt);
            }
        });

        keySign.setText("+/-");
        keySign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keySignActionPerformed(evt);
            }
        });

        keyS.setText("-");
        keyS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keySActionPerformed(evt);
            }
        });

        keyA.setText("+");
        keyA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyAActionPerformed(evt);
            }
        });

        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(keySign, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(key0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(keyDec, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(keyA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(keyS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(keyAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(key4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(key5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(key6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keyD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(keyM, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(key7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(key8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(key9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keyP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(keyC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(key0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keyDec, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keySign, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(keyAns, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void key9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key9ActionPerformed
        // TODO add your handling code here:
        String a = key9.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key9ActionPerformed

    private void keySignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keySignActionPerformed
        // TODO add your handling code here:
        String a = Display.getText();
        Double b = Double.parseDouble(a);//converting string to double
        Double c = b * -1;
        Display.setText(decfor.format(c));
    }//GEN-LAST:event_keySignActionPerformed

    private void keyAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyAnsActionPerformed

        secondNumber = Double.parseDouble(Display.getText());

        switch (operator) {

            case 1:
                ans = firstNumber + secondNumber;
                break;
            case 2:
                ans = firstNumber - secondNumber;
                break;
            case 3:
                ans = firstNumber * secondNumber;
                break;
            case 4:
                ans = firstNumber / secondNumber;
                break;
        }

        Display.setText(decfor.format(ans));


    }//GEN-LAST:event_keyAnsActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void key7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key7ActionPerformed
        // TODO add your handling code here:

        String a = key7.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key7ActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        String a = key1.getText();
        Display.setText(Display.getText() + a);

// TODO add your handling code here:
    }//GEN-LAST:event_key1ActionPerformed

    private void key8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key8ActionPerformed
        // TODO add your handling code here:
        String a = key8.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key8ActionPerformed

    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        // TODO add your handling code here:
        String a = key4.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key4ActionPerformed

    private void key5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key5ActionPerformed
        // TODO add your handling code here:
        String a = key5.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key5ActionPerformed

    private void key6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key6ActionPerformed
        // TODO add your handling code here:
        String a = key6.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key6ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        String a = key2.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key2ActionPerformed

    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        // TODO add your handling code here:
        String a = key3.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key3ActionPerformed

    private void key0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key0ActionPerformed
        // TODO add your handling code here:
        String a = key0.getText();
        Display.setText(Display.getText() + a);
    }//GEN-LAST:event_key0ActionPerformed

    private void keyDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyDecActionPerformed
        // TODO add your handling code here:
        if (Display.getText().contains(".")) {
            
        } else {
            String a = keyDec.getText();
            Display.setText(Display.getText() + a);
        }
    }//GEN-LAST:event_keyDecActionPerformed

    private void keyCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyCActionPerformed
        // TODO add your handling code here:
        Display.setText(null);
    }//GEN-LAST:event_keyCActionPerformed

    private void keyAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyAActionPerformed
        firstNumber = Double.parseDouble(Display.getText());

        Display.setText("");
        operator = 1;

    }//GEN-LAST:event_keyAActionPerformed

    private void keySActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keySActionPerformed
        firstNumber = Double.parseDouble(Display.getText());

        Display.setText("");
        operator = 2;
    }//GEN-LAST:event_keySActionPerformed

    private void keyDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyDActionPerformed
        firstNumber = Double.parseDouble(Display.getText());

        Display.setText("");
        operator = 4;
    }//GEN-LAST:event_keyDActionPerformed

    private void keyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyMActionPerformed
        firstNumber = Double.parseDouble(Display.getText());

        Display.setText("");
        operator = 3;
    }//GEN-LAST:event_keyMActionPerformed

    private void keyPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyPActionPerformed
        thirdNumber = Double.parseDouble(Display.getText());
        Double per = firstNumber * thirdNumber / 100;
        Display.setText(decfor.format(per));
    }//GEN-LAST:event_keyPActionPerformed

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
            java.util.logging.Logger.getLogger(MyCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton key0;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JButton key5;
    private javax.swing.JButton key6;
    private javax.swing.JButton key7;
    private javax.swing.JButton key8;
    private javax.swing.JButton key9;
    private javax.swing.JButton keyA;
    private javax.swing.JButton keyAns;
    private javax.swing.JButton keyC;
    private javax.swing.JButton keyD;
    private javax.swing.JButton keyDec;
    private javax.swing.JButton keyM;
    private javax.swing.JButton keyP;
    private javax.swing.JButton keyS;
    private javax.swing.JButton keySign;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}