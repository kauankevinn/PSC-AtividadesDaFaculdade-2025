package Sala1_Ricardo_Bicalho.Listas.Lista06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

    /*Desenvolva um programa utilizando o comando “ faça...enquanto ” para exibição do menu de um site de e-commerce. A exibição do menu deverá conter: Cadastrar produto, Listar produto,Alterar produto e Excluir produto.

    Acabei empolgando (*-*) Fiz basicamente um carrinho de compras no qual você pode adicionar coisas ao carrinho, alterar, excluir e listar os produtos 
    */

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            ArrayList<String> carrinho = new ArrayList<>();

            while (true) {
                System.out.println("O que você deseja fazer:\n==== 1.Cadastrar produto ==\n==== 2.Listar produto =====\n==== 3.Alterar produto ====\n==== 4.Excluir produto ====\n==== 5. Sair ==============");
                int opcao;
                //valida se é número
                try {
                    opcao = sc.nextInt();   
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Selecione um número válido (1 a 5)!");
                    sc.nextLine();
                    continue;
                }
                
                switch (opcao) {
                    case 1 : //cadastrar produto 
                        System.out.println("Qual produto você deseja cadastrar?");
                        sc.nextLine();
                        while (true) {
                            String produto = sc.nextLine().trim();
                            //.trim() remove espaços em branco da resposta  
                            if (produto.isEmpty()) {
                                System.out.println("Erro: O nome do produto não pode ser vazio. Tente novamente:");
                                continue;
                                //continue; Pula todo o código a seguir dele e retorna para o início do loop. Funciona para os laços de repetição (while, for e do-while).
                            }
                            carrinho.add(produto);
                            System.out.println(produto+" foi cadastrado!");
                            System.out.println("Deseja adicionar mais algum item?\n(S/N)");
                            String res = sc.nextLine().trim().toUpperCase();
                            if (res.equals("N")) {
                                break;
                            }else if (!res.equals("S")) {
                                System.out.println("Por favor, digite 'S' para continuar ou 'N' para encerrar.");
                                continue;
                            }
                        }
                        if (carrinho.isEmpty()) {
                            System.out.println("Nenhum produto foi cadastrado.");
                        }else {
                            System.out.println("Produtos cadastrados: "+carrinho);
                        }
                        break;
    
                    case 2: //listar produto 
                            if (carrinho.isEmpty()) {
                            System.out.println("Nenhum produto foi cadastrado.");
                        }else {
                            System.out.println("Produtos no carrinho:");
                            for (int i = 0; i < carrinho.size(); i++) {
                                System.out.println((i + 1) + ". " + carrinho.get(i));
                            }
                        }
                            break;
                    case 3: //alterar produto 
                    while (true) {
                        if (carrinho.isEmpty()) {
                            System.out.println("Nenhum produto foi cadastrado.");
                            break;
                        }else {
                            System.out.println("Qual produto você deseja alterar?");
                            //mostra o carrinho
                            for (int i = 0; i < carrinho.size(); i++) {
                                System.out.println((i + 1) + ". " + carrinho.get(i));
                            }
                            System.out.println("Digite o número do produto (0 para cancelar):");
                            int indice;
                            //verifica se o input é número
                            try {  
                                indice = sc.nextInt();
                                sc.nextLine();
                            } catch (java.util.InputMismatchException e ) {
                                System.out.println("Erro: Por favor, digite um número válido.");
                                sc.nextLine();
                                continue;
                            } 
                            if (indice == 0) {
                                System.out.println("Operação cancelada.");
                                break;
                            }
                            //verifica se o número selecionado está na lista 
                            if (indice < 1 || indice > carrinho.size()) {
                                System.out.println("Erro: Número inválido. Escolha um número entre 1 e " + carrinho.size() + ".");
                                    continue;
                            }
                            //cria e verifica se o novo produto é válido  
                            System.out.println("Digite o nome do novo produto:");
                            String novoProduto = sc.nextLine().trim();
                            if (novoProduto.isEmpty()) {
                                System.out.println("Erro: O nome do produto não pode ser vazio.");
                                continue;
                            }
                            //altera o produto
                            carrinho.set(indice - 1, novoProduto);
                            System.out.println("Produto alterado com sucesso! Novo carrinho: "+carrinho);
                            break; 
                        }
                    }
                    break;

                    case 4: //excluir produto 
                        while (true) {
                            if (carrinho.isEmpty()) {
                                System.out.println("Nenhum produto foi cadastrado.");
                                break;
                            }else{
                                System.out.println("Qual produto você deseja excluir?");
                            for (int i = 0; i < carrinho.size(); i++) {
                                System.out.println((i + 1) + ". " + carrinho.get(i));
                            }
                            System.out.println("Digite o número do produto (0 para cancelar):");
                            int indice;
                            //verifica se o input é número
                            try {  
                                indice = sc.nextInt();
                                sc.nextLine();
                            } catch (java.util.InputMismatchException e ) {
                                System.out.println("Erro: Por favor, digite um número válido.");
                                sc.nextLine();
                                continue;
                            } //cancela o loop
                            if (indice == 0) {
                                System.out.println("Operação cancelada.");
                                break;
                            }
                            //verifica se o número selecionado está na lista 
                            if (indice < 1 || indice > carrinho.size()) {
                                System.out.println("Erro: Número inválido. Escolha um número entre 1 e " + carrinho.size() + ".");
                                    continue;
                            }//esclui o produto 
                            String produtoRemovido = carrinho.remove(indice - 1);
                            System.out.println(produtoRemovido+" Foi removido com sucesso! Novo carrinho: "+carrinho);
                            break;
                            }
                        }  
                        break;

                    case 5: //sair do programa 
                        System.out.println("Saindo do programa, até logo!");
                        return;
    
                    default:
                    System.out.println("Selecione um número válido (1 a 5)!");
                        break;
                }
            }

            
        }
    }
}
