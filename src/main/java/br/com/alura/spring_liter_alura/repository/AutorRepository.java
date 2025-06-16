package br.com.alura.spring_liter_alura.repository;

import br.com.alura.spring_liter_alura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {

}
