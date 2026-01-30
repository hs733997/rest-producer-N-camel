package com.harts.apache.camel.routes;

import com.harts.apache.camel.processor.HttpMethodProcesser;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestConsumerRoute extends RouteBuilder {
    private final HttpMethodProcesser httpMethodProcesser;
    public RestConsumerRoute(HttpMethodProcesser httpMethodProcesser){
        this.httpMethodProcesser = httpMethodProcesser;
    }

    @Override
    public void configure() throws Exception {
        from("timer://producer-timer?period=10000")
                .log("Rest Api Calling...")
                .setHeader(Exchange.HTTP_METHOD, simple("GET"))
                .to("http://localhost:9090/api/car-details")
                .process(httpMethodProcesser);
    }
}
