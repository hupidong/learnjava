package com.itranswarp.learnjava.adapter;

public class TargetRealize implements TwoWayTarget{
    @Override
    public void request() {
        System.out.println("Target code is involved！");
    }
}
