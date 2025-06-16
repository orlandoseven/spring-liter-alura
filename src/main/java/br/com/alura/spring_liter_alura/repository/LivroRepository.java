package br.com.alura.spring_liter_alura.repository;

import br.com.alura.spring_liter_alura.model.Idioma;
import br.com.alura.spring_liter_alura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro,Long> {
    List<Livro> findAllByIdioma(Idioma idiomaEscolhido);

    Object countByIdioma(Idioma idiomaEscolhido);
}
