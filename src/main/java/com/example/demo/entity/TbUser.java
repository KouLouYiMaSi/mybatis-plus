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
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String mob;
    private String email;
    private Integer valid;
    private String pticket;
    private Integer roleId;


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

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public String getPticket() {
        return pticket;
    }

    public void setPticket(String pticket) {
        this.pticket = pticket;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TbUser{" +
        ", id=" + id +
        ", name=" + name +
        ", mob=" + mob +
        ", email=" + email +
        ", valid=" + valid +
        ", pticket=" + pticket +
        ", roleId=" + roleId +
        "}";
    }
}
