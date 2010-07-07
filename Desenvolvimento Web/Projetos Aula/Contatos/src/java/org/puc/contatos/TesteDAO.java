package org.puc.contatos;

import java.sql.SQLException;
import java.util.List;

public class TesteDAO {

    public static void main(String[] args) throws SQLException{

        ContatoDAO dao = new ContatoDAO();
        List<Contato> lista = dao.listContatos();

        for(Contato c : lista){
            System.out.println(c.toString());
        }

    }
}
