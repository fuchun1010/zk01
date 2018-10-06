package com.tank.controller;

import com.tank.common.CoreApp;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuchun
 */
@RestController
@RequestMapping("/zk")
public class SpController {

  @GetMapping("/{id}/person")
  public ResponseEntity findBy(@PathVariable Integer id) {
    val person = this.coreApp.findBy(id);
    return ResponseEntity.ok(person);
  }

  @Autowired
  private CoreApp coreApp;
}
