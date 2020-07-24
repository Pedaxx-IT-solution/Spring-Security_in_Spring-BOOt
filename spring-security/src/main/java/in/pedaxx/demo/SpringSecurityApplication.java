package in.pedaxx.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("started");
		
	}

	
	@GetMapping("/index")
	@ResponseBody
	public String getindex() {
		
		return "index";
	}
	
	
	@GetMapping("/user")
	@ResponseBody
	public String getuser() {
		
		return "user page";
	}
	
	
	@GetMapping("/admin")
	@ResponseBody
	public String getadmin() {
		
		return "admin page";
	}
	
	
	
}
