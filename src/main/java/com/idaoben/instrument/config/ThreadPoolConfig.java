package com.idaoben.instrument.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hezifeng
 * @create 2022/10/31 15:47
 */
@Configuration
public class ThreadPoolConfig {
//    @Value("${concurrent.corePoolSize:5}")
//    private Integer corePoolSize;
//    @Value("${concurrent.maxPoolSize:10}")
//    private Integer maxPoolSize;
//    private static final int QUEUE_CAPACITY=10;
//    private static final int KEEP_ALIVE_SECONDS=120;
//
//    @Bean("asyncTaskExecutor")
//    public ThreadPoolTaskExecutor asyncTaskExecutor() {
//        ThreadPoolTaskExecutor asyncTaskExecutor = new ThreadPoolTaskExecutor();
//        asyncTaskExecutor.setMaxPoolSize(corePoolSize);
//        asyncTaskExecutor.setCorePoolSize(corePoolSize);
//        asyncTaskExecutor.setQueueCapacity(QUEUE_CAPACITY);
//        asyncTaskExecutor.setKeepAliveSeconds(KEEP_ALIVE_SECONDS);
//        asyncTaskExecutor.setThreadNamePrefix("thread-pool-");
//        asyncTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
//        asyncTaskExecutor.initialize();
//        return asyncTaskExecutor;
//    }
}
