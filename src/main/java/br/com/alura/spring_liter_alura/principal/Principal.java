package br.com.alura.spring_liter_alura.principal;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.util.Scanner;

public class Principal {
private Scanner leitura = new Scanner(System.in);

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
                    System.out.println("Buscar livro pelo titluo");
                    break;
                case 2:
                    System.out.println("Buscar livros registrados");
                    break;
                case 3:
                    System.out.println("Listar os autores");
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

}
