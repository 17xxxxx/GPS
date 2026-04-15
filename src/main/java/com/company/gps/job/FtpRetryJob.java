package com.company.gps.job;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * FtpRetryJob 用于承载对应领域的骨架定义，明确未来扩展方向与边界。
 * 该文件职责是提供稳定的接口或组件占位，避免后续开发出现命名和分层混乱。
 * 它解决项目初期结构不完整的问题，便于团队按统一规范分工协作。
 * 在系统架构中该类型位于 com.company.gps.job 包，是该分层能力的一部分。
 */
public class FtpRetryJob {

    @Scheduled(cron = "0 */5 * * * ?")
    public void execute() {
        // TODO: scheduled task
    }
}
