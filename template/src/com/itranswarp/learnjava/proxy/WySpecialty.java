package com.itranswarp.learnjava.proxy;

import javax.swing.*;
import java.awt.*;

// 真是主题：婺源特产
public class WySpecialty extends JFrame implements Specialty {
   private static final long serialVesionUID=1L;
   public WySpecialty(){
       super("韶关代理婺源特产测试");
       this.setLayout(new GridLayout(1,1));
       JLabel l1=new JLabel(new ImageIcon("resources/Proxy/WuyuanSpecialty.jpg"));
       this.add(l1);
       this.pack();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void display(){
       this.setVisible(true);
   }
}
