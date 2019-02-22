package com.wx.redis.controller;

import com.wx.redis.dao.PersonDao;
import com.wx.redis.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class DataController {

  @Autowired
  PersonDao personDao;

  @GetMapping("/set")
  public void set() {
    Person p = new Person("1", "lzx", 27);
    personDao.save(p);
    personDao.setStringRedisTemplateDemo();
  }

  @GetMapping("/getStr")
  public String getStr() {
    return personDao.getString();
  }

  @GetMapping("getPerson")
  public Person getPerson() {
    return personDao.getPerson();
  }
}
