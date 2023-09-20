package com.aryak.camelactivemq.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class JmsRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("jms:queue:orders").log(LoggingLevel.INFO, "Got a message : ${body}");

	}

}
