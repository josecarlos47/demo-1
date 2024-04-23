package com.salesianos.dam.paquete1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ControladorSaludo {
	
	@GetMapping({"/", "saludo"})
	
	public String saludo(@RequestParam(name="nombre", required = false, defaultValue = "mundo") String nombre, Model model) {
		model.addAttribute(nombre);
		return "index";
	}
	

}
