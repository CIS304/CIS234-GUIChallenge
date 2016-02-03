/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.NumberFormat;
import javax.swing.Icon;

/**
 *
 * @author kevin
 */
public class FinancialAnalyzerGUI extends javax.swing.JFrame {
    
    
    
    
    public FinancialAnalyzerGUI() {
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

        radioButtons = new javax.swing.ButtonGroup();
        loanPaymentRadio = new javax.swing.JRadioButton();
        investmentValueRadio = new javax.swing.JRadioButton();
        titleCalculator = new javax.swing.JLabel();
        textLabel1 = new javax.swing.JLabel();
        purchaseAmountText = new javax.swing.JTextField();
        textLabel2 = new javax.swing.JCheckBox();
        downPaymentText = new javax.swing.JTextField();
        textLabel3 = new javax.swing.JLabel();
        loanAmountText = new javax.swing.JTextField();
        aprTextLabel = new javax.swing.JLabel();
        aprText = new javax.swing.JTextField();
        compundingTextLabel = new javax.swing.JLabel();
        compoundingComboBox = new javax.swing.JComboBox<>();
        textLabel6 = new javax.swing.JLabel();
        loanDurationText = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        summaryReportButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        textLabel7 = new javax.swing.JLabel();
        monthlyPaymentText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financial Analyzer");

        radioButtons.add(loanPaymentRadio);
        loanPaymentRadio.setSelected(true);
        loanPaymentRadio.setText("Loan Payment ");
        loanPaymentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanPaymentRadioActionPerformed(evt);
            }
        });

        radioButtons.add(investmentValueRadio);
        investmentValueRadio.setText("Investment Value");
        investmentValueRadio.setActionCommand("Investment Value ");
        investmentValueRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investmentValueRadioActionPerformed(evt);
            }
        });

        titleCalculator.setText("Loan Payment Calculator");

        textLabel1.setText("Purchase Amount ");

        purchaseAmountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        purchaseAmountText.setToolTipText("");
        purchaseAmountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchaseAmountTextKeyReleased(evt);
            }
        });

        textLabel2.setText("Down Payment ");
        textLabel2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                textLabel2StateChanged(evt);
            }
        });

        downPaymentText.setEnabled(false);
        downPaymentText.setText("0");
        downPaymentText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        textLabel3.setText("Loan Amount");

        loanAmountText.setEditable(false);
        loanAmountText.setBackground(java.awt.Color.cyan);
        loanAmountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        aprTextLabel.setText("APR(%)");

        aprText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        compundingTextLabel.setText("Compounding ");

        compoundingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annual", "Semiannual", "Quarterly", "Monthly", "Weekly" }));
        compoundingComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compoundingComboBoxMouseClicked(evt);
            }
        });
        compoundingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compoundingComboBoxActionPerformed(evt);
            }
        });

        textLabel6.setText("Loan Duration (years) ");

        loanDurationText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonClick(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonClick(evt);
            }
        });

        summaryReportButton.setText("Summary Report");
        summaryReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryReportButtonClick(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionClick(evt);
            }
        });

        textLabel7.setText("Annual Payment");

        monthlyPaymentText.setEditable(false);
        monthlyPaymentText.setBackground(java.awt.Color.cyan);
        monthlyPaymentText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        monthlyPaymentText.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(titleCalculator)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(summaryReportButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(loanPaymentRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(investmentValueRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aprTextLabel)
                            .addComponent(textLabel1)
                            .addComponent(textLabel2)
                            .addComponent(textLabel3))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downPaymentText)
                            .addComponent(purchaseAmountText)
                            .addComponent(loanAmountText)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compundingTextLabel)
                            .addComponent(textLabel6)
                            .addComponent(textLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(monthlyPaymentText)
                            .addComponent(compoundingComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 113, Short.MAX_VALUE)
                            .addComponent(aprText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loanDurationText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanPaymentRadio)
                    .addComponent(investmentValueRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleCalculator)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel1)
                    .addComponent(purchaseAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel2)
                    .addComponent(downPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel3)
                    .addComponent(loanAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aprTextLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compoundingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compundingTextLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanDurationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel7)
                    .addComponent(monthlyPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(summaryReportButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        loanPaymentRadio.getAccessibleContext().setAccessibleName("loanPaymentRadio");
        investmentValueRadio.getAccessibleContext().setAccessibleName("investmentValueRadio");
        titleCalculator.getAccessibleContext().setAccessibleName("titleCalculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonClick
        // TODO add your handling code here:
        if(loanPaymentRadio.isSelected()){
            
        }else{
            
        }
    }//GEN-LAST:event_calculateButtonClick

    private void summaryReportButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryReportButtonClick
        // TODO add your handling code here:
        
        if(loanPaymentRadio.isSelected()){
           
        }else{
            
        }
    }//GEN-LAST:event_summaryReportButtonClick

    private void clearButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonClick
       
        //clears all fields
        purchaseAmountText.setText("");
        downPaymentText.setText("");
        textLabel2.setSelected(false); //Clears the check box
        loanAmountText.setText("");
        aprText.setText(""); 
        compoundingComboBox.setSelectedIndex(0); //Resets compounding option
        loanDurationText.setText("");
        monthlyPaymentText.setText("");
        downPaymentText.setText("0");
        
        

    }//GEN-LAST:event_clearButtonClick

    private void exitButtonActionClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionClick
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionClick

    private void investmentValueRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investmentValueRadioActionPerformed
        
       // when investment radio button is clicked, change labels 
       textLabel1.setText("Monthly Investment");
       textLabel2.setText("Initial Investment"); 
       textLabel3.setText("");
       textLabel6.setText("Investment Period (years)"); 
       textLabel7.setText("Future Value");
       
       //calls clear button function when radio button is selected
       clearButtonClick(null);
       
       //disables loan amount text and box
       loanAmountText.setEnabled(false);
       if(!textLabel2.isSelected()){
           downPaymentText.setEnabled(false);
       }
       
    }//GEN-LAST:event_investmentValueRadioActionPerformed

    private void loanPaymentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanPaymentRadioActionPerformed
        
        // when loan payment radio button is clicked, change labels
        textLabel1.setText("Purchase Amount");
        textLabel2.setText("Down Payment");
        textLabel3.setText("Loan Payment");
        textLabel6.setText("Loan Duration (years)");
        textLabel7.setText("Monthly Payment");
        textLabel2.setEnabled(true);
        loanAmountText.setEnabled(true);
        
        //calls clear buton function when radio button is selected
        clearButtonClick(null);
            
                
    }//GEN-LAST:event_loanPaymentRadioActionPerformed

    private void compoundingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compoundingComboBoxActionPerformed

        String selection = (String) compoundingComboBox.getSelectedItem();
        
        //Payment/Investment frequency label changes 
        if(loanPaymentRadio.isSelected()){
            textLabel7.setText(selection + " Payment");
        }else{
            textLabel1.setText(selection + " Investment");
        }
        //
        if(lastCombo != selection){
            monthlyPaymentText.setText("");
            summaryReportButton.setEnabled(false);
        }
        
//        if(compoundingOption.getPeriodsPerYear() != oldValue.getPeriodsPerYear()){
//            resultTextField.setText("");
//            reportButton.setEnabled(false);
//        }
        
//        CompoundingOption oldValue = compoundingOption;
//        String compoundingOption = getSelectedCompounding();
//        compoundingText = (String) compoundingCBox.getSelectedItem();
//        
//        if(loanRadioButton.isSelected()){
//            resultLabel.setText(compoundingText + "Payment");
//        }else{
//            requiredCashFlowLabel.setText(compoundingText + "Investment");
//        }
//        if(compoundingOption.getPeriodsPerYear() != oldValue.getPeriodsPerYear()){
//            resultTextField.setText("");
//            reportButton.setEnabled(false);
//        }
          
    }//GEN-LAST:event_compoundingComboBoxActionPerformed

    private void textLabel2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_textLabel2StateChanged
        
        // Greys out and adds 0 if unchecked and the opposite if checked
        if(textLabel2.isSelected()){
            downPaymentText.setEnabled(true);
            downPaymentText.setText("");
        }else{
            downPaymentText.setEnabled(false);
            downPaymentText.setText("0");
        }
    }//GEN-LAST:event_textLabel2StateChanged

    private void purchaseAmountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchaseAmountTextKeyReleased
        loanAmountText.setText(purchaseAmountText.getText());
    }//GEN-LAST:event_purchaseAmountTextKeyReleased

    private String lastCombo;
    
    private void compoundingComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compoundingComboBoxMouseClicked
        //
        lastCombo = (String) compoundingComboBox.getSelectedItem();
    }//GEN-LAST:event_compoundingComboBoxMouseClicked

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
            java.util.logging.Logger.getLogger(FinancialAnalyzerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinancialAnalyzerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinancialAnalyzerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinancialAnalyzerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //this code center the GUI on the screen when running 
                FinancialAnalyzerGUI frame = new FinancialAnalyzerGUI();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aprText;
    private javax.swing.JLabel aprTextLabel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> compoundingComboBox;
    private javax.swing.JLabel compundingTextLabel;
    private javax.swing.JTextField downPaymentText;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton investmentValueRadio;
    private javax.swing.JTextField loanAmountText;
    private javax.swing.JTextField loanDurationText;
    private javax.swing.JRadioButton loanPaymentRadio;
    private javax.swing.JTextField monthlyPaymentText;
    private javax.swing.JTextField purchaseAmountText;
    private javax.swing.ButtonGroup radioButtons;
    private javax.swing.JButton summaryReportButton;
    private javax.swing.JLabel textLabel1;
    private javax.swing.JCheckBox textLabel2;
    private javax.swing.JLabel textLabel3;
    private javax.swing.JLabel textLabel6;
    private javax.swing.JLabel textLabel7;
    private javax.swing.JLabel titleCalculator;
    // End of variables declaration//GEN-END:variables
}
