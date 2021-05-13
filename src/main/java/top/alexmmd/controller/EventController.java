package top.alexmmd.controller;

/**
 * @author 汪永晖
 * @creatTime 2021/5/13 15:53
 */

import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alexmmd.publisher.CustomSpringEventPublisher;

import javax.annotation.Resource;

@RestController
@RequestMapping("/event")
public class EventController {

    @Resource
    private CustomSpringEventPublisher customSpringEventPublisher;

    @PostMapping("/synchronize")
    public String synchronizeEvent() {
        StopWatch sw = new StopWatch();
        sw.start("同步校验总耗时");
        customSpringEventPublisher.publishCustomEvent("这是一个同步处理事件");
        sw.stop();
        System.out.println(sw.prettyPrint());
        System.out.println(sw.getTotalTimeMillis());
        return "success send synchronize event";
    }

    @PostMapping("/asynchronous")
    public String asynchronousEvent() {
        StopWatch sw = new StopWatch();
        sw.start("异步校验总耗时");
        customSpringEventPublisher.publishCustomEvent("这是一个异步处理事件");
        sw.stop();
        System.out.println(sw.prettyPrint());
        System.out.println(sw.getTotalTimeMillis());
        return "success send asynchronous event";
    }
}
