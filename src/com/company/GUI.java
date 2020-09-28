package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.beans.EventHandler;



public class GUI extends JFrame {

    JFrame jFrame=new JFrame(){};

    JTextArea jTextArea=new JTextArea(50,100);

    JScrollPane jScroll=new JScrollPane(jTextArea);

    JMenuBar jMenuBar=new JMenuBar();

    JMenu jMenu1=new JMenu("Font");
    JMenu jMenu2=new JMenu("Colour");

    JMenuItem jMenuItem1=new JMenuItem("Times New Roman");
    JMenuItem jMenuItem2=new JMenuItem("MS Sans Serif");
    JMenuItem jMenuItem3=new JMenuItem("Calibri");
    JMenuItem jMenuItem4=new JMenuItem("Green");
    JMenuItem jMenuItem5=new JMenuItem("Red");

    Font fnt1 =new Font("Times new roman",Font.BOLD,20);
    Font fnt2 =new Font("Times new roman",Font.BOLD,20);
    Font fnt3 =new Font("Times new roman",Font.BOLD,20);


public GUI()
{
    super("Menu");
    this.setBounds(500,500,500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container=this.getContentPane();



    jMenuBar.add(jMenu1);
    jMenuBar.add(jMenu2);

    jMenu1.add(jMenuItem1);
    jMenu1.add(jMenuItem2);
    jMenu1.add(jMenuItem3);

    jMenu2.add(jMenuItem4);
    jMenu2.add(jMenuItem5);




    jFrame.setJMenuBar(jMenuBar);
    jFrame.revalidate();














}



}