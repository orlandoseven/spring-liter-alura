package br.com.alura.spring_liter_alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosAutor {

    @JsonAlias("name") String nome;

    @JsonAlias("birth_year") Integer anoNascimento;

    @JsonAlias("death_year") Integer anoMorte;

    public String getNome() {
        return nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public Integer getAnoMorte() {
        return anoMorte;
    }

    @Override
    public String toString() {
        return "DadosAutor{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", anoMorte=" + anoMorte +
                '}';
    }
}
