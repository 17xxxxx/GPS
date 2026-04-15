# 基于 GPS 的露天矿卡车智能调度管理平台（后端骨架）

## 1. 项目定位
本项目是面向露天矿运输场景的企业级后端系统骨架，核心能力覆盖设备接入、轨迹管理、调度任务、报警联动、地图服务、文件中心、报表统计与运行监控。
当前版本重点完成了可落地的工程化目录与代码组织，便于团队直接在此基础上迭代业务实现。

## 2. 技术栈
- Java 17 + Spring Boot 3
- MyBatis + MySQL
- Redis（缓存与分布式锁）
- RocketMQ（异步解耦与削峰）
- Netty（设备长连接与协议接入）

## 3. 当前阶段说明
- 已创建完整模块化后端项目骨架。
- 所有核心 Java 文件均提供中文职责注释与最小可编译定义。
- 业务逻辑暂未实现，统一以 TODO 占位。

## 4. 目录导航
- `docs/`：架构、数据库、协议、接口与部署文档。
- `deploy/`：启停、巡检、备份脚本。
- `sql/`：DDL、DML 与分区模板脚本。
- `src/main/java`：主业务代码骨架。
- `src/main/resources`：配置、Mapper XML、模板、静态资源。
- `src/test`：测试骨架与测试资源。

## 5. 快速启动（骨架阶段）
1. 准备 JDK 17 与 Maven 3.9+。
2. 根据环境修改 `application-*.yml`。
3. 执行 `mvn clean package` 进行构建校验。
4. 使用 `deploy/start.sh` 或 Docker 方式启动。

## 6. 后续迭代建议
- 先落地 `device/track/dispatch/alarm` 四个核心业务闭环。
- 再完善 `map/file/report/monitor` 的增值能力。
- 最后补齐性能压测、链路追踪与运维告警体系。
