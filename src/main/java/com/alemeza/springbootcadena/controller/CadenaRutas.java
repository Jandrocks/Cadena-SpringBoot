package com.alemeza.springbootcadena.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class CadenaRutas {
	
	@RequestMapping("/")
	public String rutaRaiz() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String rutaRandom() {
		return "Spring Boot is greate!! So easy to just respond with strings";
	}
}
