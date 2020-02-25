package de.npruehs.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.npruehs.website.model.Project;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Project[] projects = new Project[1];
		
		projects[0] = new Project();
		projects[0].setName("Name");
		projects[0].setSummary("Summary");
		projects[0].setImgSrc("");
		projects[0].setUrl("#");
		
		model.addAttribute("projects", projects);
		return "home";
	}
}
