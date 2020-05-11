package com.itranswarp.learnjava.adapter;

public class MotorAdapterTest {
    public static void main(String[] args){
        System.out.println("适配器模式测试：");
        Motor motor=(Motor)ReadXML.getObject();
        motor.drive();
    }
}
