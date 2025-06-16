package br.com.alura.spring_liter_alura.model;


import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String titulo;
     private Integer downlond;
     @Enumerated(EnumType.STRING)
     private Idioma idioma;

     @ManyToOne(cascade = CascadeType.PERSIST)
     private Autor autor;

     public Livro(){}

    public Livro(DadosLivro dadosLivro) {
         this.titulo = dadosLivro.getTitulo();
         this.autor = new Autor(dadosLivro.getAutores().get(0));
         //this.idioma = dadosLivro.getIdioma().get(0);
        this.idioma = Idioma.fromString(dadosLivro.getIdioma().get(0));
         this.downlond = dadosLivro.getDownlond();

    }

    public Livro(Long id,String titulo, Integer downlond, Idioma idioma, Autor autor) {
        this.id = id;
         this.titulo = titulo;
        this.downlond = downlond;
        this.idioma = idioma;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDownlond() {
        return downlond;
    }

    public void setDownlond(Integer downlond) {
        this.downlond = downlond;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: "
                 + titulo + "\n" +
                "Autor= "+ autor +"\n"+
                "Downlond= " + downlond + "\n" +
                "Idioma= " + idioma + "\n"
                ;
    }
}
