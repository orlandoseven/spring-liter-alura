package br.com.alura.spring_liter_alura.repository;

import br.com.alura.spring_liter_alura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
