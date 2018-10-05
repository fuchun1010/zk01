package com.tank.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author fuchun
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class CoreApp {

  @FeignClient(name = "core")
  public interface CoreClient {
    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/v1/demo/{id}/person")
    ResponseEntity findBy(@PathVariable Integer id);
  }

  @Autowired
  public CoreClient coreClient;
}
