package com.generation.helloworld1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello1Controller {

	@GetMapping
	public String hello() {
	return "<b>Hello World</b>";

}

	@GetMapping("/bsm")
	public String listaBsm() {
	return "<b>Mentalidade de Crescimento<br/><br/>Responsabilidade Pessoal<br/></br>Orientação para o futuro</br>";
			
}
	
	@GetMapping("/meus objetivos")
	public String meusObjetivos() {
		return "<b>Mentalidade de Crescimento</>";
	}
}