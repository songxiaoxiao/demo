package moxi.core.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
public class AutoWiredConfiguration {

    /**
     * 维护客户日志流水记录
     *
     *
     * */
    @Bean(name ="customerWalletLog")
    public ThreadPoolTaskExecutor customerWalletLog(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setKeepAliveSeconds(600);
        executor.setMaxPoolSize(30);
        executor.setQueueCapacity(15000);
        return executor;

    }



}
