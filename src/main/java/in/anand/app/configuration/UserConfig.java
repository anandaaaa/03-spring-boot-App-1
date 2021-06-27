package in.anand.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.anand.app.*;

@Configuration
public class UserConfig {

	public UserConfig() {

		System.out.println("user configuration");
	}
	
	@Bean
	public Bus getBus()
	{
		Bus bus = new Bus();
		return bus;
	}
	
	
}
