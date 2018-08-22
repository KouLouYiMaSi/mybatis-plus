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
public class TbUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;
    private Integer roleId;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TbUserRole{" +
        ", uid=" + uid +
        ", roleId=" + roleId +
        "}";
    }
}
