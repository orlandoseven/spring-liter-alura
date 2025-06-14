package br.com.alura.spring_liter_alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosLivro {
    @JsonAlias("title")
    private String titulo;

    @JsonAlias("download_count" )
    private Integer downlond;

    @JsonAlias("languages")
    private List<String> idioma;

    @JsonAlias("authors")
    private List<DadosAutor> autores;

    public String getTitulo() {
        return titulo;
    }

    public Integer getDownlond() {
        return downlond;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public List<DadosAutor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        return "DadosLivro{" +
                "titulo='" + titulo + '\'' +
                ", downlond=" + downlond +
                ", idioma=" + idioma +
                ", autores=" + autores +
                '}';
    }
}
