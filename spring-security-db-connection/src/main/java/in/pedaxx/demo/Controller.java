package in.pedaxx.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@RequestMapping("/")
	public String anyone() {
		
		return "<h1> HEllO PLS VALIDATE     </h1>  ";
	}
	
	@RequestMapping("/user")
	public String user() {
		
		return "<h1> HEllO user     </h1>  ";
	}
	
	
	@RequestMapping("/admin")
	public String admin() {
		
		return "<h1> HEllO admin     </h1>  ";
	}
	
	
	

}
