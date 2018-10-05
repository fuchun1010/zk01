package com.tank.message;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fuchun
 */
@Data
@Accessors(chain = true)
public class Person {

  private String name;
  private int age;
  private int id;
}
