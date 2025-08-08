package com.example.mahTeck.Projeto.MahTeck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoMahTeckApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoMahTeckApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
		System.out.println("Aplicação iniciada com sucesso!");
	}

}