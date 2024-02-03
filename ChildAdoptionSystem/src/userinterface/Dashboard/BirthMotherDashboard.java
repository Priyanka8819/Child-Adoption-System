/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Dashboard;

import Business.People.BirthMother;
import Business.People.Parents;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.Dialog.BirthMotherHelp;

/**
 *
 * @author devansh
 */
public class BirthMotherDashboard extends javax.swing.JPanel {

    private BirthMother BirthMother;
    private Parents parent; 
    
    public BirthMotherDashboard(BirthMother mother) {
        initComponents();
        
        this.BirthMother = mother;
        if(mother.getFinalizedParent() != null){
        this.parent = mother.getFinalizedParent();
        
        populateParentDetails();
        }
        
        chart();
        thirdPanelDashboard third = new thirdPanelDashboard();
        thirdPanel.add(third);
               
    }
    
        //Pie chart
    public void chart(){
        try{
        int self = BirthMother.getOwnFunds();
        int parent = BirthMother.getParentAidfund();
        int help;
        int loan = BirthMother.getLoanAmountApproved();
        int insurance = BirthMother.getInsuranceAmount();
        int counselor = BirthMother.getRequiredFund();
        if(loan != 0){
            help = loan;
        }
        else{
            help = insurance;
        }
        int extra = counselor - (self+parent+help);
        
        if(self+parent+help +extra== counselor){
            
        DefaultPieDataset dataset = new DefaultPieDataset();
   
        dataset.setValue("Parents", (((float)self/counselor)*100));
        dataset.setValue("Self", (((float)parent/counselor)*100));
        dataset.setValue("Loan/Insurance", ((float)help/counselor)*100);
        dataset.setValue("Extra",((float)extra/counselor)*100);
        
        JFreeChart chart = ChartFactory.createPieChart("BIRTH MOTHER FUNDS", dataset, true, true, false);
        
        chart.getPlot().setBackgroundPaint(Color.white);
        JPanel pieChart2 = new ChartPanel(chart);
        pieChart.add(pieChart2);
        }
        else{
        DefaultPieDataset dataset = new DefaultPieDataset();
            dataset.setValue("TBD", 100);
            
            JFreeChart chart = ChartFactory.createPieChart("FUNDS to fill", dataset, true, true, false);
        
        chart.getPlot().setBackgroundPaint(Color.white);
        JPanel pieChart2 = new ChartPanel(chart);
        pieChart.add(pieChart2);
        }
        
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error");
        }
    }
    
    private void populateParentDetails(){
        lblName.setText(parent.getFirstName() +" "+ parent.getLastName());
        lblAddress.setText(parent.getAddress());
        lblEmail.setText(parent.getEmail());
        lblContact.setText(parent.getContactParent());
        parentImg.setIcon(new ImageIcon(parent.getImgPath()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();
        pieChart = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        parentImg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        thirdPanel = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setBackground(new java.awt.Color(64, 151, 182));
        setPreferredSize(new java.awt.Dimension(960, 400));
        setSize(new java.awt.Dimension(900, 675));

        userProcessContainer.setBackground(new java.awt.Color(64, 151, 182));

        pieChart.setBackground(new java.awt.Color(255, 102, 102));
        pieChart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        pieChart.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(406, 269));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PARENT PROFILE :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 151, 182));
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 151, 182));
        jLabel3.setText("ADDRESS:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 151, 182));
        jLabel4.setText("CONTACT:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 151, 182));
        jLabel5.setText("EMAIL:");

        parentImg.setBackground(new java.awt.Color(102, 255, 102));
        parentImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parentImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/familyprofile.png"))); // NOI18N

        lblName.setText("TBP");

        lblAddress.setText("TBP");

        lblContact.setText("TBP");

        lblEmail.setText("TBP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblName)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(lblAddress)
                    .addComponent(lblContact)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(lblContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thirdPanel.setBackground(new java.awt.Color(64, 151, 182));
        thirdPanel.setPreferredSize(new java.awt.Dimension(810, 318));
        thirdPanel.setLayout(new java.awt.BorderLayout());

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printing-tool-2.png"))); // NOI18N
        btnPrint.setContentAreaFilled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help-web-button.png"))); // NOI18N
        btnHelp.setContentAreaFilled(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(userProcessContainerLayout.createSequentialGroup()
                        .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHelp)
                    .addComponent(btnPrint))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userProcessContainerLayout.createSequentialGroup()
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHelp))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
                job.setJobName("Print Data");

                job.setPrintable(new Printable(){
                public int print(Graphics pg,PageFormat pf, int pageNum){
                        pf.setOrientation(PageFormat.LANDSCAPE);
                     if(pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2 = (Graphics2D)pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.24,0.24);

                    userProcessContainer.paint(g2);         
                    return Printable.PAGE_EXISTS;


                }
        });    
            boolean ok = job.printDialog();
            if(ok){
            try{

            job.print();
            }
            catch (PrinterException ex){}
            }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        BirthMotherHelp help = new BirthMotherHelp();
        help.setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel parentImg;
    private javax.swing.JPanel pieChart;
    private javax.swing.JPanel thirdPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
