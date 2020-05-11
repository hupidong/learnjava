package com.itranswarp.learnjava;

import java.io.*;

import com.alibaba.fastjson.JSON;

/**
 * Created by viruser on 2020/5/7.
 */
public class CloneUtils {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("Bob", 24);
        Person p2 = cloneByJson(p1, Person.class);

        Person p3 = new Person("Tom", 30);
        Person p4 = clone(p3);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);

    }

    public static <T> T cloneByJson(T obj, Class<T> clazz) {
        String jsonString = JSON.toJSONString(obj);
        T copyObj = JSON.parseObject(jsonString, clazz);
        return copyObj;
    }

    public static <T extends Serializable> T clone(T obj) {
        T cloneObj = null;
        try {
            try(ByteArrayOutputStream out = new ByteArrayOutputStream()){
                try(ObjectOutputStream obs = new ObjectOutputStream(out)){
                    obs.writeObject(obj);
                }
                try(ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray())){
                    try(ObjectInputStream ois = new ObjectInputStream(ios)){
                        cloneObj = (T) ois.readObject();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            return  null;
        }
        return cloneObj;
    }

    static class Person implements Serializable {
        private String name;
        private int age;

        public Person() {}

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
