package ar.edu.unju.fi.tp4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	@GetMapping("/inicio")
	public String getInicioPage() {
		return "inicio";
	}
	
}
