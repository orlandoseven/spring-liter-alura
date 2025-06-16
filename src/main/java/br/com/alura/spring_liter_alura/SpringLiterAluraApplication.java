package br.com.alura.spring_liter_alura;

import br.com.alura.spring_liter_alura.principal.Principal;
import br.com.alura.spring_liter_alura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLiterAluraApplication implements CommandLineRunner {
	@Autowired
	private LivroRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SpringLiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibirMenu();

	}
}
