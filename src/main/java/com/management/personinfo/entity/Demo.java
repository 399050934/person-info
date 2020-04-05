package com.management.personinfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


/**
 * (Demo)实体类
 *
 * @author makejava
 * @since 2020-04-05 13:09:45
 */
@Entity
@Table(name = "demo")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Demo {

    private Integer id;
    
    private String name;

    @Id
    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}