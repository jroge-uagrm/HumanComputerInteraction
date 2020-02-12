/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.text.StyleConstants;

/**
 *
 * @author jroge
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    List<JComponent> components;
    
    public Main() {
        initComponents();
        this.setSize(700, 500);
        addAllMyComponents();
        setVisibleAllComponents(false);
        jButton1.setVisible(true);
        setOriginalName();
        jToggleButton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int estado = e.getStateChange();
                if (estado == ItemEvent.SELECTED) {
                    jToggleButton1.setText("Selected");
                } else {
                    jToggleButton1.setText("No selected");
                }
            }
        });
        jCheckBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int estado = e.getStateChange();
                if (estado == ItemEvent.SELECTED) {
                    jCheckBox1.setText("Selected");
                } else {
                    jCheckBox1.setText("No selected");
                }
            }
        });
        jRadioButton1.addItemListener(new ItemListener() {
            
            public void itemStateChanged(ItemEvent e) {
                int estado = e.getStateChange();
                if (estado == ItemEvent.SELECTED) {
                    jRadioButton1.setText("Selected");
                } else {
                    jRadioButton1.setText("No selected");
                }
            }
        });
    }
    
    private void addAllMyComponents() {
        //Button, Toggle Button, Check Box,
        //Radio Button, Text Field, Text Area,
        //Password Field, Spinner
        components = new LinkedList<>();
        components.add(jButton1);
        components.add(jToggleButton1);
        components.add(jCheckBox1);
        components.add(jRadioButton1);
        components.add(jTextField1);
        components.add(jTextArea1);
        components.add(jPasswordField1);
        
        components.forEach((component) -> {
            component.setBackground(Color.decode("#aaaaa9"));
            component.setLocation(120, 29);
            component.setFont(new Font("Tahoma", Font.PLAIN, 16));
            myPanel.add(component);
        });
    }
    
    private void setVisibleAllComponents(boolean state) {
        components.forEach((component) -> {
            component.setVisible(state);
        });
    }
    
    private void setOriginalName() {
        switch (elements.getSelectedIndex()) {
            case 0: {
                jButton1.setText("jButton");
            }
            case 1: {
                jToggleButton1.setText("jToggleButton");
            }
            case 2: {
                jCheckBox1.setText("jCheckBox");
            }
            case 3: {
                jRadioButton1.setText("jRadioButton");
            }
            case 4: {
                jTextField1.setText("jTextField");
            }
            case 5: {
                jTextArea1.setText("jTextArea");
            }
            case 6: {
                jPasswordField1.setText("jPassswordField");
            }
        }
    }
    
    private void setNewName() {
        switch (elements.getSelectedIndex()) {
            case 0: {
                jButton1.setText(newName.getText());
            }
            case 1: {
                jToggleButton1.setText(newName.getText());
            }
            case 2: {
                jCheckBox1.setText(newName.getText());
            }
            case 3: {
                jRadioButton1.setText(newName.getText());
            }
            case 4: {
                jTextField1.setText(newName.getText());
            }
            case 5: {
                jTextArea1.setText(newName.getText());
            }
            case 6: {
                jPasswordField1.setText(newName.getText());
            }
        }
    }
    
    private void changeSize() {
        components.get(elements.getSelectedIndex()).setSize(
                (int) (((368 * spinner.getValue()) / 100) + 92),
                (int) (((104 * spinner.getValue()) / 100) + 26));
        components.get(elements.getSelectedIndex()).setLocation(
                130 - ((120 * spinner.getValue()) / 100),
                39 - ((29 * spinner.getValue()) / 100));
    }
    
    private void changeColor() {
        Color[] myColors = {Color.decode("#aaaaa9"), Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        components.get(elements.getSelectedIndex()).setBackground(myColors[colors.getSelectedIndex()]);
    }
    
    private void changeFont() {
        components.get(elements.getSelectedIndex()).setFont(new Font(fonts.getSelectedItem().toString(), Font.PLAIN, 16));
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
        elements = new javax.swing.JComboBox<String>();
        jPanel1 = new javax.swing.JPanel();
        tglBtn = new javax.swing.JToggleButton();
        btn = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        setOriginalName = new javax.swing.JButton();
        setThisName = new javax.swing.JButton();
        newName = new javax.swing.JTextField();
        spinner = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colors = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        fonts = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        myPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 78, 135));
        getContentPane().setLayout(null);

        elements.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Button", "Toggle Button", "Check Box", "Radio Button", "Text Field", "Text Area", "Password Field" }));
        elements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementsActionPerformed(evt);
            }
        });
        getContentPane().add(elements);
        elements.setBounds(12, 67, 177, 26);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(null);

        tglBtn.setText("jToggleButton1");
        jPanel1.add(tglBtn);
        tglBtn.setBounds(40, 60, 220, 70);

        btn.setText("jButton1");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel1.add(btn);
        btn.setBounds(-10, 0, 220, 70);

        jRadioButton1.setText("jRadioButton1");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(290, 20, 230, 70);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 40, 230, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(195, 67, 0, 0);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setLayout(null);

        setOriginalName.setText("Set Original Name");
        setOriginalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOriginalNameActionPerformed(evt);
            }
        });
        jPanel2.add(setOriginalName);
        setOriginalName.setBounds(12, 12, 130, 29);

        setThisName.setText("Set This Name:");
        setThisName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setThisNameActionPerformed(evt);
            }
        });
        jPanel2.add(setThisName);
        setThisName.setBounds(12, 59, 131, 29);
        jPanel2.add(newName);
        newName.setBounds(12, 100, 131, 26);

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });
        jPanel2.add(spinner);
        spinner.setBounds(250, 0, 133, 26);

        jLabel1.setText("Change Size");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(161, 17, 90, 20);

        jLabel2.setText("Change Color");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 70, 100, 20);

        colors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Red", "Blue", "Green", "Yellow" }));
        colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorsActionPerformed(evt);
            }
        });
        jPanel2.add(colors);
        colors.setBounds(260, 60, 120, 30);

        jLabel3.setText("Change Font");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(420, 20, 110, 20);

        fonts.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        fonts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahoma", "Arial", "Consolas", "Calibri", "Fira code" }));
        fonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontsActionPerformed(evt);
            }
        });
        jPanel2.add(fonts);
        fonts.setBounds(550, 10, 90, 26);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 230, 670, 140);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 170, 230, 70);

        myPanel.setBackground(new java.awt.Color(255, 255, 255));
        myPanel.setLayout(null);
        getContentPane().add(myPanel);
        myPanel.setBounds(230, 60, 450, 140);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 150, 93, 29);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(150, 110, 141, 29);

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(10, 110, 115, 29);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(10, 30, 156, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementsActionPerformed
        setVisibleAllComponents(false);
        components.get(elements.getSelectedIndex()).setVisible(true);
    }//GEN-LAST:event_elementsActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        jButton1.setText("Button Clicked!");
    }//GEN-LAST:event_btnActionPerformed

    private void setOriginalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setOriginalNameActionPerformed
        setOriginalName();
    }//GEN-LAST:event_setOriginalNameActionPerformed

    private void setThisNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setThisNameActionPerformed
        setNewName();
    }//GEN-LAST:event_setThisNameActionPerformed

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        changeSize();
    }//GEN-LAST:event_spinnerStateChanged

    private void colorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorsActionPerformed
        changeColor();
    }//GEN-LAST:event_colorsActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void fontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontsActionPerformed
        changeFont();
    }//GEN-LAST:event_fontsActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> colors;
    private javax.swing.JComboBox<String> elements;
    private javax.swing.JComboBox fonts;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel myPanel;
    private javax.swing.JTextField newName;
    private javax.swing.JButton setOriginalName;
    private javax.swing.JButton setThisName;
    private javax.swing.JSlider spinner;
    private javax.swing.JToggleButton tglBtn;
    // End of variables declaration//GEN-END:variables
}
