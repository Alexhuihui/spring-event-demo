package top.alexmmd.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import top.alexmmd.event.CustomSpringEvent;

import javax.annotation.Resource;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 15:50
 */
@Component
public class CustomSpringEventPublisher {
    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}
