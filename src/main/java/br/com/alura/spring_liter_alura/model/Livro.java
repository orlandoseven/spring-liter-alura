package br.com.alura.spring_liter_alura.model;



public class Livro {

     private String titulo;
     private Integer downlond;
     private String idioma;
     private Autor autor;

     public Livro(){}

    public Livro(DadosLivro dadosLivro) {
         this.titulo = dadosLivro.getTitulo();
         this.autor = new Autor(dadosLivro.getAutores().get(0));
         this.idioma = dadosLivro.getIdioma().get(0);
         this.downlond = dadosLivro.getDownlond();

    }

    public Livro(String titulo, Integer downlond, String idioma, Autor autor) {
        this.titulo = titulo;
        this.downlond = downlond;
        this.idioma = idioma;
        this.autor = autor;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
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
                "Autor= "+ autor.getNome() +"\n"+
                "Downlond= " + downlond + "\n" +
                "Idioma= " + idioma
                ;
    }
}
