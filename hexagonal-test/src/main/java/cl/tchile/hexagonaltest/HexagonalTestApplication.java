package cl.tchile.hexagonaltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cl.tchile.*"})
public class HexagonalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalTestApplication.class, args);
	}

}
