package com.wx.redis.service;

import com.wx.redis.dao.CategoryRecordDao;
import com.wx.redis.entity.CategoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryRecordService {

  @Autowired
  private CategoryRecordDao dao;

  public List<CategoryRecord> getCategoryRecordList() {
    return dao.getCategoryRecordList();
  }
}
