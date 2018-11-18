/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package institucion.Views.Secretary;

import institucion.Controllers.CtrlTeacher;
import institucion.Models.Users.Teacher;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author OscarT
 */
public class FormTeacher extends javax.swing.JFrame {

    private CtrlTeacher ctrlT;
    /**
     * Creates new form FormTeacher
     */
    public FormTeacher() {
        this.setUndecorated(true);
        initComponents();
        this.setSize(479,548);
        this.setLocationRelativeTo(null);
        
        ctrlT = new CtrlTeacher();
        txtPhoto.setVisible(false);
        txtPhotoAddress.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFirtName = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCi = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        lblPlace = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPass1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtPassConfirm = new javax.swing.JPasswordField();
        btnAction = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtBirthday = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        lblPhoto = new javax.swing.JLabel();
        panelPhoto = new javax.swing.JPanel();
        lblFlag = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        txtPhotoAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/teacher2.png"))); // NOI18N
        jLabel1.setText("Agregar");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 550);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lblFirtName.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblFirtName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirtName.setText("Nombre(s):");

        txtFirstname.setBackground(new java.awt.Color(51, 51, 51));
        txtFirstname.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtFirstname.setForeground(new java.awt.Color(255, 255, 255));
        txtFirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblLastName.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Apellido(s):");

        txtLastname.setBackground(new java.awt.Color(51, 51, 51));
        txtLastname.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtLastname.setForeground(new java.awt.Color(255, 255, 255));
        txtLastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblAddress.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Direccion:");

        txtAddress.setBackground(new java.awt.Color(51, 51, 51));
        txtAddress.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblCi.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblCi.setForeground(new java.awt.Color(255, 255, 255));
        lblCi.setText("CI:");

        txtCI.setBackground(new java.awt.Color(51, 51, 51));
        txtCI.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtCI.setForeground(new java.awt.Color(255, 255, 255));
        txtCI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblBirthday.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblBirthday.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthday.setText("Fecha de Nac.:");

        lblPlace.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblPlace.setForeground(new java.awt.Color(255, 255, 255));
        lblPlace.setText("Ciudad:");

        txtPlace.setBackground(new java.awt.Color(51, 51, 51));
        txtPlace.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtPlace.setForeground(new java.awt.Color(255, 255, 255));
        txtPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblUser.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario:");

        lblPass1.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblPass1.setForeground(new java.awt.Color(255, 255, 255));
        lblPass1.setText("Contrasenia:");

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setFont(new java.awt.Font("Lao UI", 1, 13)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirmacion:");

        txtPassConfirm.setBackground(new java.awt.Color(51, 51, 51));
        txtPassConfirm.setForeground(new java.awt.Color(255, 255, 255));
        txtPassConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnAction.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        btnAction.setForeground(new java.awt.Color(255, 255, 255));
        btnAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add.png"))); // NOI18N
        btnAction.setText("Agregar");
        btnAction.setBorder(null);
        btnAction.setBorderPainted(false);
        btnAction.setContentAreaFilled(false);
        btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActionMouseClicked(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/close.png"))); // NOI18N
        btnClose.setText("Salir");
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

        txtBirthday.setBackground(new java.awt.Color(0, 0, 0));
        txtBirthday.setDateFormatString("yyyy-MM-dd");
        txtBirthday.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblPhoto.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoto.setText("Foto:");

        panelPhoto.setBackground(new java.awt.Color(51, 51, 51));
        panelPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPhotoMouseClicked(evt);
            }
        });
        panelPhoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFlag.setFont(new java.awt.Font("Lao UI", 1, 10)); // NOI18N
        lblFlag.setForeground(new java.awt.Color(255, 255, 255));
        lblFlag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlag.setText("Clic aqui");
        lblFlag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelPhoto.add(lblFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 91, 30));

        txtPhotoAddress.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 9, Short.MAX_VALUE))
                                    .addComponent(txtPassConfirm)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAction)
                                .addGap(58, 58, 58)
                                .addComponent(btnClose)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUser)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPass1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblFirtName)
                                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblBirthday))
                                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCi)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPlace)
                                        .addComponent(txtCI, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                        .addComponent(txtPlace))
                                    .addComponent(lblPhoto)
                                    .addComponent(panelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhotoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirtName)
                    .addComponent(lblPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(panelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthday)
                    .addComponent(lblPlace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPass1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhotoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAction, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(190, 0, 290, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActionMouseClicked
        String code = this.generateCode(8);
        String pass1 = txtPass.getText();
        String pass2 = txtPassConfirm.getText();
        int ci = 0;
        try{
            ci = Integer.parseInt(txtCI.getText());
        }catch(NumberFormatException e){
            ci = 0;
        }
        if(pass1.equals(pass2)){
            Teacher t = new Teacher();        
            t.setFirst_name(txtFirstname.getText());
            t.setLast_name(txtLastname.getText());
            t.setAddress(txtAddress.getText());
            t.setCi(ci);
            t.setPhoto(txtPhoto.getText());
            t.setBirthday(txtBirthday.getDate());
            t.setCode(code);
            t.setPlace_birth(txtPlace.getText());
            t.setUsnername(txtUser.getText());
            t.setPassword(txtPass.getText());

            if(ctrlT.add(t)){
                JOptionPane.showMessageDialog(null, 
                                            "Profesor registrado con exito", 
                                            "Registro", 
                                            JOptionPane.INFORMATION_MESSAGE);
                try {
                    Files.copy(
                            Paths.get(txtPhotoAddress.getText()), 
                            Paths.get(System.getProperty("user.dir")
                                        +"/src/images/photos/teacher/" + txtPhoto.getText()),
                            StandardCopyOption.REPLACE_EXISTING);
                        this.setVisible(false);
                        return;
                } catch (IOException ex) {
                }
                this.setVisible(false);
                TeachersList list = new TeachersList();
                list.setVisible(true);
                return;
            }
            JOptionPane.showMessageDialog(null, 
                                        "Llene todo los campos correctamente.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, 
                                    "Contrasenias no coinciden", 
                                    "Contrasenia", 
                                    JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnActionMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        this.setVisible(false);
        TeachersList teachers = new TeachersList();
        teachers.setVisible(true);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void panelPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPhotoMouseClicked
        JFileChooser imageFile = new JFileChooser();
        imageFile.showOpenDialog(null);
        File f = imageFile.getSelectedFile();
        try{
            String fileName         =   f.getAbsolutePath();
            File file               =   new File(fileName);
            String format_file      =   new MimetypesFileTypeMap().getContentType(file);
            String type             =   format_file.split("/")[0];
            boolean isPhoto         =   true;
            /*System.out.println(format_file);
            System.out.println(type);
            System.out.println(f.getName());
            System.out.println(new MimetypesFileTypeMap().getContentType(file));*/
            boolean valid = true;
            String format = "";
            try {
                Image image = ImageIO.read(new File(fileName));
                ImageInputStream iis = ImageIO.createImageInputStream(file);

                Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);

                while (imageReaders.hasNext()) {
                    ImageReader reader = (ImageReader) imageReaders.next();
                    //System.out.printf("formatName: %s%n", reader.getFormatName());
                    format = reader.getFormatName();
                }
                if (image == null) {
                    valid = false;
                    //System.out.println("The file"+f.getName()+"could not be opened , it is not an image");
                }
            } catch(IOException ex) {
                valid = false;
                //System.out.println("The file"+f.getName()+"could not be opened , an error occurred.");
            }
            //System.out.println(valid);
            if(valid){
                String photo = "";
                lblFlag.setText(f.getName());
                SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
                Date now = new Date();
                photo = (isPhoto)?txtLastname.getText()+"_"+txtFirstname.getText()
                                    +"_"+sdfDate.format(now)+"."+format:"no_image.jpg";
                System.out.println(photo);
                txtPhoto.setText(photo);
                txtPhotoAddress.setText(f.getAbsolutePath());
            }
        }catch(NullPointerException e){
        }
    }//GEN-LAST:event_panelPhotoMouseClicked

    private String generateCode(int len){
        char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z' };
    
        char[] c=new char[len];
        Random random=new Random();
        for (int i = 0; i < len; i++) {
          c[i]=ch[random.nextInt(ch.length)];
        }

        return new String(c);
    }
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
            java.util.logging.Logger.getLogger(FormTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblFirtName;
    private javax.swing.JLabel lblFlag;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelPhoto;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthday;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassConfirm;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtPhotoAddress;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
