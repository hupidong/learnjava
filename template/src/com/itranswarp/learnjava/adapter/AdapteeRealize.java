package com.itranswarp.learnjava.adapter;

public class AdapteeRealize implements TwoWayAdaptee{
    @Override
    public void specificRequest() {
        System.out.println("Adaptee code is involved!");
    }
}
