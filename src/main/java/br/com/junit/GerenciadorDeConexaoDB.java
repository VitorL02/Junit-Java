package br.com.junit;

import java.util.logging.Logger;

public class GerenciadorDeConexaoDB {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoDB.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("inicia Conexão");
    }

    public static void insereDadosPessoa(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }


    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }

    public static void finalizaConexao(){
        LOGGER.info("finalizou Conexão");
    }
}

