/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author kevin
 */
public class FinancialAnalyzerGUI extends javax.swing.JFrame {

    /**
     * Creates new form FinancialAnalyzerGUI
     */
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
        jLabel1 = new javax.swing.JLabel();
        purchaseAmountText = new javax.swing.JTextField();
        downPayment = new javax.swing.JCheckBox();
        downPaymentText = new javax.swing.JTextField();
        loanAmount = new javax.swing.JLabel();
        loanAmountText = new javax.swing.JTextField();
        apr = new javax.swing.JLabel();
        aprText = new javax.swing.JTextField();
        Compounding = new javax.swing.JLabel();
        compoundingComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        loanDurationText = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        summaryReportButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        monthlyPayment = new javax.swing.JLabel();
        monthlyPaymentText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioButtons.add(loanPaymentRadio);
        loanPaymentRadio.setText("Loan Payment ");

        radioButtons.add(investmentValueRadio);
        investmentValueRadio.setText("Investment Value");
        investmentValueRadio.setActionCommand("Investment Value ");

        titleCalculator.setText("Loan Payment Calculator");

        jLabel1.setText("Purchase Amount ");

        downPayment.setText("Down Payment ");

        loanAmount.setText("Loan Amount");

        apr.setText("APR(%)");

        Compounding.setText("Compounding ");

        compoundingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annually", "Semiannual", "Quarterly", "Monthly", "Weekly" }));

        jLabel2.setText("Loan Duration (years) ");

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

        monthlyPayment.setText("Monthly Payment");

        monthlyPaymentText.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(apr)
                            .addComponent(jLabel1)
                            .addComponent(downPayment)
                            .addComponent(loanAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loanAmountText)
                            .addComponent(downPaymentText)
                            .addComponent(aprText)
                            .addComponent(purchaseAmountText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Compounding)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compoundingComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loanDurationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(titleCalculator))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(monthlyPayment)))
                .addGap(11, 11, 11)
                .addComponent(monthlyPaymentText)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanPaymentRadio)
                    .addComponent(investmentValueRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleCalculator)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addComponent(purchaseAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downPayment)
                    .addComponent(downPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanAmount)
                    .addComponent(loanAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compoundingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Compounding))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanDurationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyPayment)
                    .addComponent(monthlyPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(summaryReportButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        loanPaymentRadio.getAccessibleContext().setAccessibleName("loanPaymentRadio");
        investmentValueRadio.getAccessibleContext().setAccessibleName("investmentValueRadio");
        titleCalculator.getAccessibleContext().setAccessibleName("titleCalculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonClick
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonClick

    private void summaryReportButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryReportButtonClick
        // TODO add your handling code here:
    }//GEN-LAST:event_summaryReportButtonClick

    private void clearButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonClick
        purchaseAmountText.setText("");
        downPaymentText.setText("");
        loanAmountText.setText("");
        aprText.setText("");
        loanDurationText.setText("");
        monthlyPaymentText.setText("");
    }//GEN-LAST:event_clearButtonClick

    private void exitButtonActionClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionClick
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionClick

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
                new FinancialAnalyzerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Compounding;
    private javax.swing.JLabel apr;
    private javax.swing.JTextField aprText;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> compoundingComboBox;
    private javax.swing.JCheckBox downPayment;
    private javax.swing.JTextField downPaymentText;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton investmentValueRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loanAmount;
    private javax.swing.JTextField loanAmountText;
    private javax.swing.JTextField loanDurationText;
    private javax.swing.JRadioButton loanPaymentRadio;
    private javax.swing.JLabel monthlyPayment;
    private javax.swing.JTextField monthlyPaymentText;
    private javax.swing.JTextField purchaseAmountText;
    private javax.swing.ButtonGroup radioButtons;
    private javax.swing.JButton summaryReportButton;
    private javax.swing.JLabel titleCalculator;
    // End of variables declaration//GEN-END:variables
}
