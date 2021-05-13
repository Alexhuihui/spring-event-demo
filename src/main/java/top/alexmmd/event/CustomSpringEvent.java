package top.alexmmd.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.util.StopWatch;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 15:49
 */
public class CustomSpringEvent extends ApplicationEvent {
    private String message;

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
