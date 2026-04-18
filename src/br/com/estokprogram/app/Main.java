package br.com.estokprogram.app;

import br.com.estokprogram.model.Produto;
import br.com.estokprogram.service.EstoqueService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        EstoqueService service = new EstoqueService();

        int resposta;

        do {
            System.out.println();
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Ver estoque");
            System.out.println("3 - Realizar venda");
            System.out.println("0 - Sair");

            resposta = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (resposta) {
                case 1 -> service.cadastrarProduto(sc, produto);
                case 2 -> service.verEstoque(produto);
                case 3 -> service.realizarVenda(sc, produto);
                case 0 -> System.out.println("\nSaindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (resposta != 0);
        sc.close();
    }
}
