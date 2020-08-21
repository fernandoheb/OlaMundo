package br.com.olamvc.OlaMundo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OlaMundoController {
	
	@GetMapping("/olamundo")
	public String OlaMundo(@RequestParam(name="name",defaultValue = "Mundo",required = false) String name, 
			@RequestParam(name="dices", required=false, defaultValue = "2") String dice,			
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("dice", dice);
		Random r = new Random();	
		Integer valor = r.nextInt(Integer.valueOf(dice)) +1;		
		model.addAttribute("roll", valor);
		
		return "olamundo";
	}

}
