/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import java.io.IOException;
import java.time.LocalDate;
import java.time.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author EXPERTS
 */
public class BorrowBook extends JFrame implements WindowNode{
    WindowNode parentNode;
    backend.LibrarianRole librarianRoleB;
    /**
     * Creates new form BorrowBook
     * @param librarianRoleB
     */
    public BorrowBook(backend.LibrarianRole librarianRoleB) {
        this.librarianRoleB = librarianRoleB;
        parentNode = null;
        initComponents();
    }

    private BorrowBook() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        student_id = new javax.swing.JTextField();
        borrow_date = new com.toedter.calendar.JDateChooser();
        borrow_botton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Id");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrow Date");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 255, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Id");
        jLabel3.setOpaque(true);

        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });

        borrow_botton.setBackground(new java.awt.Color(0, 0, 0));
        borrow_botton.setForeground(new java.awt.Color(255, 255, 255));
        borrow_botton.setText("Borrow");
        borrow_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrow_bottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(borrow_date, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(borrow_botton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrow_botton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(borrow_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void borrow_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrow_bottonActionPerformed
        try {
            // TODO add your handling code here:
            if(student_id.getText().isEmpty() || book_id.getText().isEmpty() || (borrow_date.getDate()) == null){
                JOptionPane.showMessageDialog(null, "some fields are empty");
            }
            else{
            int check = librarianRoleB.borrowBook(student_id.getText(), book_id.getText(), LocalDate.ofInstant((borrow_date.getDate()).toInstant(),ZoneId.systemDefault()));
                switch (check) {
                    case 1 -> JOptionPane.showMessageDialog(null, "the student id : "+ student_id.getText() + " has already borrowed a copy of the book with id "+book_id.getText()+" and hasnt returned it yet");
                    case 0 -> JOptionPane.showMessageDialog(null, "all the copies ot the book whoose id : "+ book_id.getText() + " have been borrowed and no copy is left for stuedent with id : "+student_id.getText()+" and hasnt returned it yet");
                    case 2 -> {JOptionPane.showMessageDialog(null, "the student id : "+ student_id.getText() + " has successfully borrowed a copy of the book whoose id :" + book_id.getText());
                               student_id.setText("");
                               book_id.setText("");
                               borrow_date.setDate(null);} 
                    default -> {
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(BorrowBook.class.getName()).log(Level.SEVERE, null, "");
        }
        
    }//GEN-LAST:event_borrow_bottonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JButton borrow_botton;
    private com.toedter.calendar.JDateChooser borrow_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField student_id;
    // End of variables declaration//GEN-END:variables

  @Override
    public void setParentNode(WindowNode parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public WindowNode getParentNode() {
        return this.parentNode;
    }
}