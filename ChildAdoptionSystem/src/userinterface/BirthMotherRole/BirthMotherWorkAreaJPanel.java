/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BirthMotherOrganization;
import Business.Organization.Organization;
import Business.People.BirthMother;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Dashboard.BirthMotherDashboard;

/**
 *
 * @author devansh
 */
public class BirthMotherWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Organization organization;
    private BirthMother BirthMother;
    
    /**
     * Creates new form CounselorWorkArea
     */
    public BirthMotherWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        this.system = system;
        this.BirthMother = account.getBirthmother();
        valueLabel.setText(enterprise.getName());
        btnCreateLoan.setEnabled(false);
        btnCreateInsurance.setEnabled(false);
        
        BirthMotherDashboard lp = new BirthMotherDashboard(BirthMother);
        dashboardPanel.add(lp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewParentsJButton = new javax.swing.JButton();
        viewBankDetails = new javax.swing.JButton();
        btnCreateLoan = new javax.swing.JButton();
        btnCreateInsurance = new javax.swing.JButton();
        chkBankAccount = new javax.swing.JRadioButton();
        chkInsurance = new javax.swing.JRadioButton();
        updateProfile = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        viewParentsJButton.setBackground(new java.awt.Color(204, 204, 0));
        viewParentsJButton.setText("View Parent Directory");
        viewParentsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewParentsJButtonActionPerformed(evt);
            }
        });

        viewBankDetails.setBackground(new java.awt.Color(204, 204, 0));
        viewBankDetails.setText("View Bank Details");
        viewBankDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBankDetailsActionPerformed(evt);
            }
        });

        btnCreateLoan.setBackground(new java.awt.Color(204, 204, 0));
        btnCreateLoan.setText("Create Loan Request");
        btnCreateLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLoanActionPerformed(evt);
            }
        });

        btnCreateInsurance.setBackground(new java.awt.Color(204, 204, 0));
        btnCreateInsurance.setText("Insurance ");
        btnCreateInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInsuranceActionPerformed(evt);
            }
        });

        chkBankAccount.setText("Loan Request");
        chkBankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBankAccountActionPerformed(evt);
            }
        });

        chkInsurance.setText("Insurance");
        chkInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInsuranceActionPerformed(evt);
            }
        });

        updateProfile.setBackground(new java.awt.Color(204, 204, 0));
        updateProfile.setText("View/Update Profile");
        updateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileActionPerformed(evt);
            }
        });

        dashboardPanel.setBackground(new java.awt.Color(255, 51, 51));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(700, 300));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkBankAccount)
                                .addGap(18, 18, 18)
                                .addComponent(chkInsurance))
                            .addComponent(btnCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBankDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkBankAccount)
                            .addComponent(chkInsurance))
                        .addGap(10, 10, 10)
                        .addComponent(btnCreateLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewBankDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewParentsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewParentsJButtonActionPerformed
        if(BirthMother.getAddress() == null){
            JOptionPane.showMessageDialog(this, "Please update the profile before viewing Parents");
            return;
        }
        else{
        if(BirthMother.getFinalizedParent() == null){
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewParentDirectory", new ViewParentDirectory(userProcessContainer, userAccount, BirthMother,enterprise));
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "You are already set, cant view Parents. \n Please contact your Counselor!");
            return;
        }
        }
    }//GEN-LAST:event_viewParentsJButtonActionPerformed

    private void viewBankDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBankDetailsActionPerformed
        if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
         else{
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        UpdateBankInformation bankAcc = new UpdateBankInformation(userAccount, userProcessContainer, system);
        userProcessContainer.add(bankAcc);
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewBankDetailsActionPerformed

    private void btnCreateLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLoanActionPerformed
        if(userAccount.getBirthmother().getTypeL() != 2){
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        LoanCreation bankAcc = new LoanCreation(userAccount, userProcessContainer, system);
        userProcessContainer.add(bankAcc);
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "Cant select Loan as your Bank account is not ready or else you have opted for Insurance");
            return;
        }
    }//GEN-LAST:event_btnCreateLoanActionPerformed

    private void btnCreateInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInsuranceActionPerformed
        if(userAccount.getBirthmother().getTypeL() != 1){
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        InsuranceViewPage bankAcc = new InsuranceViewPage(userAccount, userProcessContainer, enterprise, system);
        userProcessContainer.add(bankAcc);
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "Cant select Insurance as your Bank account is not ready or else you have opted for Loan");
            return;
        }
    }//GEN-LAST:event_btnCreateInsuranceActionPerformed

    private void chkBankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBankAccountActionPerformed
       if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
       if(BirthMother.getParentAidfund() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Parent to add aid amount");
            return;
       }
       if(BirthMother.getOwnFunds() == 0){
            JOptionPane.showMessageDialog(this, "Please add your contribution in View Bank Acccount page");
            return;
       
       }
        
        if (chkBankAccount.isSelected()){
            btnCreateLoan.setEnabled(true);
            btnCreateInsurance.setEnabled(false);
            chkInsurance.setSelected(false);
        }
       
    }//GEN-LAST:event_chkBankAccountActionPerformed

    private void chkInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInsuranceActionPerformed
        if(BirthMother.getLoanaccount().getBankAccountNumber() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Bank Manager to accept the bank account req");
            return;
        }
       if(BirthMother.getParentAidfund() == 0){
            JOptionPane.showMessageDialog(this, "Please wait for Parent to add aid amount");
            return;
       }
       if(BirthMother.getOwnFunds() == 0){
            JOptionPane.showMessageDialog(this, "Please add your contribution in View Bank Acccount page");
            return;
       
       }
        if (chkInsurance.isSelected()){
            btnCreateLoan.setEnabled(false);
            btnCreateInsurance.setEnabled(true);
            chkBankAccount.setSelected(false);
        }
    }//GEN-LAST:event_chkInsuranceActionPerformed

    private void updateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileActionPerformed
         
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        BirthMotherProfile birthProfile = new BirthMotherProfile(userAccount,organization, userProcessContainer);
        userProcessContainer.add(birthProfile);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_updateProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateInsurance;
    private javax.swing.JButton btnCreateLoan;
    private javax.swing.JRadioButton chkBankAccount;
    private javax.swing.JRadioButton chkInsurance;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton updateProfile;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBankDetails;
    private javax.swing.JButton viewParentsJButton;
    // End of variables declaration//GEN-END:variables


}
