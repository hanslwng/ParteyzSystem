

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.UIManager;
import java.text.DateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Reservation extends javax.swing.JFrame {
  

public Reservation() {
    initComponents(); 
    
        }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Reserv = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        midd = new javax.swing.JTextField();
        datee = new javax.swing.JTextField();
        conta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fbl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        emill = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        timee = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Event = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        Wed = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        Corp = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        Pri = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        Kids = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        Deb = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Heavy = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        MEN1 = new javax.swing.JPanel();
        pasta2 = new javax.swing.JCheckBox();
        pasta1 = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        pork1 = new javax.swing.JCheckBox();
        pork2 = new javax.swing.JCheckBox();
        fish2 = new javax.swing.JCheckBox();
        fish1 = new javax.swing.JCheckBox();
        chic2 = new javax.swing.JCheckBox();
        chic1 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        MEN2 = new javax.swing.JPanel();
        kakanin2 = new javax.swing.JCheckBox();
        kakanin1 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        drink1 = new javax.swing.JCheckBox();
        drink2 = new javax.swing.JCheckBox();
        des2 = new javax.swing.JCheckBox();
        des1 = new javax.swing.JCheckBox();
        veg1 = new javax.swing.JCheckBox();
        veg2 = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        ResD = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        tter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(860, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/xx (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1388, -1));

        jPanel8.setLayout(new java.awt.CardLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(1333, 500));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 102, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RESERVATION FORM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-14, 0, 1420, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("First Name");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 144, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Last Name");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        last.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel9.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, 32));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Date of Event");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 144, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Middle Initial");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Contact Number ");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 243, -1, -1));

        first.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });
        jPanel9.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 190, 32));

        midd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel9.add(midd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 190, 32));

        datee.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        datee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateeActionPerformed(evt);
            }
        });
        jPanel9.add(datee, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 175, 190, 32));

        conta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel9.add(conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, 32));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Address ");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 313, -1, -1));

        addre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel9.add(addre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 311, 406, 32));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Facebook link ");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 364, -1, -1));

        fbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel9.add(fbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 362, 406, 32));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Email ");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 40));

        emill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emillActionPerformed(evt);
            }
        });
        jPanel9.add(emill, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 412, 270, 32));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Time");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        timee.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jPanel9.add(timee, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 190, 32));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NEXT");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 118, 46));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CANCEL");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 494, 118, 46));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("Ex: 7am to 5pm");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 100, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/1476948.png"))); // NOI18N
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("*");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 20, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("*");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("*");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 20, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("*");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 20, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setText("*");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 20, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 51));
        jLabel45.setText("*");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 20, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 51));
        jLabel46.setText("*");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 20, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 51));
        jLabel50.setText("*");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 20, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 0, 51));
        jLabel51.setText("*");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 20, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUIDE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GUIDE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("REMINDER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 30));

        javax.swing.GroupLayout ReservLayout = new javax.swing.GroupLayout(Reserv);
        Reserv.setLayout(ReservLayout);
        ReservLayout.setHorizontalGroup(
            ReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1406, Short.MAX_VALUE)
        );
        ReservLayout.setVerticalGroup(
            ReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.add(Reserv, "card2");

        Event.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(0, 102, 204));
        jPanel13.setPreferredSize(new java.awt.Dimension(1330, 49));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TYPE OF EVENT");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(jLabel4)
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Event.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/WEDDING (1).jpg"))); // NOI18N

        Wed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Wed.setText("WEDDING EVENT");
        Wed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WedActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/download (5) (1).jpg"))); // NOI18N

        Corp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Corp.setText("CORPORATE EVENT");
        Corp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorpActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/download (6) (1).jpg"))); // NOI18N

        Pri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pri.setText("PRIVATE PARTY EVENT");
        Pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/download (7) (1).jpg"))); // NOI18N

        Kids.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Kids.setText("KIDS PARTY EVENT");
        Kids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KidsActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/download (8) (1).jpg"))); // NOI18N

        Deb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Deb.setText("DEBUT EVENT");
        Deb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("NEXT");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("CANCEL");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(Wed)
                        .addGap(192, 192, 192)
                        .addComponent(Corp)
                        .addGap(211, 211, 211)
                        .addComponent(Pri))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(Kids)
                        .addGap(240, 240, 240)
                        .addComponent(Deb))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Wed)
                    .addComponent(Corp)
                    .addComponent(Pri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kids)
                    .addComponent(Deb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        Event.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel8.add(Event, "card3");

        Heavy.setLayout(new java.awt.CardLayout());

        jPanel11.setPreferredSize(new java.awt.Dimension(1333, 723));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("HEAVY MEAL");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(603, 603, 603))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(1308, 468));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(0, 51, 51));
        jPanel17.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel17AncestorResized(evt);
            }
        });
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("FISH");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 90, 40));

        jPanel19.setBackground(new java.awt.Color(0, 51, 51));
        jPanel19.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel19AncestorResized(evt);
            }
        });
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel19MouseExited(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("CHICKEN");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, 40));

        jPanel20.setBackground(new java.awt.Color(0, 51, 51));
        jPanel20.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel20AncestorResized(evt);
            }
        });
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel20MouseExited(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("PORK");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 100, 40));

        jPanel21.setBackground(new java.awt.Color(0, 51, 51));
        jPanel21.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel21AncestorResized(evt);
            }
        });
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("PASTA");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel47)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 110, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("NEXT");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 118, 46));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 260, 10));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images1/download (2).png"))); // NOI18N
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, -1));

        MEN1.setBackground(new java.awt.Color(0, 102, 102));
        MEN1.setPreferredSize(new java.awt.Dimension(1160, 3));
        MEN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MEN1MouseExited(evt);
            }
        });

        pasta2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pasta2.setText("Carbonara");
        pasta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pasta2MouseEntered(evt);
            }
        });
        pasta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasta2ActionPerformed(evt);
            }
        });

        pasta1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pasta1.setText("Spaghetti");
        pasta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pasta1MouseEntered(evt);
            }
        });
        pasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasta1ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/GORDON (1).png"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/chicken (1).png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/Fish-Fillet-with-tausi.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/MAYOO (1).png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/MUSHROO1 (1).png"))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/pork1 (1).png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/spag1 (1).png"))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/carbo1 (1).png"))); // NOI18N

        pork1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pork1.setText("Pork Hamonado");
        pork1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pork1MouseEntered(evt);
            }
        });

        pork2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pork2.setText("Mushroom Sauce");
        pork2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pork2MouseEntered(evt);
            }
        });
        pork2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pork2ActionPerformed(evt);
            }
        });

        fish2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fish2.setText("Mayo Garlic dip fish fillet ");
        fish2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fish2MouseEntered(evt);
            }
        });

        fish1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fish1.setText("fish fillet w/tausi");
        fish1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fish1MouseEntered(evt);
            }
        });

        chic2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chic2.setText("Cordon Bleu");
        chic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chic2MouseEntered(evt);
            }
        });
        chic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chic2ActionPerformed(evt);
            }
        });

        chic1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chic1.setText("Fried Chicken");
        chic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chic1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout MEN1Layout = new javax.swing.GroupLayout(MEN1);
        MEN1.setLayout(MEN1Layout);
        MEN1Layout.setHorizontalGroup(
            MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chic2))
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chic1)))
                .addGap(73, 73, 73)
                .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fish1))
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fish2)))
                .addGap(13, 13, 13)
                .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pork2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pasta2))
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pork1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pasta1)))
                .addGap(20, 20, 20))
        );
        MEN1Layout.setVerticalGroup(
            MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(pasta1)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(pork1)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(fish1)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(chic2)
                                .addGap(60, 60, 60)))))
                .addGap(18, 18, 18)
                .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(pasta2)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(pork2)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(fish2)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN1Layout.createSequentialGroup()
                                .addComponent(chic1)
                                .addGap(80, 80, 80))))
                    .addGroup(MEN1Layout.createSequentialGroup()
                        .addGroup(MEN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel42)
                            .addComponent(jLabel49))
                        .addContainerGap())))
        );

        jPanel15.add(MEN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1160, 10));

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("CANCEL");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 110, 46));

        MEN2.setBackground(new java.awt.Color(0, 102, 102));
        MEN2.setPreferredSize(new java.awt.Dimension(1160, 3));
        MEN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MEN2MouseExited(evt);
            }
        });

        kakanin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kakanin2.setText("Kutsinta");
        kakanin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kakanin2MouseEntered(evt);
            }
        });
        kakanin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kakanin2ActionPerformed(evt);
            }
        });

        kakanin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kakanin1.setText("Puto w/Cheese");
        kakanin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kakanin1MouseEntered(evt);
            }
        });
        kakanin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kakanin1ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/JELLY (1).png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/SALADDD (1).png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/TEAA (1).png"))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/BLUELE (1).png"))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/PUTOOO (1).png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/KUTSIN (1).png"))); // NOI18N

        drink1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        drink1.setText("Blue Lemonade");
        drink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drink1MouseEntered(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        drink2.setText("Nestea");
        drink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drink2MouseEntered(evt);
            }
        });
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        des2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        des2.setText("Fruit Salad");
        des2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                des2MouseEntered(evt);
            }
        });

        des1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        des1.setText("Coffee Jelly");
        des1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                des1MouseEntered(evt);
            }
        });

        veg1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        veg1.setText("Buttered Vegetables");
        veg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                veg1MouseEntered(evt);
            }
        });
        veg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veg1ActionPerformed(evt);
            }
        });

        veg2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        veg2.setText("Creamy Mixed Veg w/quil egg  shrimp");
        veg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                veg2MouseEntered(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/buttered (1).png"))); // NOI18N

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/shrimpp (1).png"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setText("w/Quil EggShrimp");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Cheese");

        javax.swing.GroupLayout MEN2Layout = new javax.swing.GroupLayout(MEN2);
        MEN2.setLayout(MEN2Layout);
        MEN2Layout.setHorizontalGroup(
            MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veg1))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MEN2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(veg2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(MEN2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(des2))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(des1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(drink1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addComponent(drink2)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kakanin2)
                            .addComponent(kakanin1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        MEN2Layout.setVerticalGroup(
            MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addGroup(MEN2Layout.createSequentialGroup()
                                .addComponent(veg1)
                                .addGap(60, 60, 60))
                            .addComponent(jLabel56)))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(kakanin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(drink1))
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(des1)))
                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEN2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MEN2Layout.createSequentialGroup()
                                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel57))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(MEN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                                        .addComponent(kakanin2)
                                        .addGap(85, 85, 85))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                                        .addComponent(drink2)
                                        .addGap(82, 82, 82))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                                        .addComponent(des2)
                                        .addGap(76, 76, 76))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEN2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(veg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58)
                        .addGap(69, 69, 69))))
        );

        jPanel15.add(MEN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 1160, 10));

        jPanel22.setBackground(new java.awt.Color(0, 51, 51));
        jPanel22.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel22AncestorResized(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("VEGETABLES");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addGap(14, 14, 14))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, 40));

        jPanel18.setBackground(new java.awt.Color(0, 51, 51));
        jPanel18.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel18AncestorResized(evt);
            }
        });
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("DESSERT");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 120, 40));

        jPanel23.setBackground(new java.awt.Color(0, 51, 51));
        jPanel23.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel23AncestorResized(evt);
            }
        });
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel23MouseExited(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("DRINKS");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel62)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 110, 40));

        jPanel24.setBackground(new java.awt.Color(0, 51, 51));
        jPanel24.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel24AncestorResized(evt);
            }
        });
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel24MouseExited(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("KAKANIN");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 130, 40));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1330, 670));

        Heavy.add(jPanel11, "card2");

        jPanel8.add(Heavy, "card4");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RESERVATION COMPLETE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(546, 546, 546))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        tter.setBackground(new java.awt.Color(0, 51, 51));
        tter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tter.setForeground(new java.awt.Color(255, 255, 255));
        tter.setText("SEND RECIEPT");
        tter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tter)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ResDLayout = new javax.swing.GroupLayout(ResD);
        ResD.setLayout(ResDLayout);
        ResDLayout.setHorizontalGroup(
            ResDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
            .addGroup(ResDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResDLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ResDLayout.setVerticalGroup(
            ResDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(ResDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResDLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel8.add(ResD, "card5");

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1330, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/image-removebg-preview (3).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/image-removebg-preview-4.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/image-removebg-preview-1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ICON/Reserv (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addGap(108, 108, 108)
                .addComponent(jLabel5)
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 720));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Reservation frame = new Reservation();
        frame.setDefaultCloseOperation(Home.DO_NOTHING_ON_CLOSE);
        int choice = JOptionPane.showConfirmDialog(frame,
            "Are you sure you want to exit without finishing the form?",
            "Exit Confirmation",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION){
            Loginnn registerFrame = new Loginnn();
        registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        this.dispose();
        }
        frame.setSize(300, 200);

    }//GEN-LAST:event_jLabel6MouseClicked
private boolean isValidEmail(String email) {
    // Simple email validation using regular expression
    return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
}

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 if (chic1.isSelected() || chic2.isSelected() || fish1.isSelected() || fish2.isSelected() ||
    pork1.isSelected() || pork2.isSelected() || pasta1.isSelected() || pasta2.isSelected() ||
    veg1.isSelected() || veg2.isSelected() || des2.isSelected() || des1.isSelected() ||
    drink2.isSelected() || drink1.isSelected() || kakanin2.isSelected() || kakanin1.isSelected()) {

    // Initialize the lists to store selected items
    ArrayList<String> chickenItems = new ArrayList<>();
    ArrayList<String> fishItems = new ArrayList<>();
    ArrayList<String> porkItems = new ArrayList<>();
    ArrayList<String> pastaItems = new ArrayList<>();
    ArrayList<String> vegetableItems = new ArrayList<>();
    ArrayList<String> dessertItems = new ArrayList<>();
    ArrayList<String> kakaninItems = new ArrayList<>();
    ArrayList<String> drinkItems = new ArrayList<>();

    // Check each checkbox and add selected items to the appropriate list
    if (chic1.isSelected()) {
        chickenItems.add(chic1.getText());
    }
    if (chic2.isSelected()) {
        chickenItems.add(chic2.getText());
    }
    if (fish1.isSelected()) {
        fishItems.add(fish1.getText());
    }
    if (fish2.isSelected()) {
        fishItems.add(fish2.getText());
    }
    if (pork1.isSelected()) {
        porkItems.add(pork1.getText());
    }
    if (pork2.isSelected()) {
        porkItems.add(pork2.getText());
    }
    if (pasta1.isSelected()) {
        pastaItems.add(pasta1.getText());
    }
    if (pasta2.isSelected()) {
        pastaItems.add(pasta2.getText());
    }
    if (veg1.isSelected()) {
        vegetableItems.add(veg1.getText());
    }
    if (veg2.isSelected()) {
        vegetableItems.add(veg2.getText());
    }
    if (des2.isSelected()) {
        dessertItems.add(des2.getText());
    }
    if (des1.isSelected()) {
        dessertItems.add(des1.getText());
    }
    if (kakanin2.isSelected()) {
        kakaninItems.add(kakanin2.getText());
    }
    if (kakanin1.isSelected()) {
        kakaninItems.add(kakanin1.getText());
    }
    if (drink2.isSelected()) {
        drinkItems.add(drink2.getText());
    }
    if (drink1.isSelected()) {
        drinkItems.add(drink1.getText());
    }
    boolean anyItemSelected = !chickenItems.isEmpty() || !fishItems.isEmpty() || !porkItems.isEmpty() ||
                              !pastaItems.isEmpty() || !vegetableItems.isEmpty() || !dessertItems.isEmpty() ||
                              !kakaninItems.isEmpty() || !drinkItems.isEmpty();
    if (anyItemSelected) {
        if (!chickenItems.isEmpty()) {
            area.append("Chicken ↓ \n");
            for (String item : chickenItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!fishItems.isEmpty()) {
            area.append("Fish ↓ \n");
            for (String item : fishItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!porkItems.isEmpty()) {
            area.append("Pork ↓ \n");
            for (String item : porkItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!pastaItems.isEmpty()) {
            area.append("Pasta ↓ \n");
            for (String item : pastaItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!vegetableItems.isEmpty()) {
            area.append("Vegetables ↓ \n");
            for (String item : vegetableItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!dessertItems.isEmpty()) {
            area.append("Dessert ↓ \n");
            for (String item : dessertItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!kakaninItems.isEmpty()) {
            area.append("Kakanin ↓ \n");
            for (String item : kakaninItems) {
                area.append("• " + item + "\n");
            }
        }

        if (!drinkItems.isEmpty()) {
            area.append("Drinks ↓ \n");
            for (String item : drinkItems) {
                area.append("• " + item + "\n");
            }
        }

        // Hide unnecessary components
        Reserv.setVisible(false);
        Event.setVisible(false);
        Heavy.setVisible(false);
        ResD.setVisible(true);
        methodName();
    }
} else {
    // If no checkbox is selected, display a pop-up message
    JOptionPane.showMessageDialog(null, "Please select at least one or more heavy meal.", "No Meal Selected", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_jButton5ActionPerformed
private void methodName() {
    // Set custom font and size for the message
    Font messageFont = new Font("Arial", Font.BOLD, 20);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    UIManager.put("OptionPane.messageFont", messageFont);
    UIManager.put("OptionPane.buttonFont", buttonFont);

    // Show the confirmation message
    JOptionPane.showMessageDialog(null, """
                                        Dear User,
                                        
                                        We are thrilled to inform you that your reservation has been successfully confirmed for the event.
                                        Our team is dedicated to ensuring that your event is a memorable one, and we are committed to
                                        providing you with the best service possible.Please feel free to contact us if you have any questions 
                                        or special requests leading up to the event. We want to make sure that everything is perfect for you.
                                        Once again, thank you for choosing our service. We look forward to hosting your event and making 
                                        it a truly unforgettable experience.
                                        
                                        Kindly Click the SEND RECEIPT to send the Reservation Details to admin.""",
            "Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
}

    private void CorpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorpActionPerformed

    private void PriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriActionPerformed

    private void KidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KidsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KidsActionPerformed

    private void DebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DebActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 int selectedCount = 0;
String selectedEv = "";

if (Wed.isSelected()) {
    selectedCount++;
    selectedEv = Wed.getText();
}
if (Corp.isSelected()) {
    selectedCount++;
    selectedEv = Corp.getText();
}
if (Pri.isSelected()) {
    selectedCount++;
    selectedEv = Pri.getText();
}
if (Kids.isSelected()) {
    selectedCount++;
    selectedEv = Kids.getText();
}
if (Deb.isSelected()) {
    selectedCount++;
    selectedEv = Deb.getText();
}

if (selectedCount != 1) {
    JOptionPane.showMessageDialog(this, "Please select only one event!", "Warning", JOptionPane.WARNING_MESSAGE);
    return;
}
     area.append("Type of Event: " + selectedEv + "\n");
    
    Reserv.setVisible(false);
    Event.setVisible(false);
    Heavy.setVisible(true);
    ResD.setVisible(false);
Heav();
    }//GEN-LAST:event_jButton7ActionPerformed
private void Heav() {
    // Set custom font and size for the message
    Font messageFont = new Font("Arial", Font.PLAIN, 20);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    UIManager.put("OptionPane.messageFont", messageFont);
    UIManager.put("OptionPane.buttonFont", buttonFont);

    // Show the confirmation message
    JOptionPane.showMessageDialog(null, """
                                        GUIDE,
                                        
                                        Hello User, kindly click the chicken bar or 
                                        drinks to see the MENU1 and MENU2.""",
            "GUIDE", JOptionPane.INFORMATION_MESSAGE);
}


    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the reservation without finishing it?", "Cancel Reservation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.out.println("Reservation cancelled.");
            Home registerFrame = new Home();
            registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
            this.dispose(); }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void WedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WedActionPerformed

    private void jPanel17AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel17AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17AncestorResized

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
MEN1.setSize(1160, 310);         
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered

    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
       
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel19AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel19AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19AncestorResized

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
MEN1.setSize(1160, 310);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseExited

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
MEN1.setSize(1160, 310);         
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
MEN1.setSize(1160, 310);        
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jPanel20AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel20AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20AncestorResized

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
MEN1.setSize(1160, 310);        
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseExited
       
    }//GEN-LAST:event_jPanel20MouseExited

    private void jPanel21AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel21AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21AncestorResized

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
MEN1.setSize(1160, 310);       
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
            // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseExited

    private void chic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chic2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chic2ActionPerformed

    private void pork2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pork2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pork2ActionPerformed

    private void pasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasta1ActionPerformed

    private void pasta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasta2ActionPerformed

    private void chic1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chic1MouseEntered
MEN1.setSize(1160, 310);       
    }//GEN-LAST:event_chic1MouseEntered

    private void chic2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chic2MouseEntered
MEN1.setSize(1160, 310);         
    }//GEN-LAST:event_chic2MouseEntered

    private void pork1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pork1MouseEntered
MEN1.setSize(1160, 310);       // TODO add your handling code here:
    }//GEN-LAST:event_pork1MouseEntered

    private void pork2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pork2MouseEntered
MEN1.setSize(1160, 310);       // TODO add your handling code here:
    }//GEN-LAST:event_pork2MouseEntered

    private void pasta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasta1MouseEntered
MEN1.setSize(1160, 310);       // TODO add your handling code here:
    }//GEN-LAST:event_pasta1MouseEntered

    private void pasta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasta2MouseEntered
MEN1.setSize(1160, 310);        // TODO add your handling code here:
    }//GEN-LAST:event_pasta2MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Reservation frame = new Reservation();
        frame.setDefaultCloseOperation(Reservation.DO_NOTHING_ON_CLOSE);
        int choice = JOptionPane.showConfirmDialog(frame,
            "Are you sure you want to cancel your Reservation Form?",
            "Exit Confirmation",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION){
            Home registerFrame = new Home();
            registerFrame.setVisible(true);
            registerFrame.pack();
            registerFrame.setLocationRelativeTo(null);
            this.dispose();
        }
        frame.setSize(300, 200);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 try {
    String lastName = last.getText();
    String firstName = first.getText();
    String middleInitial = midd.getText();
    String date = datee.getText();
    String contact = conta.getText();
    String address = addre.getText();
    String facebook = fbl.getText();
    String time = timee.getText();
    String email = emill.getText();

    String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    String phonePattern = "^\\d{11}$";
    String facebookPattern = "^(https?:\\/\\/)?(www\\.)?facebook.com\\/.+";
    String timePattern = "^([1-9]|1[0-2])(am|pm) to ([1-9]|1[0-2])(am|pm)$";

    DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
    dateFormat.setLenient(false);
    String formattedCurrentDate = dateFormat.format(new Date());

    if (contact.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "Phone number required", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (!contact.matches(phonePattern)) {
        JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid cellphone number", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (time.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "Time required", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (!time.matches(timePattern)) {
        JOptionPane.showMessageDialog(new JFrame(), "Invalid time format. Use format like '7am to 5pm'", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (email.isEmpty() || !email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (!date.matches("\\d{1,2}/\\d{1,2}/\\d{4}") || dateFormat.parse(date).before(dateFormat.parse(formattedCurrentDate))) {
        JOptionPane.showMessageDialog(new JFrame(), "Date should be in the format M/D/YYYY and\nrepresent a present or future date", "Error", JOptionPane.WARNING_MESSAGE);
    } else if (facebook.isEmpty() || (!facebook.matches(facebookPattern) && !facebook.equalsIgnoreCase("N/a"))) {
        JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid Facebook profile link or N/a", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (lastName.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "Last name required", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (firstName.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "First name required", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ("n/a".equals(middleInitial) || middleInitial.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "Middle name required. If none, type 'N/a'.", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (address.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Address required", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        int dialogResult = JOptionPane.showConfirmDialog(this, """
                                                               Make sure with your INFO Reservation
                                                               To receive a message from the admin of
                                                               Parteyz Catering Service""", "REMINDER!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    
        if (dialogResult == JOptionPane.YES_OPTION) {
            dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure your information is filled out?", "REMINDER!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Database connection and insertion
              String dbUrl = "jdbc:mysql://127.0.0.1:3306/reg";
        String dbUser = "root";
        String dbPassword = "";

                try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                    String[] dateParts = date.split("/");
                    int month = Integer.parseInt(dateParts[0]);
                    int day = Integer.parseInt(dateParts[1]);
                    int year = Integer.parseInt(dateParts[2]);

                    String checkSql = "SELECT COUNT(*) FROM calendar WHERE Month = ? AND Day = ? AND Year = ?";
                    try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                        checkStmt.setInt(1, month);
                        checkStmt.setInt(2, day);
                        checkStmt.setInt(3, year);
                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next() && rs.getInt(1) > 0) {
                                JOptionPane.showMessageDialog(new JFrame(), "The date you reserved is not available.", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                // Insert the date into the database
                                String sql = "INSERT INTO calendar (lastName, firstName, Month, Day, Year) VALUES (?, ?, ?, ?, ?)";
                                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                                    stmt.setString(1, lastName);
                                    stmt.setString(2, firstName);
                                    stmt.setInt(3, month);
                                    stmt.setInt(4, day);
                                    stmt.setInt(5, year);
                                    stmt.executeUpdate();

                                    last.setText("");
                                    first.setText("");
                                    midd.setText("");
                                    datee.setText("");
                                    conta.setText("");
                                    addre.setText("");
                                    fbl.setText("");
                                    timee.setText("");
                                    emill.setText("");

                                    Reserv.setVisible(false);
                                    Event.setVisible(true);
                                    Heavy.setVisible(false);
                                    ResD.setVisible(false);

                                    area.append("****************************************************\n");
                                    area.append("*                   Reservation Details                    *\n");
                                    area.append("****************************************************\n");
                                    area.append("LastN: " + lastName + " FirstN: " + firstName + " MI: " + middleInitial + "\n");
                                    area.append("Address: " + address + "\n");
                                    area.append("Date of Event: " + date + " Contact: " + contact + "\n");
                                    area.append("Time of Event: " + time + "\n");
                                    area.append("Facebook: " + facebook + "\n");
                                    area.append("Email: " + email + "\n");
                                }
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(new JFrame(), "Error occurred while accessing the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(new JFrame(), "Error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void dateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateeActionPerformed

    private void fish2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fish2MouseEntered
MEN1.setSize(1160, 310);              // TODO add your handling code here:
    }//GEN-LAST:event_fish2MouseEntered

    private void fish1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fish1MouseEntered
MEN1.setSize(1160, 310);               // TODO add your handling code here:
    }//GEN-LAST:event_fish1MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
          int choice = JOptionPane.showConfirmDialog(Reservation.this, 
            "Are you sure you want to cancel the reservation?", 
            "Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        // User confirmed, go to "Home"
        Home registerFrame = new Home();
        registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        this.dispose();
    } else {
}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         int choice = JOptionPane.showConfirmDialog(Reservation.this, 
            "Are you sure you want to cancel the reservation?", 
            "Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        // User confirmed, go to "Home"
        Home registerFrame = new Home();
        registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        this.dispose();
    } else {
    
    }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
   int choice = JOptionPane.showConfirmDialog(Reservation.this, 
            "Are you sure you want to cancel the reservation?", 
            "Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        // User confirmed, go to "Home"
        Home registerFrame = new Home();
        registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        this.dispose();
    } else {
    
    }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the reservation without finishing it?", "Cancel Reservation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.out.println("Reservation cancelled.");
            Home registerFrame = new Home();
            registerFrame.setVisible(true);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
            this.dispose();
        } else {
            System.out.println("Reservation not cancelled.");
                    }        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tterActionPerformed
Send_Email sendEmail = new Send_Email();
sendEmail.setTextArea(area);
sendEmail.sendEmail();
boolean isReceiptSent = true;

if (isReceiptSent) {
    int option = JOptionPane.showConfirmDialog(null, "Receipt has been sent successfully!", "Receipt Sent", JOptionPane.OK_CANCEL_OPTION);

    if (option == JOptionPane.OK_OPTION) {
        // Proceed to Home frame
        Home homeFrame = new Home();
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
        homeFrame.pack();
        homeFrame.setLocationRelativeTo(null);
        this.dispose();
        // Show confirmation message
        int confirmOption = JOptionPane.showConfirmDialog(null, """
                                                                Your Receipt Form was sent already to admin.
                                                                Kindly wait for the response.""", "Thank you", JOptionPane.OK_CANCEL_OPTION);
        if (confirmOption == JOptionPane.OK_OPTION) {
            // Proceed to Loginnn frame
            Loginnn loginFrame = new Loginnn();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            homeFrame.setVisible(false); // Hide Home frame
        }
    } else if (option == JOptionPane.CANCEL_OPTION) {
        // Proceed to Home frame
        Home homeFrame = new Home();
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
        homeFrame.pack();
        homeFrame.setLocationRelativeTo(null);
        this.dispose();
        // Show confirmation message
        int confirmOption = JOptionPane.showConfirmDialog(null, """
                                                                Your Receipt Form was sent already to admin.
                                                                Kindly wait for the response.""", "Thank you", JOptionPane.OK_CANCEL_OPTION);
        if (confirmOption == JOptionPane.OK_OPTION) {
            // Proceed to Loginnn frame
            Loginnn loginFrame = new Loginnn();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            homeFrame.setVisible(false); // Hide Home frame
        }else if(confirmOption == JOptionPane.CANCEL_OPTION) {
            // Proceed to Loginnn frame
            Loginnn loginFrame = new Loginnn();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            homeFrame.setVisible(false);
        }
    }
}
    }//GEN-LAST:event_tterActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void MEN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEN1MouseExited
MEN1.setSize(1160, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_MEN1MouseExited

    private void kakanin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kakanin2MouseEntered
        MEN2.setSize(1160, 310);         // TODO add your handling code here:
    }//GEN-LAST:event_kakanin2MouseEntered

    private void kakanin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kakanin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kakanin2ActionPerformed

    private void kakanin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kakanin1MouseEntered
        MEN2.setSize(1160, 310);        // TODO add your handling code here:
    }//GEN-LAST:event_kakanin1MouseEntered

    private void kakanin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kakanin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kakanin1ActionPerformed

    private void drink1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drink1MouseEntered
        MEN2.setSize(1160, 310);      // TODO add your handling code here:
    }//GEN-LAST:event_drink1MouseEntered

    private void drink2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drink2MouseEntered
      MEN2.setSize(1160, 310);      // TODO add your handling code here:
    }//GEN-LAST:event_drink2MouseEntered

    private void drink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drink2ActionPerformed

    private void des2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_des2MouseEntered
        MEN2.setSize(1160, 310);                // TODO add your handling code here:
    }//GEN-LAST:event_des2MouseEntered

    private void des1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_des1MouseEntered
        MEN2.setSize(1160, 310);             // TODO add your handling code here:
    }//GEN-LAST:event_des1MouseEntered

    private void veg1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veg1MouseEntered
        MEN2.setSize(1160, 310);  
    }//GEN-LAST:event_veg1MouseEntered

    private void veg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veg1ActionPerformed

    private void veg2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veg2MouseEntered
        MEN2.setSize(1160, 310);  
    }//GEN-LAST:event_veg2MouseEntered

    private void MEN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEN2MouseExited
        MEN2.setSize(1160, 3);           // TODO add your handling code here:
    }//GEN-LAST:event_MEN2MouseExited

    private void jPanel22AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel22AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22AncestorResized

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        MEN2.setSize(1160, 310);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseEntered

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel18AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel18AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18AncestorResized

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        MEN2.setSize(1160, 310); 
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered

    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited

    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel23AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel23AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel23AncestorResized

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
       MEN2.setSize(1160, 310); 
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel23MouseEntered

    private void jPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseExited

    }//GEN-LAST:event_jPanel23MouseExited

    private void jPanel24AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel24AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24AncestorResized

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
       MEN2.setSize(1160, 310); 
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseEntered

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Font messageFont = new Font("Arial", Font.BOLD, 20);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    UIManager.put("OptionPane.messageFont", messageFont);
    UIManager.put("OptionPane.buttonFont", buttonFont);

    // Show the confirmation message
    JOptionPane.showMessageDialog(null, """
                                        GUIDE,
                                        
                                        EXAMPLE: 123 Brgy San Juan, Tabia Street, Lumban, Laguna.
                                        """,
            "ADDRESS GUIDE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Font messageFont = new Font("Arial", Font.BOLD, 20);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    UIManager.put("OptionPane.messageFont", messageFont);
    UIManager.put("OptionPane.buttonFont", buttonFont);
    JOptionPane.showMessageDialog(null, """
                                        To get the Facebook link,
                                        
                                        Step 1: Open Facebook App, click the 3 lines katabi ng notification which is called (MENU).
                                        Step 2: Click  your Profile picture, then once you click the Profile picture.
                                        Step 3: Once you click the Profile, click the 3 dots katabi ng Edit profile.
                                        Step 4: Now  scroll down and click 'Copy link' button and paste the link to the Facebook link.
                                        """,
            "ADDRESS GUIDE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Font messageFont = new Font("Arial", Font.BOLD, 20);
    Font buttonFont = new Font("Arial", Font.BOLD, 20);
    UIManager.put("OptionPane.messageFont", messageFont);
    UIManager.put("OptionPane.buttonFont", buttonFont);
    JOptionPane.showMessageDialog(null, """
                                        EMAIL GUIDE,
                                        
                                        Kindly type your email in the blank textfield
                                        EX: Use valid email like @gmail/@yahoo.com ect..
                                        """,
            "Reminder", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void emillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emillActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Corp;
    private javax.swing.JCheckBox Deb;
    private javax.swing.JPanel Event;
    private javax.swing.JPanel Heavy;
    private javax.swing.JCheckBox Kids;
    private javax.swing.JPanel MEN1;
    private javax.swing.JPanel MEN2;
    private javax.swing.JCheckBox Pri;
    private javax.swing.JPanel ResD;
    private javax.swing.JPanel Reserv;
    private javax.swing.JCheckBox Wed;
    private javax.swing.JTextField addre;
    public javax.swing.JTextArea area;
    private javax.swing.JCheckBox chic1;
    private javax.swing.JCheckBox chic2;
    private javax.swing.JTextField conta;
    private javax.swing.JTextField datee;
    private javax.swing.JCheckBox des1;
    private javax.swing.JCheckBox des2;
    private javax.swing.JCheckBox drink1;
    private javax.swing.JCheckBox drink2;
    private javax.swing.JTextField emill;
    private javax.swing.JTextField fbl;
    private javax.swing.JTextField first;
    private javax.swing.JCheckBox fish1;
    private javax.swing.JCheckBox fish2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox kakanin1;
    private javax.swing.JCheckBox kakanin2;
    private javax.swing.JTextField last;
    private javax.swing.JTextField midd;
    private javax.swing.JCheckBox pasta1;
    private javax.swing.JCheckBox pasta2;
    private javax.swing.JCheckBox pork1;
    private javax.swing.JCheckBox pork2;
    private javax.swing.JTextField timee;
    private javax.swing.JButton tter;
    private javax.swing.JCheckBox veg1;
    private javax.swing.JCheckBox veg2;
    // End of variables declaration//GEN-END:variables

}
