package net.mrchar.demo.polaris;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {
  @Value("${timeout:1000}")
  private int timeout;

  @GetMapping("timeout")
  public Integer getTimeout() {
    return timeout;
  }
}
