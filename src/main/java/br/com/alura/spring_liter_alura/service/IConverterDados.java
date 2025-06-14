package br.com.alura.spring_liter_alura.service;

import java.util.List;

public interface IConverterDados {
    <T> T obterDados(String json,Class<T> classe);
    <T> List<T> obterLista(String json,Class<T> classe);
}
