package com.itranswarp.learnjava.decorator;

//抽象装饰角色：变形
public class Changer implements Morrigan{
    Morrigan morrigan;
    public Changer(Morrigan morrigan){
        this.morrigan=morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}
