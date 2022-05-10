/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_wash;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danial
 */
public class Customer_Service_entries extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Service_entries
     */
    public Customer_Service_entries() {
       initComponents();
        Database2 db=new Database2();
        ResultSet rs = db.getdataCSE();
         try{
            while(rs.next()) {
            String data[]={rs.getString("Sd_id"),rs.getString("Car_number"),rs.getString("B_wash"),rs.getString("B_wash_price"),rs.getString("F_wash"),rs.getString("F_wash_price"),rs.getString("seat_R"),rs.getString("seat_R_price"),rs.getString("polish"),rs.getString("polish_price"),rs.getString("total")};
            DefaultTableModel tbmodel=(DefaultTableModel)CSEntries.getModel();
            tbmodel.addRow(data);
                              }
            }catch(Exception e){
    System.out.println(e);
                                }
    }

    
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CSEntries = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CSEntrieswithsearch = new javax.swing.JTable();
        searchCSE = new javax.swing.JButton();
        search_text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Customer Services Entries");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        CSEntries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Car Number", "B Wash", "B Wash Price", "F Wash", "F Wash Price", "Seat R", "Seat R price", "Polish", "Polish Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(CSEntries);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 795, 144));

        CSEntrieswithsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Car Number", "B Wash", "B Wash Price", "F Wash", "F Wash Price", "Seat R", "Seat R price", "Polish", "Polish Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(CSEntrieswithsearch);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 795, 144));

        searchCSE.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        searchCSE.setText("Search");
        searchCSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCSEActionPerformed(evt);
            }
        });
        getContentPane().add(searchCSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 269, 79, -1));
        getContentPane().add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 270, 159, 27));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_wash/08G1Lb.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCSEActionPerformed
        Database2 db=new Database2();                                 
        ResultSet rs=db.searchRecordCSE(search_text.getText());
        try{
            while(rs.next()) {
            String data[]={rs.getString("Sd_id"),rs.getString("Car_number"),rs.getString("B_wash"),rs.getString("B_wash_price"),rs.getString("F_wash"),rs.getString("F_wash_price"),rs.getString("seat_R"),rs.getString("seat_R_price"),rs.getString("polish"),rs.getString("polish_price"),rs.getString("total")};
            DefaultTableModel dtm=(DefaultTableModel)CSEntrieswithsearch.getModel();
            dtm.addRow(data);
                              }
            }catch(Exception e){
    System.out.println(e);
                                }
                
        
         
         
           
           
    }//GEN-LAST:event_searchCSEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Service_entries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CSEntries;
    private javax.swing.JTable CSEntrieswithsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchCSE;
    private javax.swing.JTextField search_text;
    // End of variables declaration//GEN-END:variables
}
