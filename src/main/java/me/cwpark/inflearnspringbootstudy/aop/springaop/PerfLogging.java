package me.cwpark.inflearnspringbootstudy.aop.springaop;

import java.lang.annotation.*;

/**
 * 이 어노테이션은 성능을 측정합니다.
 */
// 컴파일 정보가 컴파일 후에도 남아 있어야 함
@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE) // source일 경우 컴파일 후 사라짐
@Target(ElementType.METHOD)
@Documented
public @interface PerfLogging {

}
