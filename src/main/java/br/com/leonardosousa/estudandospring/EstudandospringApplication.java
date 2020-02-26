package br.com.leonardosousa.estudandospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EstudandospringApplication {

	@Value("${teste123}")
	private Long teste123;

	public static void main(String[] args) {
		SpringApplication.run(EstudandospringApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			System.out.println("teste123= " +  this.teste123);
		};
	}
}
