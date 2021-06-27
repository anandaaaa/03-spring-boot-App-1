package in.anand.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.anand.app.service.UserService;

@SpringBootApplication
@ComponentScan(basePackages={"in.anand.app","com.anand.app"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		UserService bean = run.getBean(UserService.class);
		
		bean.registeruser();
	}

}
