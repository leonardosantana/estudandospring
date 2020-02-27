package br.com.leonardosousa.estudandospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sun.font.Script;

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
			String crypt = new BCryptPasswordEncoder().encode("12345");
			String crypt2 = new BCryptPasswordEncoder().encode("12345");

			System.out.println("cript= " + crypt + " senha é " + new BCryptPasswordEncoder().matches("12345", crypt));
			System.out.println("cript2= " + crypt2 + " senha é " + new BCryptPasswordEncoder().matches("12345", crypt2));

		};
	}
}
