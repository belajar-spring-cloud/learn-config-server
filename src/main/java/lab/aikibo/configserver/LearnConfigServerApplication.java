package lab.aikibo.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LearnConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnConfigServerApplication.class, args);
	}
}
