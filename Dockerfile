# 该文件用于构建后端服务镜像，解决环境一致性和交付标准化问题。
# 通过统一 JRE 版本与启动参数，保障开发、测试、生产运行行为一致。
# 骨架阶段仅提供基础镜像流程，后续可引入健康检查与多阶段构建优化。
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/gps-dispatch-platform-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
