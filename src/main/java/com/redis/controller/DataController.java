package com.redis.controller;

import com.redis.entity.Person;
import com.redis.dao.PersonDao;
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
