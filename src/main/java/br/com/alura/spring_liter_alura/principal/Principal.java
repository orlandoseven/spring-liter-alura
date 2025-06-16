package br.com.alura.spring_liter_alura.principal;


import br.com.alura.spring_liter_alura.model.*;
import br.com.alura.spring_liter_alura.repository.AutorRepository;
import br.com.alura.spring_liter_alura.repository.LivroRepository;
import br.com.alura.spring_liter_alura.service.ConsumoApi;
import br.com.alura.spring_liter_alura.service.ConverterDados;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://gutendex.com/books/?search=";

    private ConsumoApi consumo = new ConsumoApi();
    private ConverterDados conversor =  new ConverterDados();

    private LivroRepository repositorio;
    private AutorRepository autorRepository;

    private List<Autor> listaAutores = new ArrayList<>();
    private List<Livro> listaLivros = new ArrayList<>();

    public Principal(LivroRepository repositorio,AutorRepository autorRepository) {
        this.repositorio = repositorio;
        this.autorRepository = autorRepository;
    }


    public void exibirMenu(){
        var opcao = -1;
        while (opcao != 0){
            var menu = """
                          ESCOLHA UMA OPÇÃO:
                          
                          1 - BUSCAR LIVRO PELO TÍTULO
                          2 - LISTAR LIVROS REGISTRADOS
                          3 - LISTAR NOSSOS AUTORES
                          4 - LISTAR AUTORES EM DETERMINADO ANO
                          5 - LISTAR LIVROS EM DETERMINADO IDIOMA
                          0 - SAIR 
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    buscarLivros();
                    break;
                case 2:
                    System.out.println("Buscar livros registrados\n");
                    buscarLivrosRegistrados();
                    break;
                case 3:

                    System.out.println("Listar os autores");
                    listarAutor();
                    break;
                case 4:
                    System.out.println("Listar autores em um ano");
                    break;
                case 5:
                    System.out.println("Listar livros determinado ano");
                    break;

                case 0:
                    System.out.println("Encerrado o programa");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }



    private void buscarLivros() {
     ResultsGutendex dadosLivro = getDadosLivro();
        DadosLivro livroBuscado = dadosLivro.getResultado().get(0);
        DadosAutor autorLivro = livroBuscado.getAutores().get(0);
        Autor autor = new Autor(autorLivro);
        Livro livro = new Livro(livroBuscado);
        //listaLivros.add(livro);
        //listaAutores.add(autor);
        repositorio.save(livro);
        autorRepository.save(autor);


        System.out.println("  Livro Buscado:\n"+livro);
    }

    private ResultsGutendex getDadosLivro() {
        System.out.println("Digite o nome do livro:");
        var nomeLivro = leitura.nextLine();
        var url = ENDERECO + nomeLivro.replace(" ","%20");
        var json = consumo.obterDados(url);
        //System.out.println(json);
        var listaResultado  = conversor.obterDados(json, ResultsGutendex.class);
        return listaResultado;
    }

    private void buscarLivrosRegistrados(){
     List<Livro> livros = repositorio.findAll();
     livros.stream()
                     .sorted(Comparator.comparing(Livro::getTitulo))
                             .forEach(System.out::println);
     //listaLivros.forEach(System.out::println);
    }

    private void listarAutor() {
        listaAutores = autorRepository.findAll();
        listaAutores.stream().forEach(System.out::println);
    }



}
