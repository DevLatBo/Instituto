/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Views.Principal;

import institucion.Controllers.CtrlActivity;
import institucion.Controllers.CtrlClassroom;
import institucion.Controllers.CtrlPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import institucion.Models.Users.Act;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author o5k4r1n
 */
public class Activity extends javax.swing.JFrame {

	/**
	 * Creates new form Activity
	 */
	private CtrlClassroom ctrlC;
	private CtrlActivity ctrlA;
	private String action;
	public Activity() {	
		this.setUndecorated(true);
		initComponents();
		this.setSize(830, 610);
		this.setLocationRelativeTo(null);
		ctrlA = new CtrlActivity();
		ctrlC = new CtrlClassroom();
		action = "insert";
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtActivity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnAddActivity = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabActivities = new javax.swing.JTable();
        lblActivities = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        hourActivity = new javax.swing.JComboBox<>();
        minActivity = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbClassroom = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        dateActivity = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Loma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/activities.png"))); // NOI18N
        jLabel1.setText("ACTIVIDADES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 610);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        lblName.setFont(new java.awt.Font("Loma", 1, 15)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Actividad:");

        lblDescription.setFont(new java.awt.Font("Loma", 1, 15)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Descripcion:");

        lblDate.setFont(new java.awt.Font("Loma", 1, 15)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Loma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora:");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        btnAddActivity.setFont(new java.awt.Font("Loma", 1, 14)); // NOI18N
        btnAddActivity.setForeground(new java.awt.Color(255, 255, 255));
        btnAddActivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add.png"))); // NOI18N
        btnAddActivity.setText("AGREGAR");
        btnAddActivity.setBorderPainted(false);
        btnAddActivity.setContentAreaFilled(false);
        btnAddActivity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddActivity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddActivity.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActivityActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Loma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/close.png"))); // NOI18N
        btnExit.setText("SALIR");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tabActivities.setFont(new java.awt.Font("Loma", 1, 12)); // NOI18N
        tabActivities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabActivities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabActivitiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabActivities);

        lblActivities.setFont(new java.awt.Font("Loma", 1, 14)); // NOI18N
        lblActivities.setForeground(new java.awt.Color(255, 255, 255));
        lblActivities.setText("ACTIVIDADES REGISTRADAS ESTE MES");

        btnReset.setFont(new java.awt.Font("Loma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/clean.png"))); // NOI18N
        btnReset.setText("REINICIAR");
        btnReset.setBorderPainted(false);
        btnReset.setContentAreaFilled(false);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        hourActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        minActivity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        jLabel2.setFont(new java.awt.Font("Loma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aula:");

        dateActivity.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate)
                            .addComponent(lblDescription)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dateActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbClassroom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActivities)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAddActivity)
                        .addGap(53, 53, 53)
                        .addComponent(btnExit)
                        .addGap(58, 58, 58)
                        .addComponent(btnReset)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblActivities)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cmbClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addGap(99, 99, 99))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hourActivity)
                                            .addComponent(minActivity)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAddActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnReset))
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(330, 0, 500, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
		clean_form();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActivityActionPerformed
        String name = txtActivity.getText();
		String classroom = cmbClassroom.getSelectedItem().toString();
		int classroom_id = ctrlC.getClassroomID(classroom);
		String desc = txtDesc.getText();
		Date date_activity = dateActivity.getDate();
		String time = hourActivity.getSelectedItem().toString()+":"+minActivity.getSelectedItem().toString();
		String id = txtID.getText();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        try
        {
            Date date = simpleDateFormat.parse(time);
			String time_activity = simpleDateFormat.format(date);
			Act a = new Act();
			a.setName(name);
			a.setDescription(desc);
			a.setClassroom_id(classroom_id);
			a.setDate_activity(date_activity);
			a.setTime_activity(time_activity);
			if( !id.equals("") || id.length() != 0 ){
				int act_id = Integer.parseInt(id);
				a.setId(act_id);
				action = "update";
			}
			if(ctrlA.organizeActivity(a, action)){
				JOptionPane.showMessageDialog(this, "ACTIVIDAD REGISTRADA", "Registro de Actividad", JOptionPane.INFORMATION_MESSAGE);
				clean_form();
				update_table();
				return;
			}
			JOptionPane.showMessageDialog(this, "Error al registrar la actividad. Verificar Campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (ParseException e)
        {
			JOptionPane.showMessageDialog(this, "Favor de Verificar la Hora.", "Hora de Actividad", JOptionPane.WARNING_MESSAGE);
            System.out.println("Exception "+ e);
        }
    }//GEN-LAST:event_btnAddActivityActionPerformed
	public void update_table(){
		DefaultTableModel empty_table = new DefaultTableModel();
		tabActivities.setModel(empty_table);
		String[] titles = {"id","Curso", "Actividad", "Fecha", "Hora"};
		Object[][] activities = ctrlA.getActivities();
		DefaultTableModel act_model = new DefaultTableModel(activities, titles);
		tabActivities.setModel(act_model);
		tabActivities.getColumnModel().getColumn(0).setWidth(0);
		tabActivities.getColumnModel().getColumn(0).setMinWidth(0);
		tabActivities.getColumnModel().getColumn(0).setMaxWidth(0);
	}
	public void clean_form(){
		Date d = new Date();
		txtActivity.setText("");
		txtDesc.setText("");
		dateActivity.setDate(d);
		cmbClassroom.setSelectedIndex(0);
		hourActivity.setSelectedIndex(0);
		minActivity.setSelectedIndex(0);
		txtID.setText("");
		action = "insert";
		btnAddActivity.setText("REGISTRAR");
		try {
			Image img = ImageIO.read(getClass().getResource("../../../images/icons/add.png"));
			btnAddActivity.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtID.setVisible(false);
		ArrayList<String> classrooms = ctrlC.obtainClassrooms();
		cmbClassroom.addItem("Seleccionar");
		for(String classroom: classrooms){
			cmbClassroom.addItem(classroom);
		}
		Date d = new Date();
		dateActivity.setDate(d);
		
		update_table();
    }//GEN-LAST:event_formWindowOpened

    private void tabActivitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabActivitiesMouseClicked
		int fila = tabActivities.rowAtPoint(evt.getPoint());
		txtID.setText(tabActivities.getValueAt(fila, 0).toString());
		int id = Integer.parseInt(tabActivities.getValueAt(fila, 0).toString());
		Act a = ctrlA.getActivityById(id);
		txtActivity.setText(a.getName());
		txtDesc.setText(a.getDescription());
		dateActivity.setDate(a.getDate_activity());
		String classroom = ctrlC.getClassroomByID(a.getClassroom_id());
		cmbClassroom.setSelectedItem(classroom);
		
		String time = a.getTime_activity();
		String[] hour_min = time.split(":");
		hourActivity.setSelectedItem(hour_min[0]);
		minActivity.setSelectedItem(hour_min[1]);
		txtID.setText(String.valueOf(id));
		btnAddActivity.setText("EDITAR");
		try {
			Image img = ImageIO.read(getClass().getResource("../../../images/icons/edit.png"));
			btnAddActivity.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			System.out.println(e);
		}
		action = "update";
    }//GEN-LAST:event_tabActivitiesMouseClicked

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
			java.util.logging.Logger.getLogger(Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Activity().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddActivity;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbClassroom;
    private com.toedter.calendar.JDateChooser dateActivity;
    private javax.swing.JComboBox<String> hourActivity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActivities;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JComboBox<String> minActivity;
    private javax.swing.JTable tabActivities;
    private javax.swing.JTextField txtActivity;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}