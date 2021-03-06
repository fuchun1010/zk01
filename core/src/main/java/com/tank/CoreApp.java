package com.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fuchun
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CoreApp {
  public static void main(String[] args) {
    SpringApplication.run(CoreApp.class);
  }
}
