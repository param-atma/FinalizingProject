/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myProject.working.swing.standalone;

/**
 *
 * @author sridhar
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

    JPanel contentPane;
    JButton button;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                creatingFrame();

            }
        });
    }

    public static void creatingFrame()
    {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);


    }

    public MyFrame()
    {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Starting From First :((");
        setResizable(false);

        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         contentPane.setLayout(new BorderLayout(0, 0));
                 
         FileManager file_mgr = new FileManager ();
         Container file_mgr_panel = file_mgr.getGui ();
         contentPane.add(file_mgr_panel, BorderLayout.SOUTH);
         file_mgr_panel.setVisible (true);
         

         
        setContentPane(contentPane);


    }
}