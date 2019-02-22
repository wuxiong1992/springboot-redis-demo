package com.wx.redis.dao;

import com.wx.redis.entity.CategoryRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryRecordDao {

  List<CategoryRecord> getCategoryRecordList();

}
