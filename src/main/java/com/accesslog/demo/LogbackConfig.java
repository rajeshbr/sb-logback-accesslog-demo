package com.accesslog.demo;

import ch.qos.logback.access.tomcat.LogbackValve;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;


@Component
public class LogbackConfig implements
        WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Value("${logging.access.config}")
    private String logbackAccessConfig;

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        System.out.println("I am here !!!!!!!!!!!");
        LogbackValve logbackValve = new LogbackValve();
        logbackValve.setFilename(logbackAccessConfig);
        logbackValve.setAsyncSupported(true);
        factory.addEngineValves(logbackValve);


    }
}
