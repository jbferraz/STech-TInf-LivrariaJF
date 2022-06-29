/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author jairb
 */
public class vendaLivro {

    private int idCliente;
    private int idLivro;
    private int qtd;
    private float subTotal;
    private Date dataVenda;

    public vendaLivro() {
    }

    public vendaLivro(int idCliente, int idLivro, int qtd, float subTotal, Date dataVenda) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.qtd = qtd;
        this.subTotal = subTotal;
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "vendaLivro{" + "idCliente=" + idCliente + ", idLivro=" + idLivro + ", qtd=" + qtd + ", subTotal=" + subTotal + ", dataVenda=" + dataVenda + '}';
    }
}
