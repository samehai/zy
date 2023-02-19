package com.zy.oms.bean;

import java.io.Serializable;

/**
 * @author Administrator
 */
//@Data
public class User implements Serializable {
    private Long id;
    private String name;

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Integer age;

    public Long getId() {
        return id;
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

    void setId(Long id) {
        this.id = id;
    }
}
