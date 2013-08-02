/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittams.gritty.swing.standalone;

/**
 *
 * @author sridhar
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MyFrame extends JFrame {

                JPanel contentPane;
                JButton button;
               	
	public static void old_main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                                            creatingFrame();
				
			}
		});
	}
        
        public static void creatingFrame()
    {                    
                    MyFrame frame = new MyFrame();                     
                    frame.setVisible(true);
                    
        
    }	
	public MyFrame() {
            
         
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Starting From First :((");
            setResizable(false);

            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();

            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new BorderLayout(0, 0));

            button = new JButton("File Display Pane");
            contentPane.add(button, BorderLayout.LINE_END);
            
            button = new JButton("Tree_here");
            contentPane.add(button, BorderLayout.LINE_START);
            
            button = new JButton("If I am adding tabs");
            contentPane.add(button, BorderLayout.PAGE_START);
            
            button = new JButton(" I can have some GUI here if at all needed");
            contentPane.add(button, BorderLayout.PAGE_END);


            setContentPane(contentPane);
                             
                             
	}

}