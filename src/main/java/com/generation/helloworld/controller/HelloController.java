package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b> Comunicação <b>"
				+ " <br /> Mentalidade de Crescimento"
				+ "<br />Persistência "
				+ "<br /> Responsabilidade Pessoal"
				+ " <br />Orientação ao Futuro"
				+ "<br />Orientação ao Detalhe "
				+ "<br />Proatividade"
				+ "<br />Trabalho em Equipe"
				+ "<br /> Comunicação";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender Spring Boot e realizar as tarefas do projeto integrador";
	}
}
