/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.sudoku.solver;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nithi
 */
public class sudoku_solver extends javax.swing.JFrame {

    private String turn = "1";
	
	private boolean globalFlag = true;
	
	private String solveBoard[][] = {
			{"2","9","8","5","1","6","7","3","4"},
			{"4","1","3","2","7","8","5","6","9"},
			{"7","5","6","3","4","9","1","2","8"},
			{"8","2","1","4","3","5","6","9","7"},
			{"5","3","4","6","9","7","2","8","1"},
			{"9","6","7","1","8","2","3","4","5"},
			{"1","4","2","8","5","3","9","7","6"},
			{"3","7","5","9","6","4","8","1","2"},
			{"6","8","9","7","2","1","4","5","3"}
	};
	
	private void AssignTurn(JButton btn)
	{
            selectionbtn1.setBackground(Color.black);
            selectionbtn2.setBackground(Color.black);
            selectionbtn3.setBackground(Color.black);
            selectionbtn4.setBackground(Color.black);
            selectionbtn5.setBackground(Color.black);
            selectionbtn6.setBackground(Color.black);
            selectionbtn7.setBackground(Color.black);
            selectionbtn8.setBackground(Color.black);
            selectionbtn9.setBackground(Color.black);
            
           btn.setBackground(Color.blue);
            
	}
        
        private void ResetGame(){
            
            JButton predefinedBtns[] = {r2c1, r3c1, r3c3, r1c4, r2c5, r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5,
                                        r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
            
            
            JButton btns[][] = {
                {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
            };
            
            for(int i = 0; i< 9; i++)
            {
                for(int j = 0; j < 9; j++)
                {
                    boolean flag = true;
                    
                    for(int k = 0; k < predefinedBtns.length; k++)
                    {
                        if(btns[i][j] == predefinedBtns[k])
                        {
                            flag = false;
                        }
                    }
                   if(flag == true)
                   {
                       btns[i][j].setText("");
                       btns[i][j].setForeground(Color.black);
                       btns[i][j].setBackground(Color.white);
                   }
                }
            }
        }
        
        private void SeeSolution(){
            JButton predefinedBtns[] = {r2c1, r3c1, r3c3, r1c4, r2c5, r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5,
                                        r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
            
            
            JButton btns[][] = {
                {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
            };
            
            if(globalFlag == true)
            {
                globalFlag = false;
                solutionbtn.setText("Hidesolution");
                for(int i = 0; i< 9; i++)
                {
                    for(int j = 0; j < 9; j++)
                    {
                        boolean flag = true;

                        for(int k = 0; k < predefinedBtns.length; k++)
                        {
                            if(btns[i][j] == predefinedBtns[k])
                            {
                                flag = false;
                            }
                        }
                       if(flag == true)
                       {
                           btns[i][j].setText(solveBoard[i][j]);
                           btns[i][j].setForeground(Color.black);
                           btns[i][j].setBackground(Color.yellow);
                       }
                    }
                }
            }
            else
            {
                 solutionbtn.setText("Solution");
                 globalFlag = true;
                 ResetGame();
            }
        }
        private void CheckMoves(){
             JButton btns[][] = {
                {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
            };
             
           if(globalFlag == true)
            {
                globalFlag = false;
                checkmovesbtn.setText("Hide Moves");
                for(int i = 0; i< 9; i++)
                {
                    for(int j = 0; j < 9; j++)
                    {
                        boolean flag = true;

                                          
                            if(btns[i][j].getText() != solveBoard[i][j] && btns[i][j].getText() != "")
                            {
                                flag = false;
                                btns[i][j].setBackground(Color.red);
                            }
                    }
                }
            }
            else
            {
                 checkmovesbtn.setText("Check Moves");
                 globalFlag = true;
                 ResetGame();
            }
        }
    /**
     * Creates new form Sudoku_Solver
     */
    public sudoku_solver() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        r7c7 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        r7c4 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        selectionbtn2 = new javax.swing.JButton();
        selectionbtn3 = new javax.swing.JButton();
        selectionbtn4 = new javax.swing.JButton();
        selectionbtn1 = new javax.swing.JButton();
        selectionbtn6 = new javax.swing.JButton();
        selectionbtn5 = new javax.swing.JButton();
        selectionbtn8 = new javax.swing.JButton();
        selectionbtn9 = new javax.swing.JButton();
        selectionbtn7 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        solutionbtn = new javax.swing.JButton();
        checkmovesbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new java.awt.Color(0, 51, 255));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new java.awt.Color(0, 51, 255));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new java.awt.Color(0, 51, 255));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c4.setBackground(new java.awt.Color(0, 51, 255));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c5.setBackground(new java.awt.Color(0, 51, 255));
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new java.awt.Color(0, 51, 255));
        r3c5.setText("4");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r2c6.setBackground(new java.awt.Color(0, 51, 255));
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new java.awt.Color(0, 51, 255));
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new java.awt.Color(0, 51, 255));
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(0, 51, 255));
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new java.awt.Color(0, 51, 255));
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(0, 51, 255));
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(0, 51, 255));
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new java.awt.Color(0, 51, 255));
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c7.setBackground(new java.awt.Color(0, 51, 255));
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(0, 51, 255));
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new java.awt.Color(0, 51, 255));
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(0, 51, 255));
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new java.awt.Color(0, 51, 255));
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new java.awt.Color(0, 51, 255));
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new java.awt.Color(0, 51, 255));
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new java.awt.Color(0, 51, 255));
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new java.awt.Color(0, 51, 255));
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c7.setBackground(new java.awt.Color(0, 51, 255));
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new java.awt.Color(0, 51, 255));
        r7c9.setText("6");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new java.awt.Color(0, 51, 255));
        r8c9.setText("2");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new java.awt.Color(0, 51, 255));
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(0, 51, 255));
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new java.awt.Color(0, 51, 255));
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new java.awt.Color(0, 51, 255));
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new java.awt.Color(0, 51, 255));
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r7c5.setBackground(new java.awt.Color(0, 51, 255));
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(0, 51, 255));
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new java.awt.Color(0, 51, 255));
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new java.awt.Color(0, 51, 255));
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectionbtn2.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn2.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn2.setText("2");
        selectionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn2ActionPerformed(evt);
            }
        });

        selectionbtn3.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn3.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn3.setText("3");
        selectionbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn3ActionPerformed(evt);
            }
        });

        selectionbtn4.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn4.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn4.setText("4");
        selectionbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn4ActionPerformed(evt);
            }
        });

        selectionbtn1.setBackground(new java.awt.Color(0, 51, 255));
        selectionbtn1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn1.setText("1");
        selectionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn1ActionPerformed(evt);
            }
        });

        selectionbtn6.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn6.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn6.setText("6");
        selectionbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn6ActionPerformed(evt);
            }
        });

        selectionbtn5.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn5.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn5.setText("5");
        selectionbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn5ActionPerformed(evt);
            }
        });

        selectionbtn8.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn8.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn8.setText("8");
        selectionbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn8ActionPerformed(evt);
            }
        });

        selectionbtn9.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn9.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn9.setText("9");
        selectionbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn9ActionPerformed(evt);
            }
        });

        selectionbtn7.setBackground(new java.awt.Color(0, 0, 0));
        selectionbtn7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        selectionbtn7.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn7.setText("7");
        selectionbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn7ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 204, 255));
        resetbtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 0));
        exitbtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        solutionbtn.setBackground(new java.awt.Color(255, 255, 0));
        solutionbtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        solutionbtn.setText("Solution");
        solutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionbtnActionPerformed(evt);
            }
        });

        checkmovesbtn.setBackground(new java.awt.Color(102, 255, 51));
        checkmovesbtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        checkmovesbtn.setText("Check moves");
        checkmovesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkmovesbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetbtn)
                                .addGap(20, 20, 20)
                                .addComponent(exitbtn)
                                .addGap(18, 18, 18)
                                .addComponent(solutionbtn)
                                .addGap(18, 18, 18)
                                .addComponent(checkmovesbtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkmovesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(solutionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c2.setText(turn);
        r3c2.setBackground(Color.white);
    }                                    

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c3.setText(turn);
        r2c3.setBackground(Color.white);
    }                                    

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c6.setText(turn);
        r3c6.setBackground(Color.white);
    }                                    

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c3.setText(turn);
        r6c3.setBackground(Color.white);
    }                                    

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r5c6.setText(turn);
        r5c6.setBackground(Color.white);
    }                                    

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r6c6.setText(turn);
        r6c6.setBackground(Color.white);
    }                                    

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c9.setText(turn);
        r3c9.setBackground(Color.white);
    }                                    

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r6c8.setText(turn);
        r6c8.setBackground(Color.white);

    }                                    

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
       r5c9.setText(turn);
        r5c9.setBackground(Color.white);
    }                                    

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r6c9.setText(turn);
        r6c9.setBackground(Color.white);
    }                                    

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c8.setText(turn);
        r9c8.setBackground(Color.white);
    }                                    

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c9.setText(turn);
        r9c9.setBackground(Color.white);
    }                                    

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c3.setText(turn);
         r8c3.setBackground(Color.white);
    }                                    

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c5.setText(turn);
        r9c5.setBackground(Color.white);
    }                                    

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c6.setText(turn);
        r8c6.setBackground(Color.white);
    }                                    

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r1c5.setText(turn);
        r1c5.setBackground(Color.white);
    }                                    

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c4.setText(turn);
        r4c4.setBackground(Color.white);
    }                                    

    private void selectionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
          AssignTurn(selectionbtn2);
            turn = "2";
    }                                             

    private void selectionbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
         AssignTurn(selectionbtn3);
           turn = "3";
    }                                             

    private void selectionbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn4);
           turn = "4";
    }                                             

    private void selectionbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn1);
        turn = "1";
    }                                             

    private void selectionbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn6);
           turn = "6";
    }                                             

    private void selectionbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn5);
           turn = "5";
    }                                             

    private void selectionbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn8);
           turn = "8";
    }                                             

    private void selectionbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn9);
           turn = "9";
    }                                             

    private void selectionbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionbtn7);
           turn = "7";
    }                                             

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }                                    

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c1.setText(turn);
        r1c1.setBackground(Color.white);
    }                                    

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(Color.white);
    }                                    

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c3.setText(turn);
        r1c3.setBackground(Color.white);
    }                                    

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c2.setText(turn);
        r2c2.setBackground(Color.white);
    }                                    

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c6.setText(turn);
        r1c6.setBackground(Color.white);
    }                                    

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c4.setText(turn);
        r2c4.setBackground(Color.white);
    }                                    

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c4.setText(turn);
        r3c4.setBackground(Color.white);
    }                                    

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c8.setText(turn);
        r2c8.setBackground(Color.white);
    }                                    

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c7.setText(turn);
        r3c7.setBackground(Color.white);
    }                                    

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c1.setText(turn);
        r4c1.setBackground(Color.white);
    }                                    

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c2.setText(turn);
        r4c2.setBackground(Color.white);
    }                                    

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c3.setText(turn);
        r4c3.setBackground(Color.white);
    }                                    

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c7.setText(turn);
        r4c7.setBackground(Color.white);
    }                                    

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c9.setText(turn);
        r4c9.setBackground(Color.white);
    }                                    

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r5c1.setText(turn);
        r5c1.setBackground(Color.white);
    }                                    

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r5c4.setText(turn);
        r5c4.setBackground(Color.white);
    }                                    

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c5.setText(turn);
        r5c5.setBackground(Color.white);
    }                                    

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r6c1.setText(turn);
        r6c1.setBackground(Color.white);
    }                                    

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r7c1.setText(turn);
        r7c1.setBackground(Color.white);
    }                                    

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c7.setText(turn);
        r6c7.setBackground(Color.white);
    }                                    

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c4.setText(turn);
        r7c4.setBackground(Color.white);
    }                                    

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r7c3.setText(turn);
        r7c3.setBackground(Color.white);
    }                                    

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r7c6.setText(turn);
        r7c6.setBackground(Color.white);
    }                                    

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r7c8.setText(turn);
        r7c8.setBackground(Color.white);
    }                                    

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         r8c2.setText(turn);
         r8c2.setBackground(Color.white);
    }                                    

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c7.setText(turn);
        r8c7.setBackground(Color.white);
    }                                    

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c8.setText(turn);
        r8c8.setBackground(Color.white);
    }                                    

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c4.setText(turn);
        r9c4.setBackground(Color.white);
    }                                    

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c7.setText(turn);
        r9c7.setBackground(Color.white);
    }                                    

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        JFrame frame = new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame, "Conform if u want to reset the game", "Sudoku Solver", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_NO_OPTION)
        {
            ResetGame();
        }
    }                                        

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit the Game", "Exit sudoku solver", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }                                       

    private void solutionbtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        SeeSolution();
    }                                           

    private void checkmovesbtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        CheckMoves();
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
            java.util.logging.Logger.getLogger(sudoku_solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudoku_solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudoku_solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudoku_solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku_solver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton checkmovesbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton selectionbtn1;
    private javax.swing.JButton selectionbtn2;
    private javax.swing.JButton selectionbtn3;
    private javax.swing.JButton selectionbtn4;
    private javax.swing.JButton selectionbtn5;
    private javax.swing.JButton selectionbtn6;
    private javax.swing.JButton selectionbtn7;
    private javax.swing.JButton selectionbtn8;
    private javax.swing.JButton selectionbtn9;
    private javax.swing.JButton solutionbtn;
    // End of variables declaration                   
}