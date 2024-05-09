package com.embedsquare.serveruiapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Server extends javax.swing.JFrame {

    //Variable declaration
    private static ServerSocket ss;
    private static Socket s;
    private static DataInputStream dis;
    private static OutputStream dos;
    private static OutputStream outputStream;
    String dataBuffer = "";
    static Boolean state = true;
    String username, address = "localhost";
    private static InetAddress ip;
    private Thread timerThread = null;
    private boolean shouldKill = false;
    private final String HEALTH_MESSAGE = "HEALTH";
    private final int PORT_NUMBER = 70;
    private JLabel selectedTime = null;

    public Server() {
        initComponents();

        setResizable(true);
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
        stateATime = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        stateB1Time = new javax.swing.JLabel();
        stateB2Time = new javax.swing.JLabel();
        stateC1Time = new javax.swing.JLabel();
        stateC2RadioButton = new javax.swing.JRadioButton();
        stateC1RadioButton = new javax.swing.JRadioButton();
        stateB2RadioButton = new javax.swing.JRadioButton();
        stateB1RadioButton = new javax.swing.JRadioButton();
        stateARadioButton = new javax.swing.JRadioButton();
        stateC2Time = new javax.swing.JLabel();
        startserver_button1 = new javax.swing.JButton();
        jButton2_reset = new javax.swing.JButton();
        timer_combobox = new javax.swing.JComboBox<>();
        jLabel1_timer = new javax.swing.JLabel();
        jLabel2_selectstate = new javax.swing.JLabel();
        userselected = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stopserver_button2 = new javax.swing.JButton();
        jLabel4_servermode = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVER");
        setMinimumSize(new java.awt.Dimension(1024, 650));

        serverpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        serverpanel.setMinimumSize(new java.awt.Dimension(1090, 780));
        serverpanel.setPreferredSize(new java.awt.Dimension(1024, 650));
        serverpanel.setLayout(null);

        textarea_incomingdatapacket.setColumns(20);
        textarea_incomingdatapacket.setRows(5);
        textarea_incomingdatapacket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textarea_incomingdatapacketKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textarea_incomingdatapacket);

        serverpanel.add(jScrollPane1);
        jScrollPane1.setBounds(167, 373, 768, 214);

        jButton2_send.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_send.setText("SEND");
        jButton2_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_sendActionPerformed(evt);
            }
        });
        serverpanel.add(jButton2_send);
        jButton2_send.setBounds(24, 294, 96, 50);

        jButton2_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_clear.setText("CLEAR");
        jButton2_clear.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton2_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_clearActionPerformed(evt);
            }
        });
        serverpanel.add(jButton2_clear);
        jButton2_clear.setBounds(840, 600, 100, 40);

        jLabel17_datapacket.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17_datapacket.setText("Data Packet");
        serverpanel.add(jLabel17_datapacket);
        jLabel17_datapacket.setBounds(24, 384, 112, 21);

        stateATime.setBackground(new java.awt.Color(204, 204, 255));
        stateATime.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        stateATime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateATime.setText("00:00");
        stateATime.setIconTextGap(6);
        stateATime.setMaximumSize(new java.awt.Dimension(60, 18));
        stateATime.setMinimumSize(new java.awt.Dimension(60, 18));
        stateATime.setOpaque(true);
        stateATime.setPreferredSize(new java.awt.Dimension(60, 20));
        serverpanel.add(stateATime);
        stateATime.setBounds(180, 110, 100, 25);
        serverpanel.add(jLabel19);
        jLabel19.setBounds(0, 0, 0, 0);

        stateB1Time.setBackground(new java.awt.Color(204, 204, 255));
        stateB1Time.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        stateB1Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateB1Time.setText("00:00");
        stateB1Time.setIconTextGap(6);
        stateB1Time.setOpaque(true);
        stateB1Time.setPreferredSize(new java.awt.Dimension(60, 20));
        serverpanel.add(stateB1Time);
        stateB1Time.setBounds(310, 110, 100, 25);

        stateB2Time.setBackground(new java.awt.Color(204, 204, 255));
        stateB2Time.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        stateB2Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateB2Time.setText("00:00");
        stateB2Time.setIconTextGap(6);
        stateB2Time.setOpaque(true);
        stateB2Time.setPreferredSize(new java.awt.Dimension(60, 20));
        serverpanel.add(stateB2Time);
        stateB2Time.setBounds(440, 110, 100, 25);

        stateC1Time.setBackground(new java.awt.Color(204, 204, 255));
        stateC1Time.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        stateC1Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateC1Time.setText("00:00");
        stateC1Time.setIconTextGap(6);
        stateC1Time.setOpaque(true);
        stateC1Time.setPreferredSize(new java.awt.Dimension(60, 20));
        serverpanel.add(stateC1Time);
        stateC1Time.setBounds(570, 110, 100, 25);

        stateC2RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stateC2RadioButton.setText(" State C2(6)");
        stateC2RadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateC2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateC2RadioButtonActionPerformed(evt);
            }
        });
        serverpanel.add(stateC2RadioButton);
        stateC2RadioButton.setBounds(690, 80, 120, 27);

        stateC1RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stateC1RadioButton.setText(" State C1(5)");
        stateC1RadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateC1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateC1RadioButtonActionPerformed(evt);
            }
        });
        serverpanel.add(stateC1RadioButton);
        stateC1RadioButton.setBounds(564, 80, 113, 27);

        stateB2RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stateB2RadioButton.setText(" State B2(4)");
        stateB2RadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateB2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateB2RadioButtonActionPerformed(evt);
            }
        });
        serverpanel.add(stateB2RadioButton);
        stateB2RadioButton.setBounds(430, 80, 120, 27);

        stateB1RadioButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stateB1RadioButton.setText(" State B1(3)");
        stateB1RadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateB1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateB1RadioButtonActionPerformed(evt);
            }
        });
        serverpanel.add(stateB1RadioButton);
        stateB1RadioButton.setBounds(300, 80, 120, 27);

        stateARadioButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        stateARadioButton.setText(" State A(2)");
        stateARadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateARadioButtonActionPerformed(evt);
            }
        });
        serverpanel.add(stateARadioButton);
        stateARadioButton.setBounds(169, 80, 110, 27);

        stateC2Time.setBackground(new java.awt.Color(204, 204, 255));
        stateC2Time.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        stateC2Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateC2Time.setText("00:00");
        stateC2Time.setIconTextGap(6);
        stateC2Time.setOpaque(true);
        stateC2Time.setPreferredSize(new java.awt.Dimension(60, 20));
        serverpanel.add(stateC2Time);
        stateC2Time.setBounds(700, 110, 100, 25);

        startserver_button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startserver_button1.setText("START COMMUNICATION");
        startserver_button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startserver_button1.setInheritsPopupMenu(true);
        startserver_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startserver_button1ActionPerformed(evt);
            }
        });
        serverpanel.add(startserver_button1);
        startserver_button1.setBounds(170, 15, 210, 40);

        jButton2_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2_reset.setText("RESET");
        jButton2_reset.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton2_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_resetActionPerformed(evt);
            }
        });
        serverpanel.add(jButton2_reset);
        jButton2_reset.setBounds(720, 600, 100, 40);

        timer_combobox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        timer_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECT----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "20", "25", "30" }));
        timer_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timer_comboboxActionPerformed(evt);
            }
        });
        serverpanel.add(timer_combobox);
        timer_combobox.setBounds(170, 160, 172, 40);

        jLabel1_timer.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1_timer.setText("Timer");
        serverpanel.add(jLabel1_timer);
        jLabel1_timer.setBounds(26, 160, 90, 32);

        jLabel2_selectstate.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2_selectstate.setText("Select State");
        serverpanel.add(jLabel2_selectstate);
        jLabel2_selectstate.setBounds(24, 69, 105, 44);

        userselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userselectedActionPerformed(evt);
            }
        });
        userselected.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userselectedKeyTyped(evt);
            }
        });
        serverpanel.add(userselected);
        userselected.setBounds(167, 282, 770, 73);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Data To SECC Board");
        serverpanel.add(jLabel15);
        jLabel15.setBounds(167, 256, 190, 20);

        stopserver_button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stopserver_button2.setText("STOP SERVER");
        stopserver_button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stopserver_button2.setInheritsPopupMenu(true);
        stopserver_button2.setPreferredSize(new java.awt.Dimension(134, 28));
        stopserver_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopserver_button2ActionPerformed(evt);
            }
        });
        serverpanel.add(stopserver_button2);
        stopserver_button2.setBounds(400, 15, 140, 40);

        jLabel4_servermode.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4_servermode.setText("Server mode");
        serverpanel.add(jLabel4_servermode);
        jLabel4_servermode.setBounds(24, 17, 106, 32);

        jLabel22.setBackground(new java.awt.Color(204, 204, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Min");
        jLabel22.setMaximumSize(new java.awt.Dimension(60, 18));
        jLabel22.setMinimumSize(new java.awt.Dimension(60, 18));
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(60, 18));
        serverpanel.add(jLabel22);
        jLabel22.setBounds(350, 160, 70, 40);

        getContentPane().add(serverpanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stopserver_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopserver_button2ActionPerformed
      
        stopserver_button2.setBackground(new java.awt.Color(240,12,12));
        textarea_incomingdatapacket.append("\nServer has been stopped.");
      //  textarea_incomingdatapacket.append("\n");

        shouldKill = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Exception in sleeping current stop thread");
        }
        ss = null;
    }//GEN-LAST:event_stopserver_button2ActionPerformed

    private void userselectedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userselectedKeyTyped
       
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_userselectedKeyTyped

    private void userselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userselectedActionPerformed

        
    }//GEN-LAST:event_userselectedActionPerformed

    private void timer_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer_comboboxActionPerformed

   
       String getstateARadioButtonSelected = stateARadioButton.getText();
       String getstateB1RadioButtonSelected = stateB1RadioButton.getText();
       String getstateB2RadioButtonSelected = stateB2RadioButton.getText();
       String getstateC1RadioButtonSelected = stateC1RadioButton.getText();
       String getstateC2RadioButtonSelected = stateC2RadioButton.getText();
     
        String getTimerSelected = timer_combobox.getSelectedItem().toString();
        userselected.setText(getstateARadioButtonSelected+getTimerSelected);

    }//GEN-LAST:event_timer_comboboxActionPerformed

    
    private void jButton2_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_resetActionPerformed
        
        stateATime.setText("00:00");
        stateB1Time.setText("00:00");
        stateB2Time.setText("00:00");
        stateC1Time.setText("00:00");
        stateC2Time.setText("00:00");
        timer_combobox.setSelectedIndex(0);
        enableDisableRadioButtons(null);
    }//GEN-LAST:event_jButton2_resetActionPerformed

    private void startserver_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startserver_button1ActionPerformed

        startserver_button1.setBackground(new java.awt.Color(0,137,51));
        Runnable serverRunnable = new Runnable() {

            @Override
            public void run() {

                try {
                    String msg = "";

                    // starts server and waits for a connection
//                    ss = new ServerSocket(PORT_NUMBER);
                  //  ss = new ServerSocket(PORT_NUMBER, 10, InetAddress.getByName("Localhost"));


                    textarea_incomingdatapacket.append(" Server has been started \n Waiting for connection ... \n");
                    textarea_incomingdatapacket.append(" Server started at " + ss.getInetAddress() + "\n");
                    textarea_incomingdatapacket.append("Port is  " + PORT_NUMBER + "\n");
                    textarea_incomingdatapacket.append(" Server started name " + ss.getInetAddress().getHostName() + "\n");
                    textarea_incomingdatapacket.append(" \n ");

                    s = ss.accept();
                    System.out.println("Client connected");

                    dis = new DataInputStream(s.getInputStream());//Read the data(incoming to sever) we use the method--> getInputStream
                    dos = s.getOutputStream();//To send the data(ougoing to client) we use the method-->getOutPutStream
                    InputStreamReader is = new InputStreamReader(dis);
                    BufferedReader reader = new BufferedReader(is);
                    while (!msg.equals("exit")) {

                        msg = reader.readLine();
                        System.out.println("Message from client: "+msg);
                        textarea_incomingdatapacket.setText(textarea_incomingdatapacket.getText().trim() + msg);//Displaying the message from client

                    }
                } catch (IOException e) {
                    System.out.println(e);
                    // textarea_incomingdatapacket.append("The client has stopped... \n");

                }
            }
        };

        Thread t = new Thread(serverRunnable);
        t.start();
        //        shouldKill = true;
    }//GEN-LAST:event_startserver_button1ActionPerformed

    private void stateARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateARadioButtonActionPerformed

//        int timeSelectedByUser = 0;
//        selectedTime = null;
//        if (stateARadioButton.isSelected()) {
//            selectedTime = stateATime;
//        }
//        try {
//            timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
//        } catch (Exception ex) {
//            System.err.println("Exception  while parsing time data");
//        }
//        userSelectedData.setText(HEALTH_MESSAGE + "," + StateENUM.A.getStateValue() + "," + timeSelectedByUser);
          
        String getstateARadioButtonSelected = stateARadioButton.getText();
        userselected.setText(getstateARadioButtonSelected);
        textarea_incomingdatapacket.setEditable(false);
        enableDisableRadioButtons(stateARadioButton);


    }//GEN-LAST:event_stateARadioButtonActionPerformed

    private void stateB1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateB1RadioButtonActionPerformed

        String getstateB1RadioButtonSelected = stateB1RadioButton.getText();
        userselected.setText(getstateB1RadioButtonSelected);
        textarea_incomingdatapacket.setEditable(false);
        //     textarea_incomingdatapacket.append(" Server has been started \n Waiting for connection ... ");
        enableDisableRadioButtons(stateB1RadioButton);

    }//GEN-LAST:event_stateB1RadioButtonActionPerformed

    private void stateB2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateB2RadioButtonActionPerformed

         String getstateB2RadioButtonSelected = stateB2RadioButton.getText();
          userselected.setText(getstateB2RadioButtonSelected);
        enableDisableRadioButtons(stateB2RadioButton);
    }//GEN-LAST:event_stateB2RadioButtonActionPerformed

    private void stateC1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateC1RadioButtonActionPerformed

         String getstateC1RadioButtonSelected = stateC1RadioButton.getText();
          userselected.setText(getstateC1RadioButtonSelected);
        enableDisableRadioButtons(stateC1RadioButton);
    }//GEN-LAST:event_stateC1RadioButtonActionPerformed

    private void stateC2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateC2RadioButtonActionPerformed


         String getstateC2RadioButtonSelected = stateC2RadioButton.getText();
          userselected.setText(getstateC2RadioButtonSelected);
        enableDisableRadioButtons(stateC2RadioButton);
    }//GEN-LAST:event_stateC2RadioButtonActionPerformed

    private void jButton2_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_clearActionPerformed

       
        dataBuffer = "";
        userselected.setText("");
        textarea_incomingdatapacket.setText("");
//        jTextField1.setText("");
    }//GEN-LAST:event_jButton2_clearActionPerformed

    private void jButton2_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_sendActionPerformed
        timer_combobox.setEnabled(false);
        System.err.println("stateARadioButton.isSelected() :" + stateARadioButton.isSelected());
        shouldKill = false;
        if (stateARadioButton.isSelected()) {
            System.err.println("inside if");
            timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int timeSelectedByUser = 0;
                    try {
                        timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
                    } catch (Exception ex) {
                        System.err.println("ex : " + ex);
                        return;
                    }
                    System.err.println("timeSelectedByUser : " + timeSelectedByUser);
                    int i = 60;

                    while (i > 0 && !shouldKill && timeSelectedByUser > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (i == 1) {
                            timeSelectedByUser--;
                            i = 60;
                        }
                        if (i < 10) {
                            stateATime.setText(timeSelectedByUser + " :0" + i);
                        } else {
                            if (timeSelectedByUser == 0) {
                                i = 0;
                            }
                            stateATime.setText(timeSelectedByUser + " : " + i);
                        }
                        textarea_incomingdatapacket.setText("");
                        textarea_incomingdatapacket.setText(HEALTH_MESSAGE + ", 2" + " ," + timeSelectedByUser);
                        i--;

                        try {
                            String msgout = "";
                            msgout = textarea_incomingdatapacket.getText().trim();
                            dos.write(msgout.getBytes());
                            dos.flush();
                            textarea_incomingdatapacket.append("\nClient : " + msgout);

                        } catch (Exception e) {
                            System.err.println("Sent the code");

                        }

                    }
                    timer_combobox.setEnabled(true);
                }
            });

        }

        timer_combobox.setEnabled(false);
        System.err.println("stateB1RadioButton.isSelected() :" + stateB1RadioButton.isSelected());
        shouldKill = false;
        if (stateB1RadioButton.isSelected()) {
            System.err.println("inside if");
            timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int timeSelectedByUser = 0;
                    try {
                        timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
                    } catch (Exception ex) {
                        System.err.println("ex : " + ex);
                        return;
                    }
                    System.err.println("timeSelectedByUser : " + timeSelectedByUser);
                    int i = 60;

                    while (i > 0 && !shouldKill && timeSelectedByUser > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (i == 1) {
                            timeSelectedByUser--;
                            i = 60;
                        }
                        if (i < 10) {
                            stateB1Time.setText(timeSelectedByUser + " :0" + i);
                        } else {
                            if (timeSelectedByUser == 0) {
                                i = 0;
                            }
                            stateB1Time.setText(timeSelectedByUser + " : " + i);
                        }
                        textarea_incomingdatapacket.setText("");
                        textarea_incomingdatapacket.setText(HEALTH_MESSAGE + ", 3" + " ," + timeSelectedByUser);
                        i--;

                        try {
                            String msgout = "";
                            msgout = textarea_incomingdatapacket.getText().trim();
                            dos.write(msgout.getBytes());
                            dos.flush();
                            textarea_incomingdatapacket.append("\nClient : " + msgout);

                        } catch (Exception e) {
                            System.err.println("Sent the code");

                        }

                    }
                    timer_combobox.setEnabled(true);
                }
            });

        }

        timer_combobox.setEnabled(false);
        System.err.println("stateB2RadioButton.isSelected() :" + stateB2RadioButton.isSelected());
        shouldKill = false;
        if (stateB2RadioButton.isSelected()) {
            System.err.println("inside if");
            timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int timeSelectedByUser = 0;
                    try {
                        timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
                    } catch (Exception ex) {
                        System.err.println("ex : " + ex);
                        return;
                    }
                    System.err.println("timeSelectedByUser : " + timeSelectedByUser);
                    int i = 60;

                    while (i > 0 && !shouldKill && timeSelectedByUser > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (i == 1) {
                            timeSelectedByUser--;
                            i = 60;
                        }
                        if (i < 10) {
                            stateB2Time.setText(timeSelectedByUser + " :0" + i);
                        } else {
                            if (timeSelectedByUser == 0) {
                                i = 0;
                            }
                            stateB2Time.setText(timeSelectedByUser + " : " + i);
                        }
                        textarea_incomingdatapacket.setText("");
                        textarea_incomingdatapacket.setText(HEALTH_MESSAGE + ", 4" + " ," + timeSelectedByUser);
                        i--;

                        try {
                            String msgout = "";
                            msgout = textarea_incomingdatapacket.getText().trim();
                            dos.write(msgout.getBytes());
                            dos.flush();
                            textarea_incomingdatapacket.append("\nClient : " + msgout);

                        } catch (Exception e) {
                            System.err.println("Sent the code");

                        }

                    }
                    timer_combobox.setEnabled(true);
                }
            });

        }

        timer_combobox.setEnabled(false);
        System.err.println("stateC1RadioButton.isSelected() :" + stateC1RadioButton.isSelected());
        shouldKill = false;
        if (stateC1RadioButton.isSelected()) {
            System.err.println("inside if");
            timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int timeSelectedByUser = 0;
                    try {
                        timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
                    } catch (Exception ex) {
                        System.err.println("ex : " + ex);
                        return;
                    }
                    System.err.println("timeSelectedByUser : " + timeSelectedByUser);
                    int i = 60;

                    while (i > 0 && !shouldKill && timeSelectedByUser > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (i == 1) {
                            timeSelectedByUser--;
                            i = 60;
                        }
                        if (i < 10) {
                            stateC1Time.setText(timeSelectedByUser + " :0" + i);
                        } else {
                            if (timeSelectedByUser == 0) {
                                i = 0;
                            }
                            stateC1Time.setText(timeSelectedByUser + " : " + i);
                        }
                        textarea_incomingdatapacket.setText("");
                        textarea_incomingdatapacket.setText(HEALTH_MESSAGE + ", 5" + " ," + timeSelectedByUser);
                        i--;

                        try {
                            String msgout = "";
                            msgout = textarea_incomingdatapacket.getText().trim();
                            dos.write(msgout.getBytes());
                            dos.flush();
                            textarea_incomingdatapacket.append("\nClient : " + msgout);

                        } catch (Exception e) {
                            System.err.println("Sent the code");

                        }

                    }
                    timer_combobox.setEnabled(true);
                }
            });

        }

        timer_combobox.setEnabled(false);
        System.err.println("stateC2RadioButton.isSelected() :" + stateC2RadioButton.isSelected());
        shouldKill = false;
        if (stateC2RadioButton.isSelected()) {
            System.err.println("inside if");
            timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int timeSelectedByUser = 0;
                    try {
                        timeSelectedByUser = Integer.parseInt(timer_combobox.getSelectedItem().toString());
                    } catch (Exception ex) {
                        System.err.println("ex : " + ex);
                        return;
                    }
                    System.err.println("timeSelectedByUser : " + timeSelectedByUser);
                    int i = 60;

                    while (i > 0 && !shouldKill && timeSelectedByUser > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (i == 1) {
                            timeSelectedByUser--;
                            i = 60;
                        }
                        if (i < 10) {
                            stateC2Time.setText(timeSelectedByUser + " :0" + i);
                        } else {
                            if (timeSelectedByUser == 0) {
                                i = 0;
                            }
                            stateC2Time.setText(timeSelectedByUser + " : " + i);
                        }
                        textarea_incomingdatapacket.setText("");
                        textarea_incomingdatapacket.setText(HEALTH_MESSAGE + ", 6" + " ," + timeSelectedByUser);
                        i--;

                        try {
                            String msgout = "";
                            msgout = textarea_incomingdatapacket.getText().trim();
                            dos.write(msgout.getBytes());
                            dos.flush();
                            textarea_incomingdatapacket.append("\nClient : " + msgout);

                        } catch (Exception e) {
                            System.err.println("Sent the code");

                        }

                    }
                    timer_combobox.setEnabled(true);
                }
            });

        }
        timerThread.start();

      //  Send logic to client
                try {
                    String msgout = "";
                    msgout = textarea_incomingdatapacket.getText().trim();
                    dos.write(msgout.getBytes());
                    textarea_incomingdatapacket.append("Client : " + msgout);
        
                } catch (Exception e) {
        
                }
    }//GEN-LAST:event_jButton2_sendActionPerformed

    private void textarea_incomingdatapacketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textarea_incomingdatapacketKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textarea_incomingdatapacketKeyTyped

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_clear;
    private javax.swing.JButton jButton2_reset;
    private javax.swing.JButton jButton2_send;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17_datapacket;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_timer;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel2_selectstate;
    private javax.swing.JLabel jLabel4_servermode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel serverpanel;
    private javax.swing.JButton startserver_button1;
    private javax.swing.JRadioButton stateARadioButton;
    private javax.swing.JLabel stateATime;
    private javax.swing.JRadioButton stateB1RadioButton;
    private javax.swing.JLabel stateB1Time;
    private javax.swing.JRadioButton stateB2RadioButton;
    private javax.swing.JLabel stateB2Time;
    private javax.swing.JRadioButton stateC1RadioButton;
    private javax.swing.JLabel stateC1Time;
    private javax.swing.JRadioButton stateC2RadioButton;
    private javax.swing.JLabel stateC2Time;
    private javax.swing.JButton stopserver_button2;
    private static javax.swing.JTextArea textarea_incomingdatapacket;
    private javax.swing.JComboBox<String> timer_combobox;
    private javax.swing.JTextField userselected;
    // End of variables declaration//GEN-END:variables

    private void enableDisableRadioButtons(JRadioButton jRadioButton) {
        List<JRadioButton> list = new ArrayList<>();
        list.add(stateARadioButton);
        list.add(stateB1RadioButton);
        list.add(stateB2RadioButton);
        list.add(stateC1RadioButton);
        list.add(stateC2RadioButton);

        for (JRadioButton radioButton : list) {
            if (jRadioButton == null) {
                radioButton.setEnabled(true);
                radioButton.setSelected(false);
                continue;
            }

            if (jRadioButton.isSelected()) {
                if (radioButton.equals(jRadioButton)) {
                    radioButton.setEnabled(true);
                } else {
                    radioButton.setEnabled(false);
                    radioButton.setSelected(false);
                }
            } else {
                radioButton.setEnabled(true);
                radioButton.setSelected(false);
            }

        }

    }
}
