// 该流水线定义了后端项目的 CI 构建流程，用于自动化质量校验与制品产出。
// 通过标准化阶段（检出、编译、测试、打包）减少人工发布错误。
// 骨架阶段先保留最小流程，后续可接入代码扫描、镜像推送与多环境发布。
pipeline {
  agent any
  stages {
    stage("Checkout") { steps { checkout scm } }
    stage("Build") { steps { sh "mvn clean package -DskipTests" } }
    stage("Test") { steps { sh "mvn test" } }
  }
}
