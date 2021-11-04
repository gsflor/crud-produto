package com.wine.model;

import java.time.LocalDate;


public class Produto {
	private int codigo; 
    private String nome;
    private Double preco;
    private String marca;
    private String categoria;
    private LocalDate validade;

    public Produto(int codigo, String nome, Double preco, String marca, String categoria, LocalDate validade) {
        this.codigo = codigo;
    	this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
    public String toString() {
    	    	
    	String str = "Código: " +this.codigo;
    	str = str +	"\nNome: "+ this.nome;
    	str = str + "\nPreco: "+this.preco;
    	str = str + "\nMarca: "+this.marca;
    	str = str + "\nCategoria: "+this.categoria;
    	str = str + "\nValidade: "+ this.validade;
    	return str;
    }
}
