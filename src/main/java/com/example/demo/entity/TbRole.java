package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 小混蛋
 * @since 2018-08-22
 */
public class TbRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String description;
    private String role;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "TbRole{" +
        ", id=" + id +
        ", description=" + description +
        ", role=" + role +
        "}";
    }
}
