package com.zidian.hellomvvm.db.converter;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/10
 * @Description: This is DateConverter
 */
public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
