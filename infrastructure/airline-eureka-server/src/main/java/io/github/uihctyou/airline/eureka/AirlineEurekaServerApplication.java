package io.github.uihctyou.airline.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirlineEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineEurekaServerApplication.class, args);
	}

}
