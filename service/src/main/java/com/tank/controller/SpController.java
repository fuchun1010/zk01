package com.tank.controller;

import com.tank.common.CoreApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/zk")
public class SpController {

  @GetMapping(name = "/{id}/person")
  public ResponseEntity findBy(@PathVariable Integer id) {
    return this.coreApp.coreClient.findBy(id);
  }

  @Autowired
  private CoreApp coreApp;
}
