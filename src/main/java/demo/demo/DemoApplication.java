package demo.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.demo.model.Pessoa;
import demo.demo.repository.PessoaRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Pessoa us1 = new Pessoa(1L, "John Lennon", "Lennnon");
		Pessoa us2 = new Pessoa(2L, "Paul McCartney", "McCartney");
		Pessoa us3 = new Pessoa(3L, "Maria ", "Bonita");

		pessoaRepository.saveAll(Arrays.asList(us1, us2, us3));

	}

}
