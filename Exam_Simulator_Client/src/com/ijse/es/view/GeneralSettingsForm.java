/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.es.view;

import com.ijse.es.connector.ServerConnector;
import com.ijse.es.controller.LecturerController;
import com.ijse.es.controller.StudentController;
import com.ijse.es.dto.LecturerDTO;
import com.ijse.es.dto.StudentDTO;
import com.ijse.es.observer.Observer;
import com.ijse.es.observer.Subject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GeneralSettingsForm extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form GeneralSettingsForm
     */
    public GeneralSettingsForm() {
        try {
            initComponents();
            UnicastRemoteObject.exportObject(this, 0);
            StudentController scontroller = ServerConnector.getServerConnector().getStudentController();
            Subject subject = (Subject) scontroller;
            subject.registerObserver(this);
        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
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

        pnlExamSetting = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtBatch = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlDelete = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblNamee = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtLecID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtLecName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setOpaque(false);

        pnlExamSetting.setBackground(new java.awt.Color(153, 153, 153));
        pnlExamSetting.setOpaque(false);
        pnlExamSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel15.setText("student settings");
        pnlExamSetting.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 144, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel16.setText("student id");
        pnlExamSetting.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 132, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setText("name");
        pnlExamSetting.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 192, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setText("gender");
        pnlExamSetting.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 32));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel19.setText("batch ");
        pnlExamSetting.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 32));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel27.setText("     delete");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        pnlExamSetting.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 180, 50));

        txtStudentID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtStudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStudentID.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        pnlExamSetting.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, 40));

        txtBatch.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtBatch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBatch.setSelectionColor(new java.awt.Color(0, 0, 0));
        pnlExamSetting.add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, 40));

        txtStudentName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtStudentName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStudentName.setSelectionColor(new java.awt.Color(0, 0, 0));
        pnlExamSetting.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 250, 40));

        comboGender.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "female", "male" }));
        pnlExamSetting.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, 40));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel28.setText("     update");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);
        pnlExamSetting.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 180, 50));
        pnlExamSetting.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 680, 20));

        pnlDelete.setBackground(new java.awt.Color(153, 153, 153));
        pnlDelete.setOpaque(false);
        pnlDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel24.setText("lecturer settings");
        pnlDelete.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 144, -1));

        lblNamee.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        pnlDelete.add(lblNamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 126, 117, 27));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel20.setText("lecturer id");
        pnlDelete.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 132, 40));

        txtLecID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtLecID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLecID.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtLecID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecIDActionPerformed(evt);
            }
        });
        pnlDelete.add(txtLecID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel22.setText("name");
        pnlDelete.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 192, 40));

        txtLecName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtLecName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLecName.setSelectionColor(new java.awt.Color(0, 0, 0));
        pnlDelete.add(txtLecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel23.setText("speciality");
        pnlDelete.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 40));

        jComboBox3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "female", "male" }));
        pnlDelete.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 250, 40));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel29.setText("     delete");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        pnlDelete.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 180, 50));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel30.setText("     update");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setOpaque(true);
        pnlDelete.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExamSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlExamSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        deleteStudent();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        removeLecturer();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        searchStudnt();
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtLecIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecIDActionPerformed
        searchLecturer();
    }//GEN-LAST:event_txtLecIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboGender;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNamee;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlExamSetting;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtLecID;
    private javax.swing.JTextField txtLecName;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables

    private void deleteStudent() {
        try {
            String sID = txtStudentID.getText();
            StudentController controller = ServerConnector.getServerConnector().getStudentController();
            boolean delete = controller.deleteStudent(sID);
            if (delete) {
                JOptionPane.showMessageDialog(this, sID + "  student removed successfully..");
            } else {
                JOptionPane.showMessageDialog(this, sID + "  student removed faild..");
            }
        } catch (NotBoundException | ClassNotFoundException | ParseException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeLecturer() {
        try {
            String lecID = txtLecID.getText();
            LecturerController controller = ServerConnector.getServerConnector().getLecturerController();
            boolean delete = controller.deleteLecture(lecID);
            if (delete) {
                JOptionPane.showMessageDialog(this, "Lecturer removed...");
            } else {
                JOptionPane.showMessageDialog(this, "Lecturer remove faild...");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchStudnt() {
        try {
            String sid = txtStudentID.getText();
            StudentController sc = ServerConnector.getServerConnector().getStudentController();
            StudentDTO studentDTO = sc.searchstudent(sid);
            txtStudentName.setText(studentDTO.getName());
            txtBatch.setText(studentDTO.getBatchID());

        } catch (NotBoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchLecturer() {
        try {
            LecturerController controller = ServerConnector.getServerConnector().getLecturerController();
            LecturerDTO dTO = controller.searchLecturer(txtLecID.getText());
            txtLecName.setText(dTO.getName());
            jComboBox3.setSelectedItem(dTO.getSpeciality());
        } catch (IOException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(GeneralSettingsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String message) throws RemoteException {
        setMessage(message);
    }

    private void setMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
