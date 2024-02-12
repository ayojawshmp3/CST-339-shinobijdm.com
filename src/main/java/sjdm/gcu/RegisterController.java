package sjdm.gcu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/home")
public class RegisterController {
	
	@GetMapping("/register")
	public String display(Model model) {
		model.addAttribute("title", "Register Form");
		model.addAttribute("registerModel", new RegisterModel());
		return "register"; // View Name
	}
	
	@PostMapping("/doRegister")
	public String doRegister(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model) {
		//System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(), loginModel.getPassword()));
		
		// Check for validation errors:
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Register Form");
			return "register"; // View Name
		}
		
		// Return View Name
		return "register"; 
	}
}
