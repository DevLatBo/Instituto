/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package institucion.Views.Secretary;

import institucion.Controllers.CtrlTeacher;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OscarT
 */
public class TeachersList extends javax.swing.JFrame {

    private CtrlTeacher ctrlT;
    /**
     * Creates new form ProfilePrincipal
     */
    public TeachersList() {
        this.setUndecorated(true);
        initComponents();
        this.setSize(775, 429);
        this.setLocationRelativeTo(null);
        ctrlT = new CtrlTeacher();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSearchTeacher = new javax.swing.JTextField();
        lblSearchTeacher = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabTeachers = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txtSearchTeacher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchTeacherKeyReleased(evt);
            }
        });

        lblSearchTeacher.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblSearchTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchTeacher.setText("CI:");

        tabTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTeachersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabTeachers);

        btnClose.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/close.png"))); // NOI18N
        btnClose.setText("Cerrar");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para acceder a datos del Maestro, haga clic en la fila correspondiente:");

        jButton1.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSearchTeacher)
                        .addGap(28, 28, 28)
                        .addComponent(txtSearchTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchTeacher)
                    .addComponent(txtSearchTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(218, 0, 557, 430);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/teacher2.png"))); // NOI18N
        jLabel1.setText("PROFESORES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 220, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Object[][] teachers = ctrlT.getAllTeachers();
        Object[] head = {"id","Apellidos", "Nombres", "Fecha de Nac.", "Usuario"};
        DefaultTableModel teachers_model = new DefaultTableModel(teachers, head){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        tabTeachers.setModel(teachers_model);
        tabTeachers.getColumnModel().getColumn(0).setMinWidth(0);
        tabTeachers.getColumnModel().getColumn(0).setMaxWidth(0);
        tabTeachers.getColumnModel().getColumn(0).setWidth(0);
    }//GEN-LAST:event_formWindowOpened

    private void txtSearchTeacherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTeacherKeyReleased
        String ci = "";
        ci = txtSearchTeacher.getText();
        
        Object[][] teachers = ctrlT.getTeachersByCI(ci);
        Object[] head = {"id", "Apellidos", "Nombres", "Fecha de Nac.", "Usuario"};
        DefaultTableModel tabEmpty = new DefaultTableModel();
        tabTeachers.setModel(tabEmpty);
        if(ci.length() == 0){
            teachers = null;
            teachers = ctrlT.getAllTeachers();
            DefaultTableModel allTeachers_model = new DefaultTableModel(teachers, head){

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                } 
            };
            tabTeachers.setModel(allTeachers_model);
            tabTeachers.getColumnModel().getColumn(0).setMinWidth(0);
            tabTeachers.getColumnModel().getColumn(0).setMaxWidth(0);
            tabTeachers.getColumnModel().getColumn(0).setWidth(0);
            return;
        }
        DefaultTableModel teachers_model = new DefaultTableModel(teachers, head){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabTeachers.setModel(teachers_model);
        tabTeachers.getColumnModel().getColumn(0).setMinWidth(0);
        tabTeachers.getColumnModel().getColumn(0).setMaxWidth(0);
        tabTeachers.getColumnModel().getColumn(0).setWidth(0);
    }//GEN-LAST:event_txtSearchTeacherKeyReleased

    private void tabTeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTeachersMouseClicked
        int row = tabTeachers.getSelectedRow();
        TeachersList teacher = this;
        if( row > -1 ){
            int teacher_id = Integer.parseInt(tabTeachers.getValueAt(tabTeachers.getSelectedRow(), 0).toString());
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem teacherEdit = new JMenuItem(new AbstractAction("Editar"){

                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        FormTeacher teacher_edit = new FormTeacher();
                        teacher_edit.teacherId = teacher_id;
                        teacher_edit.setVisible(true);
                        teacher.setVisible(false);
                    }catch(ArrayIndexOutOfBoundsException ex){}
                }

            });
            JMenuItem uploadData = new JMenuItem(new AbstractAction("Subir Notas") {

                @Override
                public void actionPerformed(ActionEvent e) {
                    FormTeacher form = new FormTeacher();
                    teacher.setVisible(false);
                    form.setTeacherId(teacher_id);
                    form.setVisible(true);
                    
                }
            });
            JMenuItem teacherDelete = new JMenuItem(new AbstractAction("Eliminar") {

                @Override
                public void actionPerformed(ActionEvent e) {
                    int resp = JOptionPane.showConfirmDialog(null, 
                                                            "Seguro de Eliminar Profesor(a)?", 
                                                            "Eliminar", 
                                                            JOptionPane.YES_NO_OPTION);
                    if(resp == 0) //Si presiona opcion SI
                    {
                        boolean deleted = ctrlT.deleteById(teacher_id);
                        if(deleted){
                            JOptionPane.showMessageDialog(null, 
                                                        "Profesor(a) eliminado",
                                                        "Eliminar",
                                                        JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            });
            JMenuItem assignSubject = new JMenuItem(new AbstractAction("Asignar Materia") {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Assignation a = new Assignation();
                    a.teacherID = teacher_id;
                    a.setVisible(true);
                }
            });
            popupMenu.add(teacherEdit);
            popupMenu.add(uploadData);
            popupMenu.add(teacherDelete);
            popupMenu.add(assignSubject);
            tabTeachers.setComponentPopupMenu(popupMenu);
        }
    }//GEN-LAST:event_tabTeachersMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        FormTeacher form = new FormTeacher();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TeachersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchTeacher;
    private javax.swing.JTable tabTeachers;
    private javax.swing.JTextField txtSearchTeacher;
    // End of variables declaration//GEN-END:variables
}
