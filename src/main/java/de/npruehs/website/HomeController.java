package de.npruehs.website;

import java.util.Arrays;
import java.util.Collections;

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
		Project[] projects = new Project[12];
		
		projects[0] = new Project();
		projects[0].setName("Thorup (Bachelor Thesis)");
		projects[0].setSummary("Java, library, math, shortest paths");
		projects[0].setImgSrc("img/thorup.png");
		projects[0].setUrl("https://github.com/npruehs/Thorup");
		
		projects[1] = new Project();
		projects[1].setName("Hostile Worlds");
		projects[1].setSummary("Unreal Engine, game, C++, online, full stack, UI, gameplay, project management");
		projects[1].setImgSrc("img/hostile_worlds.png");
		projects[1].setUrl("https://www.indiedb.com/games/hostile-worlds");
		
		projects[2] = new Project();
		projects[2].setName("ByChance Framework");
		projects[2].setSummary("C#, library, procedural content generation");
		projects[2].setImgSrc("img/bychance.png");
		projects[2].setUrl("https://github.com/npruehs/ByChance");
		
		projects[3] = new Project();
		projects[3].setName("FreudBot");
		projects[3].setSummary("Unity, game, C#, mobile, localization, test automation, gameplay");
		projects[3].setImgSrc("img/freudbot.png");
		projects[3].setUrl("https://play.google.com/store/apps/details?id=org.slashgames.FreudBot.AdFree");
		
		projects[4] = new Project();
		projects[4].setName("EMERGENCY HQ");
		projects[4].setSummary("Unity, game, C#, online, frontend, mobile, UI, billing");
		projects[4].setImgSrc("img/emhq.png");
		projects[4].setUrl("https://apps.apple.com/us/app/emergency-hq/id859148736");
		
		projects[5] = new Project();
		projects[5].setName("Astro City");
		projects[5].setSummary("Unity, game, C#, online, full stack, mobile, UI, gameplay, ScrumBut");
		projects[5].setImgSrc("img/astrocity.png");
		projects[5].setUrl("https://play.google.com/store/apps/details?id=com.mobilemonsters.mmff_dev");
		
		projects[6] = new Project();
		projects[6].setName("Tome");
		projects[6].setSummary("Qt, tool, C++, open source, data, test automation");
		projects[6].setImgSrc("img/tome.png");
		projects[6].setUrl("http://www.tome-editor.org/");
		
		projects[7] = new Project();
		projects[7].setName("Blackguards 2");
		projects[7].setSummary("Unity, game, C#, console, lead");
		projects[7].setImgSrc("img/blackguards2.png");
		projects[7].setUrl("https://www.playstation.com/en-us/games/blackguards-2-ps4/");
		
		projects[8] = new Project();
		projects[8].setName("UE4 RTS");
		projects[8].setSummary("Unreal Engine, library, C++, online, full stack, open source, gameplay, AI, UI");
		projects[8].setImgSrc("img/ue4_rts.png");
		projects[8].setUrl("https://github.com/npruehs/ue4-rts/tree/release/1.0");
		
		projects[9] = new Project();
		projects[9].setName("Speaking & Teaching");
		projects[9].setSummary("conferences, universities");
		projects[9].setImgSrc("img/speaking.png");
		projects[9].setUrl("https://www.slideshare.net/npruehs/presentations");
		
		projects[10] = new Project();
		projects[10].setName("A Year Of Rain");
		projects[10].setSummary("Unreal Engine, game, C++, online, full stack, lead, gameplay, UI");
		projects[10].setImgSrc("img/ayearofrain.png");
		projects[10].setUrl("https://store.steampowered.com/app/319540/A_Year_Of_Rain/");
		
		projects[11] = new Project();
		projects[11].setName("Mission Runner");
		projects[11].setSummary("Spring Boot, game, Java, online, full stack, JPA, Kafka, Hadoop, Thymeleaf, Webflux, Swagger, Android, Retrofit, Dagger, Room, JUnit, Google Truth, Gradle, Maven, Docker, localization");
		projects[11].setImgSrc("img/mission_runner.png");
		projects[11].setUrl("https://github.com/npruehs/mission-runner");

		Collections.reverse(Arrays.asList(projects)); 

		model.addAttribute("projects", projects);
		return "home";
	}
	
	@GetMapping("/impressum")
	public String impressum() {
		return "impressum";
	}
}
