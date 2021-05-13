package top.alexmmd.service.impl;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import top.alexmmd.event.CustomSpringEvent;
import top.alexmmd.service.IEventService;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 16:14
 */
@Service
public class EventServiceImpl implements IEventService {
    /**
     * 处理自定义事件
     */
    @Override
    @EventListener
    public void handleCustomEvent(CustomSpringEvent event) {
        StopWatch sw = new StopWatch();
        sw.start("校验耗时3");
        Thread thread = Thread.currentThread();
        System.out.println("thread " + thread.getName() + "Received spring custom event - " + event.getMessage());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(sw.getTotalTimeMillis());
        sw.stop();
    }
}
