package br.com.alura.spring_liter_alura.model;


import java.util.ArrayList;
import java.util.List;


public class Autor{

    private String nome;
    private Integer anoNascimento;
    private Integer anoMorte;

    private List<Livro> livros = new ArrayList<>();

    public Autor(){}

    public Autor(DadosAutor dadosAutor) {
        this.nome = dadosAutor.getNome();
        this.anoNascimento = dadosAutor.getAnoNascimento();
        this.anoMorte = dadosAutor.getAnoMorte();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoMorte() {
        return anoMorte;
    }

    public void setAnoMorte(Integer anoMorte) {
        this.anoMorte = anoMorte;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return   nome +"\n"+
                "AnoNascimento= " + anoNascimento + "\n"+
                "AnoMorte= " + anoMorte
                ;
    }
}


