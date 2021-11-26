package com.boot.web.webservice.HystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixDashboardMicroServiceMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardMicroServiceMonitoringApplication.class, args);
	    System.out.println("#####  HystrixDashboard is started  ####");
	}

}
