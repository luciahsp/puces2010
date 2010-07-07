package org.puc.contatos;

import java.sql.SQLException;
import java.util.List;

public interface DAO {

    List<Contato> listContatos() throws SQLException;

}
