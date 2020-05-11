package com.itranswarp.learnjava.bridge;

public class BridgeTest {
    public static void main(String[] args){
        Implementor implementor=new ConcreteImplementorA();
        Abstraction abstraction=new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
