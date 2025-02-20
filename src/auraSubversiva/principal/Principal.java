package auraSubversiva.principal;

import java.util.Scanner;

import auraSubversiva.controller.AcessoriosController;


public class Principal {
	public static void Menu() {
		AcessoriosController acessorios = new AcessoriosController();
		
		Scanner leitura = new Scanner (System.in);
		
		int opcao;
		Long id;
		
		
		
		while (true) {
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*                MODA AURA SUBVERSIVA                *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*               1 - Cadastrar Produto                *");
			System.out.println("*               2 - Listar Produtos                  *");
			System.out.println("*               3 - Atualizar um Produto             *");
			System.out.println("*               4 - Deletar um Produto               *");
			System.out.println("*               5 - Realizar uma Busca               *");
			System.out.println("*               6 - Verificar Disponibilidade        *");
			System.out.println("*               7 - Sair                             *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      ");
			
			opcao = leitura.nextInt();
			
			
			if (opcao == 9) {
				System.out.println("\nLoja Aura Subversiva - Libere o seu estranho interior!");
				sobre();
				leitura.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");
				/*
				 * public Aneis(int tipo, Long id, String nome, double preco, String material, int tamanho) {
		super(tipo, id, nome, preco, material);
		this.tamanho = tamanho;
	}
				 */
				System.out.println("");
				
				break;
			case 2:
				System.out.println("Listar Produtos\n\n");
				acessorios.listarTodos();

				break;
			case 3: 
				System.out.println("Cadastrar Usuário\n\n");
				
				
				break;
			case 4:
				System.out.println("Listar Usuários\n\n");
				
				break;
			case 5:
				System.out.println("Cadastrar Evento\n\n");
				
				break;
			case 6:
				System.out.println("Cadastrar Evento\n\n");
				
				break;
			case 7:
				System.out.println("Listar Eventos\n\n");
				
				break;
			case 8:
				System.out.println("Listar Parcerias\n\n");
				
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				break;
			}
			
		}
		
		
		
	}
	
	private static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Gabrielly Barbosa Silva");
		System.out.println("Caso queira entrar em contato, segue abaixo os meios:");
		System.out.println("E-mail: gabriellybarbosa.dev@gmail.com");
		System.out.println("GitHub: github.com/gabrielly-dev");
		System.out.println("*********************************************************");
	}
}
