package br.com.alura.spring_liter_alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsGutendex{
    @JsonAlias("results")
    private List<DadosLivro> resultado;

    public List<DadosLivro> getResultado() {
        return resultado;
    }

    public void setResultado(List<DadosLivro> resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "ResultsGutendex{" +
                "resultado=" + resultado +
                '}';
    }
}
