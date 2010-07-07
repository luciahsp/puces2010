package org.agenda;

import java.util.List;
import javax.ejb.Local;

@Local
public interface GerenciadorAgendaLocal {
    
    public List<Pessoa> listarPessoas();

    public Pessoa recuperaPessoa(int id);

    public void insereTelefone(Telefone tel);
}
