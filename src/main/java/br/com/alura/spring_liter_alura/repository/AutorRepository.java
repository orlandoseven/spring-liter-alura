package br.com.alura.spring_liter_alura.repository;

import br.com.alura.spring_liter_alura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor,Long> {
    @Query("SELECT a FROM Autor a WHERE a.anoNascimento <= :anoAutor AND (a.anoMorte IS NULL OR a.anoMorte >= :anoAutor)")
    List<Autor> findAllByAno(int anoAutor);

    }
