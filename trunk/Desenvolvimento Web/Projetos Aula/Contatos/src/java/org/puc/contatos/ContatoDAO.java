package org.puc.contatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO implements DAO {

    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public List<Contato> listContatos() throws SQLException{
        List<Contato> lista = new ArrayList<Contato>();

        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            stm = con.prepareStatement("select name, phone, fax, email from APP.CUSTOMER");

            rs = stm.executeQuery();

            while(rs.next()){
                Contato c = new Contato();
                c.setNome(rs.getString("name"));
                c.setTelefone(rs.getString("phone"));
                c.setFax(rs.getString("fax"));
                c.setEmail(rs.getString("email"));

                lista.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                con.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return lista;
    }
}
