package org.puc.contatos;

import java.sql.SQLException;
import java.util.List;

public class LoggerDAO implements DAO {

    private DAO dao;

    public LoggerDAO(DAO dao){
        this.dao = dao;
    }
    public List<Contato> listContatos() throws SQLException{

        System.out.println("Método listContatos() invocado");
        List<Contato> list = dao.listContatos();
        System.out.println("listContatos() exec. e retornou " + list.size() + " contados");

        return list;
    }

}
