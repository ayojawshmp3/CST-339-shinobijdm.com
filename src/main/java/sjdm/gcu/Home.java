package sjdm.gcu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {

	@GetMapping("/")
	public String home() {
		return "home"; // View Name
	}
}
