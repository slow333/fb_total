package spring.frontend_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.frontend_backend.system.IdWorker;

@SpringBootApplication
public class FrontBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontBackApplication.class, args);
	}

	@Bean
	public IdWorker idWorker() {
		return new IdWorker(1,1);
	}
}
