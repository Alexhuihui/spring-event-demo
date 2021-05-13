package top.alexmmd.service;

import top.alexmmd.event.CustomSpringEvent;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 16:12
 */
public interface IEventService {

    /**
     * 处理自定义事件
     *
     * @param event 事件
     */
    void handleCustomEvent(CustomSpringEvent event);
}
