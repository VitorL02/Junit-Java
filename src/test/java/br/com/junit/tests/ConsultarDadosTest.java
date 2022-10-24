package br.com.junit.tests;

import br.com.junit.GerenciadorDeConexaoDB;
import br.com.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosTest {

    @BeforeAll
   static void configuraConexao(){
        GerenciadorDeConexaoDB.iniciarConexao();
        System.out.println("Rodou Configura Conexao");
    }

    @BeforeEach //Antes de cada teste, faça
    void insereDadosTeste(){
        GerenciadorDeConexaoDB.insereDadosPessoa(new Pessoa("Joao", LocalDate.now()));
    }

    @AfterEach //Antes de cada teste, faça
    void removeDadosTeste(){
        GerenciadorDeConexaoDB.removeDados(new Pessoa("Joao", LocalDate.now()));
    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);

    }

    @AfterAll
    static void fechaConexao(){
        GerenciadorDeConexaoDB.finalizaConexao();
        System.out.println("Rodou Finaliza Conexao");
    }


}
