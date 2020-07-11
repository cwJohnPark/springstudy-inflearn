//package me.cwpark.inflearnspringbootstudy.ssl;
//
//import org.apache.catalina.connector.Connector;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////@RestController
//public class SSLController {
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "hellya";
//    }
//
//    // https 와 http 동시에 사용하기
//    // https://github.com/spring-projects/spring-boot/blob/v2.0.3.RELEASE/spring-boot-samples/spring-boot-sample-tomcat-multi-connectors/src/main/java/sample/tomcat/multiconnector/SampleTomcatTwoConnectorsApplication.java
//    @Bean
//    public ServletWebServerFactory serverFactory() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//        return tomcat;
//    }
//
//    private Connector createStandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(0);
//        return connector;
//    }
//}
