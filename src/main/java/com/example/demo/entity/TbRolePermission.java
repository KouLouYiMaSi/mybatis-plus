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
public class TbRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer permissionId;
    private Integer roleId;


    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TbRolePermission{" +
        ", permissionId=" + permissionId +
        ", roleId=" + roleId +
        "}";
    }
}
