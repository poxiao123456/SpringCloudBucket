package com.cml.springcloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class AdminMetricApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(AdminMetricApplication.class).web(true).run(args);
	}
}