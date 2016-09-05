package blog.cloudsea.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class GreetingApp {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApp.class, args);
	}
}

@RestController
@RefreshScope
class GreetingController {

	@Value("${message}")
	private String message;

	@RequestMapping("/")
	public String greetUser() {
		return message;
	}
}