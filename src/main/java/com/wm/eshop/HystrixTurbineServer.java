package com.wm.eshop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
// 可视化监控系统集群的turbin
@EnableTurbine
public class HystrixTurbineServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixTurbineServer.class).web(true).run(args);
	}

}
