
package com.serveruiapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class Server extends javax.swing.JFrame {
    
       //Variable declaration
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dos;
    static OutputStream outputStream;
    String dataBuffer="";
    static Boolean state = true;
    String username, address = "localhost";
    //static timer t;
    static InetAddress ip;

    
    public Server() {
        initComponents();
        
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_incomingdatapacket = new javax.swing.JTextArea();
        jButton2_send = new javax.swing.JButton();
        jButton2_clear = new javax.swing.JButton();
        jLabel17_datapacket = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        stateC2Radiobutton = new javax.swing.JRadioButton();
        stateC1Radiobutton = new javax.swing.JRadioButton();
        stateB2Radiobutton = new javax.swing.JRadioButton();
        stateB1Radiobutton = new javax.swing.JRadioButton();
        stateA2Radiobutton = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        startserver_button1 = new javax.swing.JButton();
        jButton2_close = new javax.swing.JButton();
        jButton2_reset = new javax.swing.JButton();
        timer_combobox = new javax.swing.JComboBox<>();
        jLabel1_timer = new javax.swing.JLabel();
        jLabel2_selectstate = new javax.swing.JLabel();
        jLabel3_selectstate = new javax.swing.JLabel();
        state_combox = new javax.swing.JComboBox<>();
        jTextField13_selecteddata = new javax.swing.JTextField();
        jTextField_datareceied = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        stopserver_button2 = new javax.swing.JButton();
        jLabel4_servermode = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16_entermessage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVER");

        serverpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N

        textarea_incomingdatapacket.setColumns(20);
        textarea_incomingdatapacket.setRows(5);
        textarea_incomingdatapacket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textarea_incomingdatapacketKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textarea_incomingdatapacket);

        jButton2_send.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_send.setText("SEND");
        jButton2_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_sendActionPerformed(evt);
            }
        });

        jButton2_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_clear.setText("CLEAR");
        jButton2_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_clearActionPerformed(evt);
            }
        });

        jLabel17_datapacket.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17_datapacket.setText("Data Packet");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("00 :  00 : 60");
        jLabel18.setMaximumSize(new java.awt.Dimension(60, 18));
        jLabel18.setMinimumSize(new java.awt.Dimension(60, 18));
        jLabel18.setPreferredSize(new java.awt.Dimension(60, 18));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("00 : 02 :00 ");

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel21.setText("00 : 03 : 00");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setText("00 : 04 : 00");

        stateC2Radiobutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateC2Radiobutton.setText(" State C2");
        stateC2Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateC2RadiobuttonActionPerformed(evt);
            }
        });

        stateC1Radiobutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateC1Radiobutton.setText(" State C1");
        stateC1Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateC1RadiobuttonActionPerformed(evt);
            }
        });

        stateB2Radiobutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateB2Radiobutton.setText(" State B2");
        stateB2Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateB2RadiobuttonActionPerformed(evt);
            }
        });

        stateB1Radiobutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateB1Radiobutton.setText(" State B1");
        stateB1Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateB1RadiobuttonActionPerformed(evt);
            }
        });

        stateA2Radiobutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateA2Radiobutton.setText(" State A");
        stateA2Radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateA2RadiobuttonActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setText("00 : 05 : 00");

        startserver_button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startserver_button1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        startserver_button1.setText("START SERVER");
        startserver_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startserver_button1ActionPerformed(evt);
            }
        });

        jButton2_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_close.setText("CLOSE");
        jButton2_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_closeActionPerformed(evt);
            }
        });

        jButton2_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_reset.setText("RESET");
        jButton2_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_resetActionPerformed(evt);
            }
        });

        timer_combobox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        timer_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECT----", "1", "2", "3", "4", "5" }));
        timer_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timer_comboboxActionPerformed(evt);
            }
        });

        jLabel1_timer.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1_timer.setText("Timer");

        jLabel2_selectstate.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2_selectstate.setText("Select State");

        jLabel3_selectstate.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3_selectstate.setText("Select State");

        state_combox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        state_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECT----", "2", "3", "4", "5", "6" }));
        state_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state_comboxActionPerformed(evt);
            }
        });

        jTextField13_selecteddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13_selecteddataActionPerformed(evt);
            }
        });
        jTextField13_selecteddata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13_selecteddataKeyTyped(evt);
            }
        });

        jTextField_datareceied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_datareceiedActionPerformed(evt);
            }
        });
        jTextField_datareceied.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_datareceiedKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("SELECTED DATA");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("SEND DATA RECEIVED");

        stopserver_button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stopserver_button2.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        stopserver_button2.setText("STOP SERVER");
        stopserver_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopserver_button2ActionPerformed(evt);
            }
        });

        jLabel4_servermode.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4_servermode.setText("Server mode");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel16_entermessage1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16_entermessage1.setText("Server IP Address");

        javax.swing.GroupLayout serverpanelLayout = new javax.swing.GroupLayout(serverpanel);
        serverpanel.setLayout(serverpanelLayout);
        serverpanelLayout.setHorizontalGroup(
            serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4_servermode)
                .addGap(39, 39, 39)
                .addComponent(startserver_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(stopserver_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel16_entermessage1)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2_selectstate)
                .addGap(40, 40, 40)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateA2Radiobutton)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateB1Radiobutton)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel20)))
                .addGap(41, 41, 41)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateB2Radiobutton)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel21)))
                .addGap(54, 54, 54)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateC1Radiobutton)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel25)))
                .addGap(47, 47, 47)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateC2Radiobutton)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3_selectstate)
                .addGap(38, 38, 38)
                .addComponent(state_combox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(timer_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel15)
                .addGap(451, 451, 451)
                .addComponent(jLabel14))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2_send, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jTextField13_selecteddata, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jTextField_datareceied, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17_datapacket, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton2_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton2_close, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton2_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        serverpanelLayout.setVerticalGroup(
            serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverpanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4_servermode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startserver_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopserver_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16_entermessage1))
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_selectstate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serverpanelLayout.createSequentialGroup()
                                .addComponent(stateA2Radiobutton)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(serverpanelLayout.createSequentialGroup()
                                .addComponent(stateB1Radiobutton)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addGroup(serverpanelLayout.createSequentialGroup()
                                .addComponent(stateB2Radiobutton)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel21))
                            .addGroup(serverpanelLayout.createSequentialGroup()
                                .addComponent(stateC1Radiobutton)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel25))
                            .addGroup(serverpanelLayout.createSequentialGroup()
                                .addComponent(stateC2Radiobutton)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel26)))))
                .addGap(18, 18, 18)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3_selectstate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_timer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timer_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(6, 6, 6)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton2_send, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField13_selecteddata, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_datareceied, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serverpanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel17_datapacket))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(serverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2_clear)
                    .addComponent(jButton2_close)
                    .addComponent(jButton2_reset)))
        );

        getContentPane().add(serverpanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_sendActionPerformed
      
//        String state_combox = "";
//        String timer_combobox = "";
//       
        String dataToSend="";
//        
          if(state_combox.isShowing()){
            dataToSend = jTextField_datareceied.getName();//none
        }
        
//         if(jRadioButtonMenuItem_newLine.isSelected()){
//            dataToSend = jTextField_datareceied.getText() +"\n";//new line 
//        } 
        
//         if (state_combox.getSelectedIndex() != 0) {
//            state= state_combox.getSelectedItem().toString();
//        }


//            if(stateA2Radiobutton.isSelected()){
//                JOptionPane.showMessageDialog(this, stateA2Radiobutton.getAction() + "--Selected");
        
                state_combox.setEnabled(true);
                //timer_combobox.setEnabled(true);
        
//            }
//            else{
//                JOptionPane.showMessageDialog(this,stateA2Radiobutton.getAction()+ "--Not selected");
//
//            }
      
         if(stateA2Radiobutton.isSelected()){
          new Thread(new Runnable() {
           @Override
           public void run() {
              // String msgout = "";
                 int i =60;
                // int flag = 1;
//                msgout = "You have only " +i +" seconds time left.";
//                textarea.append("\n Client: " + msgout + "\n");
//                try{
//                 dos.writeUTF(msgout);
//                }
//                catch (Exception e){
//                    
//                }
       while (i>0){
//           
//            String msgout = "";
//                         msgout = textfield1.getText().trim();
//                         textarea.append("");
//                         try {
//                             //dos.writeUTF(msgout);
//                         } catch (IOException ex1) {
//                             Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex1);
//                         }
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    
          jLabel18.setText("00:"+i);
           i--;
           
       }
       //String msg = "";
               // msg = "You have only " +i +" seconds time left.";
                //textarea.append("\n Client: " + msg + "\n");
//                try{
//                 dos.writeUTF(msg);
//                }
//                catch (Exception e){
//                    
//                }
                
        
           }
       }).start();
          
      }
    
//           Boolean localTempData = state;
//           if (localTempData != null && !localTempData.equals("")) {try {
//               //!= not equal to
//               outputStream.write(localTempData.compareTo(false));
//            } catch (IOException ex) {
//                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
//            }
//               jTextField_datareceied.setText("");
//           }
    
//send action logic to 
  
        try {
            String msgout = "";
            msgout = textarea_incomingdatapacket.getText().trim();
            dos.writeUTF(msgout);
           textarea_incomingdatapacket.append("\nServer : " + msgout + "\n");
            
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton2_sendActionPerformed

    private void jButton2_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_clearActionPerformed
 
        dataBuffer = "";
        jTextField13_selecteddata.setText("");
        jTextField_datareceied.setText("");
        textarea_incomingdatapacket.setText("");
        jTextField1.setText("");
        
    }//GEN-LAST:event_jButton2_clearActionPerformed

    private void stateC2RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateC2RadiobuttonActionPerformed

        if (stateC2Radiobutton.isSelected()) {
            state_combox.setSelectedItem("6");
           // timer_combobox.setSelectedItem("00:00:01");
            stateA2Radiobutton.setEnabled(false);
            stateB1Radiobutton.setEnabled(false);
            stateB2Radiobutton.setEnabled(false);
            stateC1Radiobutton.setEnabled(false);
        } else if (!stateC2Radiobutton.isSelected()) {
            stateA2Radiobutton.setEnabled(true);
            stateB1Radiobutton.setEnabled(true);
            stateB2Radiobutton.setEnabled(true);
            stateC1Radiobutton.setEnabled(true);
        }
    }//GEN-LAST:event_stateC2RadiobuttonActionPerformed

    private void stateC1RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateC1RadiobuttonActionPerformed

        if (stateC1Radiobutton.isSelected()) {
            state_combox.setSelectedItem("5");
          //  timer_combobox.setSelectedItem("00:00:03");
            stateA2Radiobutton.setEnabled(false);
            stateB1Radiobutton.setEnabled(false);
            stateB2Radiobutton.setEnabled(false);
            stateC2Radiobutton.setEnabled(false);
        } else if (!stateC1Radiobutton.isSelected()) {
            stateA2Radiobutton.setEnabled(true);
            stateB1Radiobutton.setEnabled(true);
            stateB2Radiobutton.setEnabled(true);
            stateC2Radiobutton.setEnabled(true);
        }
    }//GEN-LAST:event_stateC1RadiobuttonActionPerformed

    private void stateB2RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateB2RadiobuttonActionPerformed

        if (stateB2Radiobutton.isSelected()) {
            state_combox.setSelectedItem("4");
           // timer_combobox.setSelectedItem("05");
            stateA2Radiobutton.setEnabled(false);
            stateB1Radiobutton.setEnabled(false);
            stateC1Radiobutton.setEnabled(false);
            stateC2Radiobutton.setEnabled(false);
        } else if (!stateB2Radiobutton.isSelected()) {
            stateA2Radiobutton.setEnabled(true);
            stateB1Radiobutton.setEnabled(true);
            stateC1Radiobutton.setEnabled(true);
            stateC2Radiobutton.setEnabled(true);
        }
    }//GEN-LAST:event_stateB2RadiobuttonActionPerformed

    private void stateB1RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateB1RadiobuttonActionPerformed

        if (stateB1Radiobutton.isSelected()) {
            state_combox.setSelectedItem("3");
           // timer_combobox.setSelectedItem("10");
            stateA2Radiobutton.setEnabled(false);
            stateB2Radiobutton.setEnabled(false);
            stateC1Radiobutton.setEnabled(false);
            stateC2Radiobutton.setEnabled(false);
        } else if (!stateB1Radiobutton.isSelected()) {
            stateA2Radiobutton.setEnabled(true);
            stateB2Radiobutton.setEnabled(true);
            stateC1Radiobutton.setEnabled(true);
            stateC2Radiobutton.setEnabled(true);
       }

    }//GEN-LAST:event_stateB1RadiobuttonActionPerformed

    private void stateA2RadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateA2RadiobuttonActionPerformed

            textarea_incomingdatapacket.setEditable(false);
        textarea_incomingdatapacket.append(" Server has been started \n Waiting for connection ... ");
        textarea_incomingdatapacket.append(" \n ");

        
    if (stateA2Radiobutton.isSelected()) {
            state_combox.setSelectedItem("2");
           // timer_combobox.setSelectedItem("1");
            stateB1Radiobutton.setEnabled(false);
            stateB2Radiobutton.setEnabled(false);
            stateC1Radiobutton.setEnabled(false);
            stateC2Radiobutton.setEnabled(false);
        } else if (!stateA2Radiobutton.isSelected()) {
            stateB1Radiobutton.setEnabled(true);
            stateB2Radiobutton.setEnabled(true);
            stateC1Radiobutton.setEnabled(true);
            stateC2Radiobutton.setEnabled(true);
       }
    
         
    }//GEN-LAST:event_stateA2RadiobuttonActionPerformed

    private void startserver_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startserver_button1ActionPerformed
        
    

    }//GEN-LAST:event_startserver_button1ActionPerformed

    private void jButton2_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_closeActionPerformed
        
        this.setVisible(false);

    }//GEN-LAST:event_jButton2_closeActionPerformed

    private void jButton2_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_resetActionPerformed
        // TODO add your handling code here:
        
        stateA2Radiobutton.setSelected(false);
        stateB1Radiobutton.setSelected(false);
        stateB2Radiobutton.setSelected(false);
        stateC1Radiobutton.setSelected(false);
        stateC2Radiobutton.setSelected(false);
                  
    }//GEN-LAST:event_jButton2_resetActionPerformed

    private void timer_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer_comboboxActionPerformed
        // TODO add your handling code here:
        
        
        String getTimerSelected = timer_combobox.getSelectedItem().toString();
        String getStateSelected = state_combox.getSelectedItem().toString();
        jTextField13_selecteddata.setText(getTimerSelected+getStateSelected);
    }//GEN-LAST:event_timer_comboboxActionPerformed

    private void jTextField13_selecteddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13_selecteddataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13_selecteddataActionPerformed

    private void jTextField13_selecteddataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13_selecteddataKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_jTextField13_selecteddataKeyTyped

    private void jTextField_datareceiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_datareceiedActionPerformed

    }//GEN-LAST:event_jTextField_datareceiedActionPerformed

    private void jTextField_datareceiedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_datareceiedKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_datareceiedKeyTyped

    private void stopserver_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopserver_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopserver_button2ActionPerformed

    private void state_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state_comboxActionPerformed
        // TODO add your handling code here:
        
        String getStateSelected = state_combox.getSelectedItem().toString();
       // String gettimer_comboboxlSelected = timer_combobox.getSelectedItem().toString();
        jTextField13_selecteddata.setText(getStateSelected);
    }//GEN-LAST:event_state_comboxActionPerformed

    private void textarea_incomingdatapacketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textarea_incomingdatapacketKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_textarea_incomingdatapacketKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
         jTextField1.setText("Server IP : ");
      

       // jTextField1.setText("localhost");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        
          try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed
  
   
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        
        try {
            String msg = "";
            ss = new ServerSocket(2048);
            s = ss.accept();
            dis = new DataInputStream(s.getInputStream());//Read the data(incoming to sever) we use the method--> getInputStream
            dos = new DataOutputStream(s.getOutputStream());//To send the data(ougoing to client) we use the method-->getOutPutStream
            System.err.print("Server started");
            while (!msg.equals("exit")) {
                
            msg = dis.readUTF();
          textarea_incomingdatapacket.append("\n Client: " + msg );
            textarea_incomingdatapacket.setText(textarea_incomingdatapacket.getText().trim() + msg);//Displaying the message from client

            }
        } catch (IOException e) {
            System.out.println(e);
          //textarea_incomingdatapacket.append("The client has stopped... \n");

        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_clear;
    private javax.swing.JButton jButton2_close;
    private javax.swing.JButton jButton2_reset;
    private javax.swing.JButton jButton2_send;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16_entermessage1;
    private javax.swing.JLabel jLabel17_datapacket;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_timer;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel2_selectstate;
    private javax.swing.JLabel jLabel3_selectstate;
    private javax.swing.JLabel jLabel4_servermode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13_selecteddata;
    private javax.swing.JTextField jTextField_datareceied;
    private javax.swing.JPanel serverpanel;
    private javax.swing.JButton startserver_button1;
    private javax.swing.JRadioButton stateA2Radiobutton;
    private javax.swing.JRadioButton stateB1Radiobutton;
    private javax.swing.JRadioButton stateB2Radiobutton;
    private javax.swing.JRadioButton stateC1Radiobutton;
    private javax.swing.JRadioButton stateC2Radiobutton;
    private javax.swing.JComboBox<String> state_combox;
    private javax.swing.JButton stopserver_button2;
    private static javax.swing.JTextArea textarea_incomingdatapacket;
    private javax.swing.JComboBox<String> timer_combobox;
    // End of variables declaration//GEN-END:variables
}
