package com.tank.controller;

import com.tank.message.Person;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class PersonController {


  @GetMapping("/{id}/person")
  public ResponseEntity findById(@PathVariable Integer id) {

    val person = new Person();
    person.setId(id);
    person.setName("jack");
    person.setAge(22);

    return ResponseEntity.ok(person);
  }


}
