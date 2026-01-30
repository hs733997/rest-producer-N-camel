package com.harts.apache.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class HttpMethodProcesser implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println(
                exchange.getIn().getBody(String.class)
        );
    }
}
