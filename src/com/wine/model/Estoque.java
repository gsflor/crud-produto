package com.wine.model;

import java.util.*;
import java.time.LocalDate;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
    }

    public void listarVencidos() {
    	imprimir("\nProdutos vencidos:");
    	LocalDate currentDate = LocalDate.now();
      int i = 0;
        for (i = 0; i <produtos.size(); i++) {
          if (produtos.get(i).getValidade().compareTo(currentDate)<0) {
            System.out.println(produtos.get(i).toString());
          }
        }
    }

    public void listarPorCategoria() {
    	String categoriaInformada = lerEntrada("\nInforme a categoria a ser exibida:");
        int i = 0;
        for (i = 0; i < produtos.size(); i++) {
          if (produtos.get(i).getCategoria().equals(categoriaInformada)) {
            System.out.println(produtos.get(i).toString());
          }
        }
    }

    public void exibirProduto() {
    	int codigoInformado = Integer.parseInt(lerEntrada("\nInforme o código do produto  a ser exibido:"));
      int i=0;
      for (i = 0; i <= produtos.size(); i++) {
        if (produtos.get(i).getCodigo() == codigoInformado) {
          System.out.println(produtos.get(i).toString());
          break;
        }
      }  
    }

    public void excluirProduto() {
    	int produtoExcluir = Integer.parseInt(lerEntrada("\nInforme o código do produto a ser excluido:"));
      int i=0;
      for(i=0;i<produtos.size();i++){
        if(produtos.get(i).getCodigo()==produtoExcluir){
          produtos.remove(produtos.get(i));
          break;
        }
      }
   }

    public void alterarProduto() {
    	int produtoAlterar = Integer.parseInt(lerEntrada("\nInforme o código do produto a ser alterado:"));
        int i = 0;
        for (i = 0; i < produtos.size(); i++) {
          if (produtos.get(i).getCodigo() == produtoAlterar) {
            produtos.get(i).setCodigo(Integer.parseInt(lerEntrada("\nInforme o Código do produto a ser cadastrado:")));
            produtos.get(i).setNome(lerEntrada("\nInforme o Nome do produto a ser alterado:"));
            produtos.get(i).setPreco(Double.parseDouble(lerEntrada("\nInforme o Nome do produto a ser alterado:")));
            produtos.get(i).setMarca(lerEntrada("\nInforme o Nome do produto a ser alterado:"));
            produtos.get(i).setCategoria(lerEntrada("\nInforme o Nome do produto a ser alterado:"));
            produtos.get(i).setValidade(LocalDate.parse(lerEntrada("\nInforme a Validade do produto a ser cadastrado:")));
            break;
          }
        }
      
    }

    public void cadastrarProduto() {
      int codigo = Integer.parseInt(lerEntrada("\nInforme o Código do produto a ser cadastrado:"));
      String nome = lerEntrada("\nInforme o Nome do produto a ser cadastrado:");
      Double preco = Double.parseDouble(lerEntrada("\nInforme o Preco do pro1duto a ser cadastrado:"));
      String marca = lerEntrada("\nInforme o Marca do produto a ser cadastrado:");
      String categoria = lerEntrada("\nInforme o Categoria do produto a ser cadastrado:");
      LocalDate validade = LocalDate.parse(lerEntrada("\nInforme a Validade do produto a ser cadastrado:"));
      Produto produto = new Produto(codigo, nome, preco, marca, categoria, validade);
      produtos.add(produto);
    }

    public void fillProdutos(){
      LocalDate dateTest1 = LocalDate.of(2018,07,20);
      LocalDate dateTest2 = LocalDate.of(2022, 03, 10);
      produtos.add(new Produto(10, "gau", 1.3, "wine", "vinho", dateTest1));
      produtos.add(new Produto(3, "gau1", 5.3, "wine", "vinho", dateTest1));
      produtos.add(new Produto(9, "gau2", 9.8, "wine", "vinho", dateTest2));
      produtos.add(new Produto(8, "gau3", 9.0, "wine", "vinho", dateTest1));
      produtos.add(new Produto(1, "teste", 9.1, "wine", "snack", dateTest2));
      produtos.add(new Produto(13, "teste1", 10.0, "wine", "snack", dateTest2));
      produtos.add(new Produto(4, "teste2", 31.1, "wine", "snack", dateTest1));
      produtos.add(new Produto(5, "teste3", 7.1, "wine", "snack", dateTest2));
    }

    public void listarProdutos(){
      int i = 0;
      for(i=0;i<produtos.size();i++){
        System.out.println(produtos.get(i).toString());
      }
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
