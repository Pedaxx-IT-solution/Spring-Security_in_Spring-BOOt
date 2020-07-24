package in.pedaxx.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityDbConnectionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDbConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println("started");
		
	}

}
