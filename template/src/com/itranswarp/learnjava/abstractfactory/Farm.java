package com.itranswarp.learnjava.abstractfactory;

//抽象工厂：农场类
public interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}
