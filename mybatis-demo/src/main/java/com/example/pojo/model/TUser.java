package com.example.pojo.model;

import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    @Id
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String username;

    /**
     * 真实名称
     */
    @Column(name = "realName")
    private String realname;

    /**
     * 姓名
     */
    private Byte sex;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String note;

    @Column(name = "position_id")
    private Integer positionId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取真实名称
     *
     * @return realName - 真实名称
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实名称
     *
     * @param realname 真实名称
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取姓名
     *
     * @return sex - 姓名
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置姓名
     *
     * @param sex 姓名
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取电话
     *
     * @return mobile - 电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话
     *
     * @param mobile 电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return position_id
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * @param positionId
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
}