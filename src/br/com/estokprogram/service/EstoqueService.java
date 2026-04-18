package br.com.estokprogram.service;

import br.com.estokprogram.model.Produto;
import java.util.Scanner;

public class EstoqueService {

    public void cadastrarProduto(Scanner sc, Produto produto) {
        System.out.println();
        System.out.print("Digite o nome: ");
        produto.setNome(sc.nextLine());

        System.out.print("Digite o preço: ");
        produto.setPreco(sc.nextDouble());
        sc.nextLine(); // Limpar buffer

        System.out.print("Digite a quantidade: ");
        produto.setQuantidade(sc.nextInt());
        sc.nextLine(); // Limpar buffer
        System.out.println();
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void realizarVenda(Scanner sc, Produto produto) {
        System.out.println();
        System.out.print("Quantidade a ser vendida: ");
        int venda = sc.nextInt();
        sc.nextLine();

        if (venda > produto.getQuantidade()) {
            System.out.println("Estoque insuficiente para realizar a venda.");
            return;
        }


        System.out.println();
        System.out.println("Venda realizada com sucesso!");
        System.out.println();
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Estoque antes da venda: " + produto.getQuantidade() + " unidades");
        produto.setQuantidade(produto.getQuantidade() - venda);
        System.out.println("Venda realizada: " + venda + " unidades");
        System.out.println("Estoque atualizado: " + produto.getQuantidade() + " unidades");
    }

    public void verEstoque(Produto produto) {
        System.out.println();
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Estoque atual: " + produto.getQuantidade() + " unidades");
    }
}
