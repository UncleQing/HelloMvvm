package com.zidian.hellomvvm.db.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.zidian.hellomvvm.db.entity.UserEntity;

import java.util.Date;
import java.util.List;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/10
 * @Description: This is UserDao
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM user WHERE birthday BETWEEN :from AND :to")
    List<UserEntity> findUsersBornBetweenDates(Date from, Date to);

}
