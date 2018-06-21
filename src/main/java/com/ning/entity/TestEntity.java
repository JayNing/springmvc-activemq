package com.ning.entity;

import java.io.Serializable;

/**
 * 测试发送实体类
 *
 * @author ning
 * @create 2018-06-21 10:08
 **/
public class TestEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}