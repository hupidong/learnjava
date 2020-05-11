package com.itranswarp.learnjava.bridge;

public class Wallet extends Bag{
    @Override
    public String getName() {
        return color.getColor()+"Wallet";
    }
}
