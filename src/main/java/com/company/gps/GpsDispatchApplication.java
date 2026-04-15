package com.company.gps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统启动入口类，负责拉起 Spring Boot 容器并初始化全部业务模块。
 * 它是整个平台运行的总开关，统一承载配置加载、组件扫描和生命周期启动。
 * 该类解决应用无统一入口的问题，确保部署后的服务可被标准化启动。
 * 在系统架构中位于最顶层，是所有后端能力的装配起点。
 */
@SpringBootApplication
public class GpsDispatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpsDispatchApplication.class, args);
    }
}
