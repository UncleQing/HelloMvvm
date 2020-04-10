package com.zidian.hellomvvm.db.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Date;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/10
 * @Description: This is UserEntity
 */
@Entity(tableName = "user", indices = {@Index(value = {"uuid"}, unique = true)})
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    private int uuid;
    private String name;
    private int age;
    private Date birthday;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
