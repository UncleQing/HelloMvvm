package com.zidian.hellomvvm.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.PrimaryKey;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/10
 * @Description: This is UserFTSEntity
 */

@Entity(tableName = "userfts")
@Fts4(contentEntity = UserEntity.class)
public class UserFTSEntity {
    @PrimaryKey
    @ColumnInfo(name = "rowid")
    private int id;
    private int uuid;
    private String name;
}
