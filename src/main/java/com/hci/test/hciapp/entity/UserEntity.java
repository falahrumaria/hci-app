package com.hci.test.hciapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String name;

    private String address;

    private Date dob;

    @Column(name = "user_group_id")
    private Integer userGroupId;

    @ManyToOne(targetEntity = UserGroupEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_group_id", referencedColumnName = "id", insertable = false, updatable = false)
    private UserGroupEntity userGroup;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public UserGroupEntity getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupEntity userGroup) {
        this.userGroup = userGroup;
    }

}
