package me.cwpark.inflearnspringbootstudy.aop.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ProxySimpleEventService implements EventService {

    @Autowired
    SimpleEventService service;

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        service.createEvent();
        //System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        service.publishEvent();
        //System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        long begin = System.currentTimeMillis();
        service.deleteEvent();
        //System.out.println(System.currentTimeMillis() - begin);
    }
}
