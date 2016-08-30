/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandletest;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author rahulthawal
 */
public  class EventHandleTest implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JFrame frame;
    JButton hello;
    
public void initGUI ( ) 
{
            frame = new JFrame();
            Container c = frame.getContentPane();
            c.setLayout(new FlowLayout());
            
            //Creating event generator step-1 of our process
            
            hello = new JButton("Hello");

           
            c.add(hello);
            hello.addActionListener(this);
             
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200,150);
            frame.setVisible(true);
}



public void actionPerformed(ActionEvent event) 
{
 JOptionPane.showMessageDialog(null,"Hello is pressed");
 }


public EventHandleTest()
{
initGUI();
}
    public static void main(String[] args) {
        // TODO code application logic here
        EventHandleTest aeTest = new EventHandleTest();
    }
    
}
