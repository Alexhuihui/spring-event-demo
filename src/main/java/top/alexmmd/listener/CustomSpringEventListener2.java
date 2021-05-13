package top.alexmmd.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import top.alexmmd.event.CustomSpringEvent;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 15:51
 */
@Component
public class CustomSpringEventListener2 implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        StopWatch sw = new StopWatch();
        sw.start("校验耗时2");
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
