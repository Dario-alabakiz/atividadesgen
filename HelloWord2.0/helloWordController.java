package org.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
public class helloWordController {

	@GetMapping
	public String hello() {
		return "Alo mundão";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de Crescimento";
	}
	@GetMapping("/obj")
	public String obj() {
		return "Me empenhar mais, ter foco, não desistir não importa a dificuldade, ter o pé firme e focando em conquistar meus objetivos.";
	}
	
}
