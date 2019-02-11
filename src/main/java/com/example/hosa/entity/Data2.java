package com.example.hosa.entity;

import javax.persistence.*;

@Entity
@Table(name="t7")
public class Data2
{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

   public Data2(){}
    public Data2(Integer id,String name)
    {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


