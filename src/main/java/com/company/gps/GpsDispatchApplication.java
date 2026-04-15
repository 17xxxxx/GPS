/*
  项目主启动类。
  负责 Spring Boot 应用启动，初始化上下文。
  在这里可以启动 Netty 服务、加载字典、初始化分表和缓存。
  目前是项目骨架，不包含业务实现。
*/
package com.company.gps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpsDispatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(GpsDispatchApplication.class, args);
    }
}