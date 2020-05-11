package com.itranswarp.learnjava.prototype;

public class ProtoTypeShapeTest {
    public static void main(String[] args)
    {
        ProtoTypeManager pm=new ProtoTypeManager();
        Shape obj1=(Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2=(Shape)pm.getShape("Square");
        obj2.countArea();
        pm.addShape("Circle2", new Circle());
        Shape obj3=(Circle)pm.getShape("Circle2");
        obj3.countArea();
    }
}
