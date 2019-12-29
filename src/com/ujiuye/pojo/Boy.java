package com.ujiuye.pojo;

public class Boy {
    private String name;
    private Integer age;
    private Girl girl;

    public Boy() {
        super();
    }

    public Boy(String name, Integer age, Girl girl) {
        this.name = name;
        this.age = age;
        this.girl = girl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girl=" + girl +
                '}';
    }
}
