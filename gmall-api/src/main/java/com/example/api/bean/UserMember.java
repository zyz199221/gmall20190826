package com.example.api.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 文件名：UserMember
 * 作 者：Miles zhu
 * 时 间：2019/8/26 15:27
 * -------------------------
 * 功能和描述：
 **/
@Table(name = "ums_user_member")
public class UserMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String member_level_id;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private int status;
    private String create_time;
    private String icon;
    private int gender;
    private String birthday;
    private String city;
    private String job;
    private String personnlized_signature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMember_level_id() {
        return member_level_id;
    }

    public void setMember_level_id(String member_level_id) {
        this.member_level_id = member_level_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonnlized_signature() {
        return personnlized_signature;
    }

    public void setPersonnlized_signature(String personnlized_signature) {
        this.personnlized_signature = personnlized_signature;
    }
}
