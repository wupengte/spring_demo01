package com.mgspring.mod;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.mod
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/1 15:22
 * Description:TODO
 * Modify: TODO
 */
public class Person {

    private Integer id;
    private String name;

    public Person() {
        super();
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
