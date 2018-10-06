package com.tank.controller;

import com.tank.message.Person;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/demo")
@Slf4j
public class PersonController {

  @GetMapping("/{id}/person")
  @ResponseBody
  public Person findById(@PathVariable Integer id) {
    val person = new Person();
    person.setId(id);
    person.setName("jack");
    person.setAge(22);
    log.info("enter method findById: {}", id);
    return person;
  }


}
