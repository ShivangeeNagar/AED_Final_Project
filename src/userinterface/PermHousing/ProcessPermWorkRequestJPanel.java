/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PermHousing;

import Business.EcoSystem;
import userinterface.LabAssistantRole.*;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PermHousingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessPermWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest labrequest;
    PermHousingRequest permHousingRequest;
    EcoSystem System;
    //int method = 0;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
     public ProcessPermWorkRequestJPanel(JPanel userProcessContainer, PermHousingRequest permHousingRequest,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.permHousingRequest = permHousingRequest;
        this.System = system;
    
        //method=2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(255, 204, 51));
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 112, -1, -1));

        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 48, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 44, 169, -1));

        backJButton.setBackground(new java.awt.Color(20, 53, 94));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 112, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PermHousingWorkAreaJPanel dwjp = (PermHousingWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
            permHousingRequest.setComment(resultJTextField.getText());
            permHousingRequest.setStatus("Accepted");
            permHousingRequest.setAvailibility(1);
            JOptionPane.showMessageDialog(null, "House Assigned to veteran" + permHousingRequest.getSender(), "Information", JOptionPane.INFORMATION_MESSAGE);
            resultJTextField.setText("");
        

           
            
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
