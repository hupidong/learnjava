package com.itranswarp.learnjava.abstractfactory;

//具体工厂：韶关农场类
public class SGFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
