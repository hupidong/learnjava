package com.itranswarp.learnjava.decorator;

import javax.swing.*;
import java.awt.*;

public class Original extends JFrame implements Morrigan {
    private  static final Long serialVersionUID=1L;
    private String t="Morrigan0.jpg";
    public Original(){
        super("《恶魔战士》中的莫莉卡安斯兰");
    }
    public void setImage(String t){
        this.t=t;
    }

    @Override
    public void display()
    {
        this.setLayout(new FlowLayout());
        JLabel l1=new JLabel(new ImageIcon("resources/Decorator/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
