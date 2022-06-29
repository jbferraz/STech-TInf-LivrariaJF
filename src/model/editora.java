/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *6. Sobre as editoras, a livraria precisa de
     * seu código, endereço, telefone de contato, e o nome de seu gerente. 
 * @author jairb
 */
public class editora {
    private int idEditora;
    private String nmEditora;
    private String endereco;
    private String telefone;
    private String gerente;

    public editora() {
    }

    /**
     * 
     * @param idEditora
     * @param nmEditora
     * @param endereco
     * @param telefone
     * @param gerente 
     */
    public editora(int idEditora, String nmEditora, String endereco, String telefone, String gerente) {
        this.idEditora = idEditora;
        this.nmEditora = nmEditora;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
    }
    
    public int getIdEditora() {
        return idEditora;
    }
    
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNmEditora() {
        return nmEditora;
    }

    public void setNmEditora(String nmEditora) {
        this.nmEditora = nmEditora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "editora{" + "idEditora=" + idEditora + ", nmEditora=" + 
                nmEditora + ", endereco=" + endereco + ", telefone=" + 
                telefone + ", gerente=" + gerente + '}';
    }
    
    
}
