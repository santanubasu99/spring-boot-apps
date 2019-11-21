package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "\nGreetings from Spring Boot Framework running from AKS with Jenkins pipeline!\n\n";
	}
}