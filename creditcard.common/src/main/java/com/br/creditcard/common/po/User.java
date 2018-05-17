package com.br.creditcard.common.po;

import java.util.Date;

/**
 * Created by bairong on 2018/5/17.
 */
public class User {

    private Integer id; //用户_id
    private String openId; //微信的open_id
    private String nickName; //用户昵称
    private Integer gender; //性别
    private String city; //城市
    private String province; //省份
    private String country; //国家
    private String language; //用户的语言
    private String userRemark; //用户_备注
    private Integer grayStatus; //灰度用户状态，0是正常登陆用户，1是不需要登陆的用户
    private Date createTime; //用户_创建时间
    private Date updateTime; //名片_更新时间
    private String avatarUrl; //用户头像

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public Integer getGrayStatus() {
        return grayStatus;
    }

    public void setGrayStatus(Integer grayStatus) {
        this.grayStatus = grayStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", userRemark='" + userRemark + '\'' +
                ", grayStatus=" + grayStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}
