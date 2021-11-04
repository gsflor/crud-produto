package com.wine.model;

import java.util.*;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
    }

    public void listarVencidos() {
    	imprimir("\nProdutos vencidos:");
    	//TODO: Implementar
    }

    public void listarPorCategoria() {
    	String categoriaInformada = lerEntrada("\nInforme a categoria a ser exibida:");
		//TODO: Implementar
    }

    public void exibirProduto() {
    	int codigoInformado = Integer.parseInt(lerEntrada("\nInforme o código do produto  a ser exibido:"));
		//TODO: Implementar
    }

    public void excluirProduto() {
    	int produtoExcluir = Integer.parseInt(lerEntrada("\nInforme o código do produto a ser excluido:"));
		//TODO: Implementar
   }

    public void alterarProduto() {
    	int produtoAlterar = Integer.parseInt(lerEntrada("\nInforme o código do produto a ser alterado:"));
		//TODO: Implementar
    }

    public void cadastrarProduto() {
		//TODO: Implementar
    }

    private String lerEntrada(String texto){
        Scanner obj = new Scanner(System.in);
        System.out.println(texto);
        return obj.nextLine();
    }
    private static void imprimir(String s) {
        System.out.println(s);
    }

}
