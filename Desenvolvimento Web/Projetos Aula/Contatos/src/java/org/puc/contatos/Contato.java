package org.puc.contatos;

public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private String fax;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        String resultado = "";

        resultado = getNome();
        resultado = resultado + " " + getTelefone();
        resultado = resultado + " " + getFax();
        resultado = resultado + " " + getEmail();

        return resultado;
    }



}
