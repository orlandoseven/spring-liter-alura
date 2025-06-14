package br.com.alura.spring_liter_alura.model;

public enum Idioma {
        PORTUGUES("pt"),
        INGLES("en"),
        ESPANHOL("es"),
        FRANCES("fr"),
       ALEMAO("de"),
       CHINES("zh"),
       JAPONES("ja"),
      RUSSO("ru"),
      ITALIANO("it"),
      ARABE("ar"),
    ;
    private String idiomaLivro;

    Idioma(String idiomaLivro) {
        this.idiomaLivro = idiomaLivro;
    }

    public static Idioma fromString(String text){
        for (Idioma idioma : Idioma.values()){
            if (idioma.idiomaLivro.equalsIgnoreCase(text)){
                return idioma;
            }
        }
        throw new IllegalArgumentException("Idioma não encontrado");
    }


}
