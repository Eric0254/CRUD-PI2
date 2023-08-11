/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepi.MODEL;

import java.util.Date;
public class Relatorio {
    
    private Date data;
    private Date dataINI;
    private Date dataFIM;
    private String cliente;
    private String produto;
    private double valorUni;
    private double valorTotal;
    private int quantidade;
    private double valor; 
    

    public Relatorio() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataINI() {
        return dataINI;
    }

    public void setDataINI(Date dataINI) {
        this.dataINI = dataINI;
    }

    public Date getDataFIM() {
        return dataFIM;
    }

    public void setDataFIM(Date dataFIM) {
        this.dataFIM = dataFIM;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProdutos() {
        return produto;
    }

    public void setProdutos(String produtos) {
        this.produto = produtos;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Relatorio(Date Data, String Cliente, double Valor, double ValorTotal) {
        this.data = Data;
        this.cliente = Cliente;
        this.valor = Valor;
        this.valorTotal = ValorTotal;
    }
    
    public Relatorio(String Produto, Date Data, String Cliente, double Valor, int Quantidade, double ValorUnit) {
        this.produto = Produto;
        this.quantidade = Quantidade;
        this.valorUni = ValorUnit;
        this.data = Data;
        this.cliente = Cliente;
        this.valor = Valor;
    }

    
    
    
    
    
    
    
}
