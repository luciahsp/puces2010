
package org.apptestemvc;

import java.util.ArrayList;
import java.util.List;

public class ModelListaSites {

    public List<String> getSites(String tipo){
        List<String> lista = new ArrayList<String>();

        if (tipo.equals("Noticias")){
            lista.add("www.folhaonline.com.br");
            lista.add("www.g1.com.br");
        }
        else if (tipo.equals("Componentes")){
            lista.add("www.telerik.com.br");
            lista.add("www..com.br");
        } else if (tipo.equals("Teste")){
            lista.add("www.teste1.com.br");
            lista.add("www.teste2.com.br");
        }

        return lista;
    }

}
