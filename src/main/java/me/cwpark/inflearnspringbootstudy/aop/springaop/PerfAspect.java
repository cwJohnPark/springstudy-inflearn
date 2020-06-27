package me.cwpark.inflearnspringbootstudy.aop.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution(* me.cwpark.inflearnspringbootstudy.aop.proxy.EventService.*(..))")
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object value  = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return value;
    }

    // bean에 등록된 것을 사용하되, 메소드 실행 이전에만 실행함
    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello");
    }

}
