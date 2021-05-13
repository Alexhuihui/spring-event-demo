package top.alexmmd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import javax.annotation.Resource;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 16:19
 */
@Configuration
public class AsynchronousSpringEventsConfig {

    @Resource
    private AsyncTaskExecutor asyncTaskExecutor;

    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster =
                new SimpleApplicationEventMulticaster();

        eventMulticaster.setTaskExecutor(asyncTaskExecutor);
        return eventMulticaster;
    }
}
