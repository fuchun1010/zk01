package com.tank.common;

import com.tank.message.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fuchun
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class CoreApp {

  @FeignClient(name = "core")
  @RequestMapping("/v1/demo")
  public interface CoreClient {
    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}/person")
    Person findBy(@PathVariable(value = "id") Integer id);
  }

  public Person findBy(Integer id) {
    return this.coreClient.findBy(id);
  }

  @Autowired
  public CoreClient coreClient;
}
