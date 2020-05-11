package com.itranswarp.learnjava.bridge;

public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete ImplementorA)角色被访问");
    }
}
