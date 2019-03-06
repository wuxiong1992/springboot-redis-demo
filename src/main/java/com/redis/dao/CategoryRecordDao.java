package com.redis.dao;

import com.redis.entity.CategoryRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryRecordDao {

  List<CategoryRecord> getCategoryRecordList();

}
