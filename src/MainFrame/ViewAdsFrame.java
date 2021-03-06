/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author raino13
 */


public class ViewAdsFrame extends javax.swing.JFrame{

    /**
     * Creates new form MainFrame
     */
    
    int xMouse, yMouse;
    
    public ViewAdsFrame() {
        initComponents();
        downloadData();
        insetItemTest();
        showDetailInfo();
        adDetailPanel.hide();
        
            
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        topTitileLabel = new javax.swing.JLabel();
        scrollPaneForList = new java.awt.ScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        minimizeButton1 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JLabel();
        topTitileLabel1 = new javax.swing.JLabel();
        scrollPaneForList1 = new java.awt.ScrollPane();
        adDetailPanel = new javax.swing.JPanel();
        dTtitle = new javax.swing.JLabel();
        dPostcode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dArea = new javax.swing.JLabel();
        dCity = new javax.swing.JLabel();
        dFloorNo = new javax.swing.JLabel();
        dBathrooms = new javax.swing.JLabel();
        dBelcony = new javax.swing.JLabel();
        dRooms = new javax.swing.JLabel();
        dEmail = new javax.swing.JLabel();
        dCustomerType = new javax.swing.JLabel();
        dAdType = new javax.swing.JLabel();
        dImageOne = new javax.swing.JLabel();
        dImageTwo = new javax.swing.JLabel();
        dImageThree = new javax.swing.JLabel();
        dOwnerName = new javax.swing.JLabel();
        dContactNo = new javax.swing.JLabel();
        dPrice = new javax.swing.JLabel();
        dMonth = new javax.swing.JLabel();
        dStreet = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel354305 = new javax.swing.JLabel();
        dDescription = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));
        jPanel1.setMinimumSize(new java.awt.Dimension(966, 569));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimize Window_48px.png"))); // NOI18N
        minimizeButton.setToolTipText("Minimize");
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 12, -1, -1));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back To_48px.png"))); // NOI18N
        backButton.setToolTipText("Go back home");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 12, -1, -1));

        topTitileLabel.setBackground(new java.awt.Color(255, 204, 0));
        topTitileLabel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        topTitileLabel.setForeground(new java.awt.Color(255, 255, 255));
        topTitileLabel.setText("   RAIN APP");
        topTitileLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topTitileLabelMouseDragged(evt);
            }
        });
        topTitileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topTitileLabelMousePressed(evt);
            }
        });
        jPanel1.add(topTitileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 0, 676, 62));
        jPanel1.add(scrollPaneForList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 412, 480));

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));
        jPanel2.setMinimumSize(new java.awt.Dimension(966, 569));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        minimizeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimize Window_48px.png"))); // NOI18N
        minimizeButton1.setToolTipText("Minimize");
        minimizeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButton1MouseClicked(evt);
            }
        });
        jPanel2.add(minimizeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 12, -1, -1));

        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back To_48px.png"))); // NOI18N
        backButton1.setToolTipText("Go back home");
        backButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton1MouseClicked(evt);
            }
        });
        jPanel2.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 12, -1, -1));

        topTitileLabel1.setBackground(new java.awt.Color(255, 204, 0));
        topTitileLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        topTitileLabel1.setForeground(new java.awt.Color(255, 255, 255));
        topTitileLabel1.setText("   RAIN APP");
        topTitileLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topTitileLabel1MouseDragged(evt);
            }
        });
        topTitileLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topTitileLabel1MousePressed(evt);
            }
        });
        jPanel2.add(topTitileLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 0, 676, 62));
        jPanel2.add(scrollPaneForList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 412, 480));

        adDetailPanel.setBackground(new java.awt.Color(34, 49, 63));
        adDetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dTtitle.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        dTtitle.setForeground(new java.awt.Color(255, 255, 255));
        dTtitle.setText("Title");
        adDetailPanel.add(dTtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        dPostcode.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dPostcode.setForeground(new java.awt.Color(255, 255, 255));
        dPostcode.setText("Postcode");
        adDetailPanel.add(dPostcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Contacts");
        adDetailPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 160, 20));

        dArea.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dArea.setForeground(new java.awt.Color(255, 255, 255));
        dArea.setText("Area");
        adDetailPanel.add(dArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        dCity.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dCity.setForeground(new java.awt.Color(255, 255, 255));
        dCity.setText("City");
        adDetailPanel.add(dCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        dFloorNo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dFloorNo.setForeground(new java.awt.Color(255, 255, 255));
        dFloorNo.setText("Altitude");
        adDetailPanel.add(dFloorNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, -1));

        dBathrooms.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dBathrooms.setForeground(new java.awt.Color(255, 255, 255));
        dBathrooms.setText("Bathrooms");
        adDetailPanel.add(dBathrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, -1));

        dBelcony.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dBelcony.setForeground(new java.awt.Color(255, 255, 255));
        dBelcony.setText("Belcony");
        adDetailPanel.add(dBelcony, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, -1));

        dRooms.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dRooms.setForeground(new java.awt.Color(255, 255, 255));
        dRooms.setText("Rooms");
        adDetailPanel.add(dRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, -1));

        dEmail.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dEmail.setForeground(new java.awt.Color(255, 255, 255));
        dEmail.setText("Owner email");
        adDetailPanel.add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

        dCustomerType.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dCustomerType.setForeground(new java.awt.Color(255, 255, 255));
        dCustomerType.setText("For Family and Bachelor");
        adDetailPanel.add(dCustomerType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, -1));

        dAdType.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dAdType.setForeground(new java.awt.Color(255, 255, 255));
        dAdType.setText("For sale or rent");
        adDetailPanel.add(dAdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));

        dImageOne.setBackground(new java.awt.Color(255, 255, 255));
        dImageOne.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        dImageOne.setForeground(new java.awt.Color(153, 153, 153));
        dImageOne.setText("   no image");
        dImageOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        adDetailPanel.add(dImageOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 100));

        dImageTwo.setBackground(new java.awt.Color(255, 255, 255));
        dImageTwo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        dImageTwo.setForeground(new java.awt.Color(153, 153, 153));
        dImageTwo.setText("   no image");
        dImageTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        adDetailPanel.add(dImageTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 110, 100));

        dImageThree.setBackground(new java.awt.Color(255, 255, 255));
        dImageThree.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        dImageThree.setForeground(new java.awt.Color(153, 153, 153));
        dImageThree.setText("   no image");
        dImageThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        adDetailPanel.add(dImageThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, 100));

        dOwnerName.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dOwnerName.setForeground(new java.awt.Color(255, 255, 255));
        dOwnerName.setText("Owner name");
        adDetailPanel.add(dOwnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));

        dContactNo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dContactNo.setForeground(new java.awt.Color(255, 255, 255));
        dContactNo.setText("Owner contact no.");
        adDetailPanel.add(dContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 180, -1));

        dPrice.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dPrice.setForeground(new java.awt.Color(255, 255, 255));
        dPrice.setText("Price");
        adDetailPanel.add(dPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        dMonth.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dMonth.setForeground(new java.awt.Color(255, 255, 255));
        dMonth.setText("Available from");
        adDetailPanel.add(dMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, -1));

        dStreet.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        dStreet.setForeground(new java.awt.Color(255, 255, 255));
        dStreet.setText("Street address");
        adDetailPanel.add(dStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));
        adDetailPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 20));
        adDetailPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, 10));

        jLabel13.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Interior");
        adDetailPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, 20));
        adDetailPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        jLabel21.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Adress");
        adDetailPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 20));
        adDetailPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        jLabel22.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Conditions");
        adDetailPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 20));
        adDetailPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 10));

        jLabel354305.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel354305.setForeground(new java.awt.Color(153, 153, 153));
        jLabel354305.setText("Description");
        adDetailPanel.add(jLabel354305, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 110, 20));
        adDetailPanel.add(dDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 150, 80));

        jPanel2.add(adDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 520, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void insetItemTest(){
    myPanelForList = new JPanel(new GridBagLayout());
   // myPanelForList.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = gbc.gridy = 0;
    
//    while(15 > gbc.gridy){
//        myPanelForList.add(new LolPanel("Rain"),gbc);
//        gbc.gridy++;
//    }
    
    for(int i = 0; i < adList.size(); i++){
        
        LittlePanel lp = new LittlePanel(adList.get(i).houseId, adList.get(i).title, adList.get(i).area, adList.get(i).city, 
                                         adList.get(i).street, adList.get(i).postcode, adList.get(i).noOfRooms,
                                         adList.get(i).noOfBelcony, adList.get(i).noOfBathrooms, adList.get(i).floorNo, adList.get(i).description, 
                                         adList.get(i).month, adList.get(i).price, adList.get(i).ownerName, adList.get(i).email, adList.get(i).getPassword(),
                                         adList.get(i).imageOne, adList.get(i).imageTwo, adList.get(i).imageThree, adList.get(i).contactNo,
                                         adList.get(i).adType, adList.get(i).customerType );
        lpList.add(lp);
        myPanelForList.add(lpList.get(i),gbc);
        gbc.gridy++;
    }
    
    scrollPaneForList.add(myPanelForList);
}

private void showDetailInfo(){
    Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    for(int i = 0 ; i < lpList.size() ; i++ ){
                    if(lpList.get(i).showDetail == true){
                        dTtitle.setText(lpList.get(i).title);
                        dArea.setText(lpList.get(i).area);
                        dCity.setText(lpList.get(i).city);
                        dStreet.setText(lpList.get(i).street);
                        dPostcode.setText(lpList.get(i).postcode);
                        dRooms.setText(lpList.get(i).noOfRooms+"");
                        dBelcony.setText(lpList.get(i).noOfBelcony+"");
                        dBathrooms.setText(lpList.get(i).noOfBathrooms+"");
                        dFloorNo.setText(lpList.get(i).floorNo+"");
                        dMonth.setText(lpList.get(i).month);
                        dPrice.setText(lpList.get(i).price+"");
                        dOwnerName.setText(lpList.get(i).ownerName);
                        dEmail.setText(lpList.get(i).email);
                        dContactNo.setText(lpList.get(i).contactNo);
                        dAdType.setText(lpList.get(i).adType);
                        dCustomerType.setText(lpList.get(i).customerType);
                        dDescription.setText(lpList.get(i).description);
                        
                        
                        Image img2 = null;
                        ImageIcon newImage = null;
                        
                        if(lpList.get(i).imageOne != null){
                            img2 = lpList.get(i).imageOne.getScaledInstance(dImageOne.getWidth(), dImageOne.getHeight(), Image.SCALE_SMOOTH);
                            newImage = new ImageIcon(img2);
                            dImageOne.setIcon(newImage);
                        }
                        
                        if(lpList.get(i).imageTwo != null){
                            img2 = lpList.get(i).imageTwo.getScaledInstance(dImageTwo.getWidth(), dImageTwo.getHeight(), Image.SCALE_SMOOTH);
                            newImage = new ImageIcon(img2);
                            dImageTwo.setIcon(newImage);
                        }
                        
                        if(lpList.get(i).imageThree != null){
                            img2 = lpList.get(i).imageThree.getScaledInstance(dImageThree.getWidth(), dImageThree.getHeight(), Image.SCALE_SMOOTH);
                            newImage = new ImageIcon(img2);
                            dImageThree.setIcon(newImage);
                        }
                        
                        lpList.get(i).showDetail = false;
                        adDetailPanel.show();
                    }
                }
                }
            }
        });
        t.start();        
}

    
private void downloadData(){
        Connection myConnection = null;
        Statement myStatement  = null;
        ResultSet myResultSet = null;
        ResultSetMetaData myMetaData = null;
        
        
        String sql = "select * from houseAd";
        
        try{
            // get connection to database
            myConnection = DriverManager.getConnection("jdbc:derby://localhost:1527/RentHouseDatabase", "rain013", "oopfinalproject");
            
            // creaTe statement
            myStatement = myConnection.createStatement();
            
            myResultSet = myStatement.executeQuery(sql);
            
            myMetaData = myResultSet.getMetaData();
            
            int columnCount = myMetaData.getColumnCount();
                       
            
            boolean found = false;
            
            while(myResultSet.next())
            {
                    HouseAd ad = new HouseAd();
                ad.houseId = myResultSet.getString("houseId");
                ad.title = myResultSet.getString("title");
                ad.area = myResultSet.getString("area");
                ad.city = myResultSet.getString("city");
                ad.street = myResultSet.getString("street");
                ad.postcode = myResultSet.getString("postcode");
                ad.noOfRooms = myResultSet.getInt("rooms");
                ad.noOfBelcony = myResultSet.getInt("belcony");
                ad.noOfBathrooms = myResultSet.getInt("bathrooms");
                ad.floorNo = myResultSet.getInt("floorNo");
                ad.description = myResultSet.getString("description");
                ad.month = myResultSet.getString("month");
                ad.price = myResultSet.getDouble("price");
                ad.ownerName = myResultSet.getString("ownerName");
                ad.email = myResultSet.getString("email");
                ad.setPassword(myResultSet.getString("password"));
                                        
                blobOne = myResultSet.getBlob("imageOne");
                if(blobOne != null){
                    BufferedImage bi = blobToBufferedImage(blobOne);
                    ad.imageOne = bi;
                }
                
                blobTwo = myResultSet.getBlob("imageTwo");
                if(blobTwo != null){
                    BufferedImage bi = blobToBufferedImage(blobTwo);
                    ad.imageTwo = bi ;
                }
                
                blobThree = myResultSet.getBlob("imageThree");
                if(blobThree != null){
                    BufferedImage bi = blobToBufferedImage(blobThree);
                    ad.imageThree = bi ;
                }
                
                    
                ad.contactNo = myResultSet.getString("contactNo");    
                ad.adType = myResultSet.getString("adType");          
                ad.customerType = myResultSet.getString("customerType");
                    
                adList.add(ad);
                    
            }
            
            
            
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    } 

public BufferedImage blobToBufferedImage(Blob blob) {
        
        BufferedImage newImage = null;
        
        try {           
            
            InputStream is = blob.getBinaryStream();
            BufferedImage img1 = ImageIO.read(is);
            //Image img2 = img1.getScaledInstance(imageLabelOne.getWidth(), imageLabelOne.getHeight(), Image.SCALE_SMOOTH);
            //newImage = new ImageIcon(img2); 
            newImage = img1;
            
        } catch (IOException | SQLException ex) {
            Logger.getLogger(EditAdPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return newImage;
        
    }



    
    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked

        setState(ViewAdsFrame.ICONIFIED);

    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void topTitileLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topTitileLabelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_topTitileLabelMouseDragged

    private void topTitileLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topTitileLabelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topTitileLabelMousePressed

    private void minimizeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeButton1MouseClicked

    private void backButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton1MouseClicked

    private void topTitileLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topTitileLabel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_topTitileLabel1MouseDragged

    private void topTitileLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topTitileLabel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_topTitileLabel1MousePressed


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
            java.util.logging.Logger.getLogger(ViewAdsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdsFrame().setVisible(true);
                
            }
        });
    }
    
    JPanel myPanelForList;
    ArrayList<HouseAd> adList = new ArrayList<>();
    ArrayList<LittlePanel> lpList = new ArrayList<>();
    Blob blobOne, blobTwo, blobThree;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adDetailPanel;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backButton1;
    private javax.swing.JLabel dAdType;
    private javax.swing.JLabel dArea;
    private javax.swing.JLabel dBathrooms;
    private javax.swing.JLabel dBelcony;
    private javax.swing.JLabel dCity;
    private javax.swing.JLabel dContactNo;
    private javax.swing.JLabel dCustomerType;
    private javax.swing.JLabel dDescription;
    private javax.swing.JLabel dEmail;
    private javax.swing.JLabel dFloorNo;
    private javax.swing.JLabel dImageOne;
    private javax.swing.JLabel dImageThree;
    private javax.swing.JLabel dImageTwo;
    private javax.swing.JLabel dMonth;
    private javax.swing.JLabel dOwnerName;
    private javax.swing.JLabel dPostcode;
    private javax.swing.JLabel dPrice;
    private javax.swing.JLabel dRooms;
    private javax.swing.JLabel dStreet;
    private javax.swing.JLabel dTtitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel354305;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel minimizeButton1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.ScrollPane scrollPaneForList;
    private java.awt.ScrollPane scrollPaneForList1;
    private javax.swing.JLabel topTitileLabel;
    private javax.swing.JLabel topTitileLabel1;
    // End of variables declaration//GEN-END:variables

    
}

