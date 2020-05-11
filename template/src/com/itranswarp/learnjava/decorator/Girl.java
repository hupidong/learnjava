package com.itranswarp.learnjava.decorator;

//抽象装饰角色：少女
public class Girl extends Changer{
    public Girl(Morrigan morrigan){
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }
    public void setChanger(){
        ((Original)super.morrigan).setImage("Morrigan2.jpg");
    }
}
