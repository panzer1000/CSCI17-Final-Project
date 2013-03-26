/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.view;

import dao.BaseDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Allan Jay Aya-ay
 */
public class MainFrame extends javax.swing.JFrame {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String currentUser;
    private String currentUserType;
    
    /**
     * Creates new form MainForm
     */
    public MainFrame() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mItemAdd = new javax.swing.JMenu();
        mnuAddProduct = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItemExit = new javax.swing.JMenuItem();
        mnuView = new javax.swing.JMenu();
        mnuViewItems = new javax.swing.JMenuItem();
        mnuViewTransaction = new javax.swing.JMenuItem();
        mnuUser = new javax.swing.JMenu();
        mItemAddUser = new javax.swing.JMenuItem();
        cmbViewEmployees = new javax.swing.JMenuItem();
        mnuAbout = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Current User : ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mnuFile.setText("File");

        mItemAdd.setText("Add");

        mnuAddProduct.setText("Add Product");
        mnuAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddProductActionPerformed(evt);
            }
        });
        mItemAdd.add(mnuAddProduct);

        mnuFile.add(mItemAdd);
        mnuFile.add(jSeparator1);

        mItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mItemExit.setText("Exit");
        mItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemExitActionPerformed(evt);
            }
        });
        mnuFile.add(mItemExit);

        jMenuBar1.add(mnuFile);

        mnuView.setText("View");

        mnuViewItems.setText("View Items");
        mnuViewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewItemsActionPerformed(evt);
            }
        });
        mnuView.add(mnuViewItems);

        mnuViewTransaction.setText("View Transaction");
        mnuViewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewTransactionActionPerformed(evt);
            }
        });
        mnuView.add(mnuViewTransaction);

        jMenuBar1.add(mnuView);

        mnuUser.setText("User");

        mItemAddUser.setText("Add New User");
        mItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAddUserActionPerformed(evt);
            }
        });
        mnuUser.add(mItemAddUser);

        cmbViewEmployees.setText("View Employees");
        cmbViewEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbViewEmployeesActionPerformed(evt);
            }
        });
        mnuUser.add(cmbViewEmployees);

        jMenuBar1.add(mnuUser);

        mnuAbout.setText("About");

        jMenuItem2.setText("About The Developers");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuAbout.add(jMenuItem2);

        jMenuBar1.add(mnuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1066)/2, (screenSize.height-729)/2, 1066, 729);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = BaseDAO.open();
        this.setTitle("Current Login User -- " + currentUser + " -- " + currentUserType);
        
    }//GEN-LAST:event_formWindowOpened

    private void mItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mItemExitActionPerformed

    private void mItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAddUserActionPerformed
        // TODO add your handling code here:
        AddUser addUser = new AddUser(this,true);
        addUser.setVisible(true);
    }//GEN-LAST:event_mItemAddUserActionPerformed

    private void cmbViewEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbViewEmployeesActionPerformed
        ViewEmployees employees = new ViewEmployees();
        employees.setVisible(true);
    }//GEN-LAST:event_cmbViewEmployeesActionPerformed

    private void mnuAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddProductActionPerformed
        // TODO add your handling code here:
        AddProduct addProduct = new AddProduct(this,true);
        addProduct.setVisible(true);
    }//GEN-LAST:event_mnuAddProductActionPerformed

    private void mnuViewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewItemsActionPerformed
        // TODO add your handling code here:
        ViewItem viewItem = new ViewItem();
        viewItem.setCurrentUser(currentUser);
        viewItem.setVisible(true);

    }//GEN-LAST:event_mnuViewItemsActionPerformed

    private void mnuViewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewTransactionActionPerformed
        // TODO add your handling code here:
        viewTransaction transaction = new viewTransaction();
        transaction.setVisible(true);
    }//GEN-LAST:event_mnuViewTransactionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        viewAbout about = new viewAbout(this,true);
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cmbViewEmployees;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mItemAdd;
    private javax.swing.JMenuItem mItemAddUser;
    private javax.swing.JMenuItem mItemExit;
    private javax.swing.JMenu mnuAbout;
    private javax.swing.JMenuItem mnuAddProduct;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuUser;
    private javax.swing.JMenu mnuView;
    private javax.swing.JMenuItem mnuViewItems;
    private javax.swing.JMenuItem mnuViewTransaction;
    // End of variables declaration//GEN-END:variables

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public void setCurrentUserType(String currentUserType) {
        this.currentUserType = currentUserType;
    }

  

}
