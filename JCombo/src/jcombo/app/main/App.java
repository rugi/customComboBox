/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcombo.app.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jcombo.MyComboBoxModel;
import jcombo.MyComboDao;
import jcombo.dao.impl.DataComboDAO;
import jcombo.dao.impl.DataComboDAOImpl;

/**
 *
 * @author RuGI
 */
public class App {
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Dao basic implementation
        DataComboDAO dao = new DataComboDAOImpl();
        
       // another  implementation of DAO; DataComboDAOImpl
         //DataComboDAO dao = new DataComboDAOImpl();

         MyComboBoxModel myModel = new MyComboBoxModel(dao.getAll());
        //Create and set up the content pane.
        MyComboDao  combo = new MyComboDao(myModel);
        combo.setOpaque(true); //content panes must be opaque
        JButton myButton = new JButton("Show me!");
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Selected item "+combo.getSelectedItem());
            }
        });
        frame.setLayout(new BorderLayout());
        frame.add(combo, BorderLayout.CENTER);
        frame.add(myButton, BorderLayout.SOUTH);
        frame.setSize(new Dimension(200,200));
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }  
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
