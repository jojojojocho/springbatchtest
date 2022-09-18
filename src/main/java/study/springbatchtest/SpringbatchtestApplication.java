package study.springbatchtest;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringbatchtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchtestApplication.class, args);
	}

}
