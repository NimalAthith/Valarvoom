	package com.valarchi.valarvoom;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	//RestController is important
	@SpringBootApplication
	@Controller
	public class ValarvoomApplication {

		public static void main(String[] args) {
			SpringApplication.run(ValarvoomApplication.class, args);
		}

	@GetMapping("/[^\\\\.]+/**")
	public String summa() {
		System.out.println("pirnt");
		return "index";
	}
		

	}
