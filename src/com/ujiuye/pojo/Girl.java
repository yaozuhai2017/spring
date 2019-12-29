package com.ujiuye.pojo;

public class Girl {
    private String name;
    private Integer age;

    public Girl() {
        super();
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
