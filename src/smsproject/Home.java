/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsproject;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author islam
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        DateLabel();
        //jPanel4.setBackground(new Color(0,0,0,100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        c = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        admission = new javax.swing.JPanel();
        admissionlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        teacherbtn1 = new javax.swing.JPanel();
        abc1 = new javax.swing.JLabel();
        teacher = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        teacherbtn = new javax.swing.JPanel();
        abc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1100, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                headMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                headMouseExited(evt);
            }
        });
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rec(1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/min.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        head.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/school.png"))); // NOI18N
        head.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 30, 30));

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        head.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 240, 30));

        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 28));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl3.setBackground(new java.awt.Color(0, 153, 153));
        pnl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl3MouseExited(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 51, 51));
        lbl3.setText("NOTICE");
        lbl3.setAlignmentX(0.5F);
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 240, 60));

        c.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout cLayout = new javax.swing.GroupLayout(c);
        c.setLayout(cLayout);
        cLayout.setHorizontalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        cLayout.setVerticalGroup(
            cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 220, 10));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/schools.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SCHOOL");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1070, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admission.setBackground(new java.awt.Color(0, 153, 153));
        admission.setForeground(new java.awt.Color(0, 153, 153));
        admission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissionMouseExited(evt);
            }
        });

        admissionlbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        admissionlbl.setForeground(new java.awt.Color(255, 255, 255));
        admissionlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admissionlbl.setText("NEW ADMISSION");
        admissionlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admissionlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admissionlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissionlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissionlblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout admissionLayout = new javax.swing.GroupLayout(admission);
        admission.setLayout(admissionLayout);
        admissionLayout.setHorizontalGroup(
            admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admissionLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(admissionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        admissionLayout.setVerticalGroup(
            admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admissionlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel4.add(admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/studen.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 273, 218));

        teacherbtn1.setBackground(new java.awt.Color(153, 0, 153));
        teacherbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherbtn1MouseExited(evt);
            }
        });

        abc1.setBackground(new java.awt.Color(51, 153, 0));
        abc1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        abc1.setForeground(new java.awt.Color(255, 255, 255));
        abc1.setText("  LOG IN AS STUDENT");
        abc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abc1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abc1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout teacherbtn1Layout = new javax.swing.GroupLayout(teacherbtn1);
        teacherbtn1.setLayout(teacherbtn1Layout);
        teacherbtn1Layout.setHorizontalGroup(
            teacherbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherbtn1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(abc1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        teacherbtn1Layout.setVerticalGroup(
            teacherbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherbtn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abc1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(teacherbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        teacher.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/teach.png"))); // NOI18N

        teacherbtn.setBackground(new java.awt.Color(153, 0, 153));
        teacherbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherbtnMouseExited(evt);
            }
        });

        abc.setBackground(new java.awt.Color(51, 153, 0));
        abc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        abc.setForeground(new java.awt.Color(255, 255, 255));
        abc.setText("  LOG IN AS TEACHER");
        abc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abcMouseExited(evt);
            }
        });

        javax.swing.GroupLayout teacherbtnLayout = new javax.swing.GroupLayout(teacherbtn);
        teacherbtn.setLayout(teacherbtnLayout);
        teacherbtnLayout.setHorizontalGroup(
            teacherbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherbtnLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(abc, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        teacherbtnLayout.setVerticalGroup(
            teacherbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout teacherLayout = new javax.swing.GroupLayout(teacher);
        teacher.setLayout(teacherLayout);
        teacherLayout.setHorizontalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherLayout.createSequentialGroup()
                .addComponent(teacherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(teacherLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teacherLayout.setVerticalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1070, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void abcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abcMouseEntered
        teacherbtn.setBackground(new Color(0, 153, 153));

        //c.setBackground(Color.red);
    }//GEN-LAST:event_abcMouseEntered

    private void abcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abcMouseExited
        // TODO add your handling code here:
        teacherbtn.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_abcMouseExited

    private void teacherbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherbtnMouseEntered
        // TODO add your handling code here:
        teacherbtn.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_teacherbtnMouseEntered

    private void teacherbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherbtnMouseExited
        // TODO add your handling code here:
        teacherbtn.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_teacherbtnMouseExited

    private void abc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abc1MouseEntered
        // TODO add your handling code here:
        teacherbtn1.setBackground(new Color(0, 153, 153));

    }//GEN-LAST:event_abc1MouseEntered

    private void abc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abc1MouseExited
        // TODO add your handling code here:
        teacherbtn1.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_abc1MouseExited

    private void teacherbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherbtn1MouseEntered
        // TODO add your handling code here:
        teacherbtn1.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_teacherbtn1MouseEntered

    private void teacherbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherbtn1MouseExited
        // TODO add your handling code here:
        teacherbtn1.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_teacherbtn1MouseExited

    private void admissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionMouseEntered

        // TODO add your handling code here:
        admission.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_admissionMouseEntered

    private void admissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionMouseExited
        admission.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_admissionMouseExited

    private void headMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseEntered
        head.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_headMouseEntered

    private void headMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseExited
        head.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_headMouseExited

    private void abcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abcMouseClicked
        LoginStudent logt = new LoginStudent();
        logt.setVisible(true);
    }//GEN-LAST:event_abcMouseClicked

    private void abc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abc1MouseClicked
       LoginStudent logt = new LoginStudent();
        logt.setVisible(true);
    }//GEN-LAST:event_abc1MouseClicked

    private void admissionlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionlblMouseClicked
        StudentAdd std = new StudentAdd();
        std.setVisible(true);
    }//GEN-LAST:event_admissionlblMouseClicked

    private void admissionlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionlblMouseEntered
        // TODO add your handling code here:
        admission.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_admissionlblMouseEntered

    private void admissionlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionlblMouseExited
        // TODO add your handling code here:
        admission.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_admissionlblMouseExited

    private void pnl3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseExited
        // TODO add your handling code here:
        pnl3.setBackground(new Color(0, 153, 153));
        c.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_pnl3MouseExited

    private void pnl3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseEntered
        // TODO add your handling code here:
        pnl3.setBackground(new Color(253, 254, 254));
        c.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_pnl3MouseEntered

    private void lbl3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseExited
        // TODO add your handling code here:
        pnl3.setBackground(new Color(0, 153, 153));
        c.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl3MouseExited

    private void lbl3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseEntered
        // TODO add your handling code here:
        pnl3.setBackground(new Color(253, 254, 254));
        c.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_lbl3MouseEntered

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        NoticeBoard nb = new NoticeBoard();
        nb.setVisible(true);
    }//GEN-LAST:event_lbl3MouseClicked
    public void DateLabel() {
        Date curDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy   HH:mm");
        String DateToStr = format.format(curDate);
        date.setText(DateToStr);

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abc;
    private javax.swing.JLabel abc1;
    private javax.swing.JPanel admission;
    private javax.swing.JLabel admissionlbl;
    private javax.swing.JPanel c;
    private javax.swing.JLabel date;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl3;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel teacher;
    private javax.swing.JPanel teacherbtn;
    private javax.swing.JPanel teacherbtn1;
    // End of variables declaration//GEN-END:variables
}
