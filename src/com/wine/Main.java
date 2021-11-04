package com.wine;

import com.wine.model.Estoque;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();
                    
        while(true) {
            imprimir("====[ Controle de Estoque ]====\n");
            exibirOpcoes();
            String resposta = lerEntrada("\nInforme o numero da opcao desejada: ");
            estoque = realizarAcao(estoque, resposta);
        }
    }

    private static Estoque realizarAcao(Estoque estoque, String resposta) {
    	switch (resposta){
            case "1":
                estoque.cadastrarProduto();
                break;
            case "2":
                estoque.alterarProduto();
                break;
            case "3":
                estoque.excluirProduto();
                break;
            case "4":
                estoque.exibirProduto();
                break;
            case "5":
                estoque.listarPorCategoria();
                break;
            case "6":
                estoque.listarVencidos();
                break;   
            default:
            	imprimir("Opcao invalida.");
            	break;
        }
        return estoque;
    }

    private static void exibirOpcoes() {
        imprimir("1. Cadastrar produto");
        imprimir("2. Alterar produto");
        imprimir("3. Excluir produto");
        imprimir("4. Exibir produto");
        imprimir("5. Listar produtos por categoria");
        imprimir("6. Listar produtos vencidos");
    }

    private static void imprimir(String s) {
        System.out.println(s);
    }

    public static String lerEntrada(String texto){
        Scanner obj = new Scanner(System.in);
        System.out.println(texto);
        return obj.nextLine();
    }

}
