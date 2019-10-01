/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.*;
import Methods.methodsClient;
import Methods.methodsEvents;
import Methods.methodsReports;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lester Trejos
 */
public class InfoEvents extends javax.swing.JFrame {

        
        //Declaration to start the listModel
    DefaultListModel<String> listModel = new DefaultListModel<>(); 
    
    // Declarations the globals variables to call the methods
    methodsClient metClient = methodsClient.getInstance();
    methodsReports metReports = methodsReports.getInstance();
    methodsEvents metEvents = methodsEvents.getInstance();
    Login login = new Login();
    
    public InfoEvents() {
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

        jPanel3 = new javax.swing.JPanel();
        btnPending = new javax.swing.JButton();
        btnCancelled = new javax.swing.JButton();
        btnRealized = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtByCity = new javax.swing.JTextField();
        btnByCity = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        btnDate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtEventName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPending.setText("Search Pending");
        btnPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingActionPerformed(evt);
            }
        });

        btnCancelled.setText("Search Cancelled");
        btnCancelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelledActionPerformed(evt);
            }
        });

        btnRealized.setText("Search Realized");
        btnRealized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPending, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealized)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPending)
                    .addComponent(btnRealized)
                    .addComponent(btnCancelled))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnByCity.setText("Search By City ");
        btnByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtByCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDate.setText("Search By Date");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnDate)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("EventName");

        jButton2.setText("Cancel Event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton3.setText("Edit/Delete an Event");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(100, 100, 100)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingActionPerformed
        try {
            String state = "Pending";
            searchXState(state);
            if (listModel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Not found");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You have no events yet");
            }
        
    }//GEN-LAST:event_btnPendingActionPerformed

    private void btnCancelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelledActionPerformed
        try {
            String state = "Cancelled";
        searchXState(state);
        if (listModel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Not found");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have no events yet");
        }
        
    }//GEN-LAST:event_btnCancelledActionPerformed

    private void btnRealizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizedActionPerformed
        try {
            String state = "Realized";
            searchXState(state);
            if (listModel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Not found");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have no events yet");
        }
        
    }//GEN-LAST:event_btnRealizedActionPerformed

    private void btnByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByCityActionPerformed
        try {
            String city = txtByCity.getText();
            searchXCity(city);
            if (listModel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Not found");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have no events yet");
        }
        
    }//GEN-LAST:event_btnByCityActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        Date testDate = null;
        try {
            String fecha = txtDate.getText();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String date = fecha;
            try{
                testDate = df.parse(date);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Invalid formar, Enter(dd/MM/yyyy)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Date , Enter(dd/MM/yyyy)");
        }
        if (testDate != null) {
            searchXDate(testDate);
            if (listModel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Enter the date correctly");
        }
    }//GEN-LAST:event_btnDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CreateEvent createEvent = new CreateEvent();
        createEvent.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String eventName = txtEventName.getText();
            Events aux = metEvents.searchXEventName(eventName);
            if (aux.owner.equals(login.userName1)) {
                if (aux != null) {
                    if(aux.state.equals("Realized")){
                    JOptionPane.showMessageDialog(null, "This event has already been held");
                    }else{
                aux.state = "Cancelled";
                JOptionPane.showMessageDialog(null, "Event cancelled");}
            }
            }else{
                JOptionPane.showMessageDialog(null, "Event no Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Event can't be cancelled");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       EditDeleteEvents ed = new EditDeleteEvents();
       ed.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InfoEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByCity;
    private javax.swing.JButton btnCancelled;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnPending;
    private javax.swing.JButton btnRealized;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtByCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEventName;
    // End of variables declaration//GEN-END:variables

     public void searchXCity(String city){
      listModel.clear();
      Events aux = metEvents.head;
        if (city.equals(metEvents.head.city)) {
            if (aux.owner.equals(login.userName1)) {
                listModel.addElement("---------------------------------");
                listModel.addElement("ID: " + aux.id_event);
                listModel.addElement("Name: " + aux.eventName);
                listModel.addElement("Description: " + aux.eventDescription);
                listModel.addElement("City: " + aux.city);
                listModel.addElement("Date: " + aux.eventDate);
                listModel.addElement("State: " + aux.state);
                jList1.setModel(listModel);
            }
            
        }else{   
            aux = aux.next;
            while (aux != metEvents.head){
                if (aux.owner.equals(login.userName1)) {
                    if (aux.city.equals(city)){
                    listModel.addElement("---------------------------------");
                    listModel.addElement("ID: " + aux.id_event);
                    listModel.addElement("Name: " + aux.eventName);
                    listModel.addElement("Description: " + aux.eventDescription);
                    listModel.addElement("City: " + aux.city);
                    listModel.addElement("Date: " + aux.eventDate);
                    listModel.addElement("State: " + aux.state);
                }
                
                }else{
                    JOptionPane.showMessageDialog(null, "You have no events yet");
                }
                aux = aux.next;
                jList1.setModel(listModel);
            }
        }
          
    }
    
    public void searchXDate(Date date){
     listModel.clear();
      Events aux = metEvents.head;
        if (date.equals(metEvents.head.eventDate)) {
            if (aux.owner.equals(login.userName1)) {
                listModel.addElement("---------------------------------");
                listModel.addElement("ID: " + aux.id_event);
                listModel.addElement("Name: " + aux.eventName);
                listModel.addElement("Description: " + aux.eventDescription);
                listModel.addElement("City: " + aux.city);
                listModel.addElement("Date: " + aux.eventDate);
                listModel.addElement("State: " + aux.state);
                jList1.setModel(listModel);
            }
            
        }else{   
            aux = aux.next;
            while (aux != metEvents.head){
                if (aux.owner.equals(login.userName1)) {
                    if (aux.eventDate.equals(date)){
                    listModel.addElement("---------------------------------");
                    listModel.addElement("ID: " + aux.id_event);
                    listModel.addElement("Name: " + aux.eventName);
                    listModel.addElement("Description: " + aux.eventDescription);
                    listModel.addElement("City: " + aux.city);
                    listModel.addElement("Date: " + aux.eventDate);
                    listModel.addElement("State: " + aux.state);
                }
                }else{
                    JOptionPane.showMessageDialog(null, "You have no events yet");
                }
                aux = aux.next;
                jList1.setModel(listModel);
            }
        }
    }
    
    public void searchXState(String state){
      listModel.clear();
      Events aux = metEvents.head;
       if (aux.owner.equals(login.userName1)) {
        if (state.equals(metEvents.head.state)) {
                listModel.addElement("---------------------------------");
                listModel.addElement("ID: " + aux.id_event);
                listModel.addElement("Name: " + aux.eventName);
                listModel.addElement("Description: " + aux.eventDescription);
                listModel.addElement("City: " + aux.city);
                listModel.addElement("Date: " + aux.eventDate);
                listModel.addElement("State: " + aux.state);
                jList1.setModel(listModel);
            }
            
        }   
            aux = aux.next;
            while (aux != metEvents.head){
                if (aux.owner.equals(login.userName1)) {
                    if (aux.state.equals(state)){
                    listModel.addElement("---------------------------------");
                    listModel.addElement("ID: " + aux.id_event);
                    listModel.addElement("Name: " + aux.eventName);
                    listModel.addElement("Description: " + aux.eventDescription);
                    listModel.addElement("City: " + aux.city);
                    listModel.addElement("Date: " + aux.eventDate);
                    listModel.addElement("State: " + aux.state);
                }
                }else{
                    JOptionPane.showMessageDialog(null, "You have no events in" + state);
                }
                aux = aux.next;
                jList1.setModel(listModel);
            }
        
    }

}
