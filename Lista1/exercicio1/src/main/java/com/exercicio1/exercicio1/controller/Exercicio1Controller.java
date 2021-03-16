package com.exercicio1.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class Exercicio1Controller {
	
	@GetMapping
	public String ex1() {
		return "Mentalidade de crescimento, persistência, proatividade e atenção aos detalhes";
	}

}
