package com.redis.controller;

import com.redis.entity.CategoryRecord;
import com.redis.service.CategoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class CategoryRecordUI {

  @Autowired
  private CategoryRecordService service;

  // 注入redis缓存(假如是字符串可以选择StringRedisTemplate)
  @Autowired
  private RedisTemplate redisTemplate;

  @GetMapping(value = "/setCategoryRecordList")
  public List<CategoryRecord> setCategoryRecordList() {
    List<CategoryRecord> list = service.getCategoryRecordList();
    // 放入缓存
    long startTime = System.currentTimeMillis();    //获取开始时间
    redisTemplate.opsForValue().set("CategoryRecordList", list);
    long endTime = System.currentTimeMillis();
    long l = endTime - startTime;
    System.out.println(l);
    System.out.println("缓存成功");
    return null;
  }

  @GetMapping(value = "/getCategoryRecordList")
  public List<CategoryRecord> getCategoryRecordList() {
    long startTime = System.currentTimeMillis();    //获取开始时间
    // 从缓存中读取数据
    List<CategoryRecord> list = (List<CategoryRecord>) redisTemplate.opsForValue().get("CategoryRecordList");
    long endTime = System.currentTimeMillis();
    long l = endTime - startTime;
    System.out.println(l);
    return list;
  }
}
