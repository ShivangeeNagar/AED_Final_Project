/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Veteran.VeteranDirectory;
import javax.swing.JPanel;
import userinterface.JobRole.JobWorkAreaJPanel;
//import userinterface.PermHousing.PermHousingWorkAreaJPanel;

/**
 *
 * @author akshatananjappa
 */
public class JobRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, VeteranDirectory vd , UserAccountDirectory user_Dir) {
        return new JobWorkAreaJPanel(userProcessContainer, account, (JobOrganization) organization, enterprise, vd,business);
    }
    
}
