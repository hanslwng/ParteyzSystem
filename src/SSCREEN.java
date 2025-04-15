

public class SSCREEN extends javax.swing.JFrame {

    public SSCREEN() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        BackGroundImage = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGroundPanel.setBackground(new java.awt.Color(0, 51, 51));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parteyz-high-resolution-logo-removebg (1).png"))); // NOI18N
        BackGroundPanel.add(BackGroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 440, 311));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setText("Loading...");
        BackGroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0 %");
        BackGroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, -1, -1));

        LoadingBar.setBackground(new java.awt.Color(204, 204, 204));
        LoadingBar.setForeground(new java.awt.Color(0, 153, 102));
        BackGroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 900, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
       SSCREEN splashScreen = new SSCREEN();
    splashScreen.setVisible(true);

    // Simulate loading progress
    try {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(30);
            splashScreen.LoadingBar.setValue(i);
            splashScreen.LoadingValue.setText(i + "%"); // Update the loading value label
            
            // Update the loading label based on the loading progress
            if (i >= 0 && i < 10) {
                splashScreen.LoadingLabel.setText("Turning On Modules...");
            } else if (i >= 10 && i < 20) {
                splashScreen.LoadingLabel.setText("Loading Modules...");
            } else if (i >= 20 && i < 50) {
                splashScreen.LoadingLabel.setText("Connecting to Database...");
            } else if (i >= 50 && i < 70) {
                splashScreen.LoadingLabel.setText("Connection Successful!");
            } else if (i >= 70 && i < 80) {
                splashScreen.LoadingLabel.setText("Launching Application...");
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Close the splash screen
    splashScreen.dispose();

    // Create and display the registration screen
    registeR registerFrame = new registeR();
    registerFrame.setVisible(true);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundImage;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    // End of variables declaration//GEN-END:variables
}
