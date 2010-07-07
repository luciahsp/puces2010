package org.puc.contatos;

public class DAOFactory {
    public static DAO criarDAO(){
        return new LoggerDAO(new ContatoDAO());
    }

}
