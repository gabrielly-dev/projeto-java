package auraSubversiva.principal;

import java.util.Scanner;


public class Principal {
	public static void Menu() {
		Scanner leitura = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*                MODA AURA SUBVERSIVA                *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*               1 - Cadastrar Produto                *");
			System.out.println("*               2 - Listar Produtos                  *");
			System.out.println("*               3 - Cadastrar Usuário                *");
			System.out.println("*               4 - Listar Usuários                  *");
			System.out.println("*               5 - Cadastrar Evento                 *");
			System.out.println("*               6 - Listar Eventos                   *");
			System.out.println("*               7 - Cadastrar Parcerias              *");
			System.out.println("*               8 - Listar Parcerias                 *");
			System.out.println("*               9 - Sair                             *");
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
				
				break;
			case 2:
				System.out.println("Listar Produtos\n\n");
				
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
