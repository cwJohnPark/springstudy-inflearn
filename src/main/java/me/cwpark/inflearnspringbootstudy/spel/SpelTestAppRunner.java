package me.cwpark.inflearnspringbootstudy.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class SpelTestAppRunner implements ApplicationRunner {

    // operation
    @Value("#{1 + 1}")
    int value;

    // string
    @Value("#{'hello' + 'world'}")
    String greeting;

    // expression
    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    // 프로퍼티 파일에서 가져옴
    @Value("${my.value}")
    int myValue;

    // 표현식안에 프로퍼티를 가지도록 함
    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    // literal
    @Value("#{'spring'}")
    String spring;

    // bean property
    // 단, public이여야 함
    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //printOut();
    }
    private void printOut() {
        System.out.println("================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(sampleData);

        // SPEL 커스터마이징하기
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2 + 100");
        Integer val = expression.getValue(Integer.class);
        System.out.println(val);
    }
}
