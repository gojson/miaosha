package com.miaoshaproject.dataobject;

public class UserPasswordDO {
    private Integer id;

    private String encryPassword;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEncryPassword() {
        return encryPassword;
    }

    public void setEncryPassword(String encryPassword) {
        this.encryPassword = encryPassword == null ? null : encryPassword.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}