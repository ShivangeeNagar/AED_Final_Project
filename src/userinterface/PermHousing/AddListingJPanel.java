/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PermHousing;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Listings.HouseListing;
import Business.Listings.HouseListingDirectory;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.UserAccount.UserAccount;
import Business.Veteran.VeteranDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.TempHousingRole.TempHousingWorkAreaJPanel;

/**
 *
 * @author akshatananjappa
 */
public class AddListingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddListingJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private final PermHousingOrganization permHousingOrganization;
    private VeteranDirectory vd;
    private Enterprise enterprise;
    //private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    HouseListingDirectory hsd ;
    public AddListingJPanel(JPanel userProcessContainer, UserAccount account, Organization permHousingOrganization, Enterprise enterprise, VeteranDirectory vd,EcoSystem business) 
 {
        initComponents();
        //hsd = new HouseListingDirectory();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.permHousingOrganization = (PermHousingOrganization) permHousingOrganization;
        this.enterprise = enterprise;
        this.vd = vd;
 }
   public HouseListingDirectory getDir() {
        return hsd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDoorNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPinCode = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 87, -1, -1));
        add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 270, -1));

        jLabel2.setText("Street Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));
        add(txtStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, -1));

        jLabel3.setText("Door Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));
        add(txtDoorNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 270, -1));

        jLabel4.setText("City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 270, -1));

        jLabel5.setText("Pin Code");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));
        add(txtPinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 270, -1));

        btnAdd.setBackground(new java.awt.Color(255, 204, 51));
        btnAdd.setText("Add Listing");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Permanent House Listing");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 40));

        btnBack.setBackground(new java.awt.Color(20, 53, 94));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtArea.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add an Area");
             return;
         }
        if(txtCity.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add a city");
             return;
         }
        if(txtStreetName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add a street name");
             return;
         }
        if(txtDoorNumber.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add a Door Number");
             return;
         }
        if(txtPinCode.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please add a PinCode");
             return;
         }
        if(txtPinCode.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter number of people");
             return;
         }
        try{
                      if(!txtPinCode.getText().equals(""))
         Integer.parseInt(txtPinCode.getText());
         }
         catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"  Pincode cannot be string");
           return;
         }
        HouseListing houseListing = business.getHsd().addHouseListing();
        houseListing.setArea(txtArea.getText());
        houseListing.setCity(txtCity.getText());
        houseListing.setStreetName(txtStreetName.getText());
        houseListing.setDoorNumber(txtDoorNumber.getText());
        houseListing.setPinCode(txtPinCode.getText());
        txtArea.setText("");
        txtCity.setText("");
        txtStreetName.setText("");
        txtDoorNumber.setText("");
        txtPinCode.setText("");
        JOptionPane.showMessageDialog(null, "Listing has been added. Veteran can view it.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PermHousingWorkAreaJPanel dwjp = (PermHousingWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDoorNumber;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtStreetName;
    // End of variables declaration//GEN-END:variables
}
