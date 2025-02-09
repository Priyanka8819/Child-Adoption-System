/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceManger;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BirthMotherToInsuranceManager;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author priya
 */
public class ViewInsuranceApplicationWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private BirthMotherToInsuranceManager birthMotherToInsurance;
    /**
     * Creates new form ViewLoanApplicationWorkAreaJPanel
     */
    public ViewInsuranceApplicationWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
       valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (BirthMotherToInsuranceManager request : enterprise.getWorkQueue().getBirthMotherToInsurance()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getInsurance().getHospital();
            row[2] = request.getInsurance().getPolicyNumber();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        viewBirthMother = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client Name", "Hospital", "Policy Number", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        viewBirthMother.setBackground(new java.awt.Color(204, 204, 0));
        viewBirthMother.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewBirthMother.setText("VIEW INSURANCE REQUEST");
        viewBirthMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBirthMotherActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(204, 204, 0));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addGap(69, 69, 69)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(viewBirthMother)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(viewBirthMother, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBirthMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBirthMotherActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table");
            return;
        }
        else{
            BirthMotherToInsuranceManager request = (BirthMotherToInsuranceManager)workRequestJTable.getValueAt(selectedRow,0);
            if(!(request.getStatus().equals("Completed"))){
                request.setStatus("Processing");
                request.setReceiver(userAccount);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
               
                userProcessContainer.add("ViewInsuranceRequest", new ViewInsuranceRequest(userProcessContainer, userAccount, request, enterprise));
                layout.next(userProcessContainer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Insurance request completed");
                return;
            
            }
        }
        
    }//GEN-LAST:event_viewBirthMotherActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBirthMother;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
