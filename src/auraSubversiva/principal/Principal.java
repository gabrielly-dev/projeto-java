package auraSubversiva.principal;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * int opcao, numero, agencia, tipo, aniversario
 * string titular
 * float saldo, limite
 */

import auraSubversiva.controller.AcessoriosController;
import auraSubversiva.model.Aneis;
import auraSubversiva.model.Brincos;
import auraSubversiva.model.Colares;
import auraSubversiva.model.Pins;


public class Principal {
	public static void Menu() {
		AcessoriosController acessorios = new AcessoriosController();
		
		Scanner leitura = new Scanner (System.in);
		
		int opcao, tipo, tamanho, circunferencia, tipoBusca, dimensaoLargura, dimensaoAltura, dimensaoGrossura;
		double preco;
		String nome, material, dimensao, testeExemplo1, testeExemplo2, testeExemplo3, testeExemplo4, testeExemplo5, testeExemplo6;
		Long id;
		
		testeExemplo1 = 45 + " x " + 21 + " x " + 2;
		testeExemplo2 = 43 + " x " + 13 + " x " + 3;
		testeExemplo3 = 54 + " x " + 34 + " x " + 4;
		testeExemplo4 = 65 + " x " + 22 + " x " + 5;
		testeExemplo5 = 26 + " x " + 26 + " x " + 2;
		testeExemplo6 = 56 + " x " + 21 + " x " + 5;

		acessorios.cadastrar(new Aneis(1, acessorios.gerarID(), "Anel de Caveira", 59.90, "Prata", 18));
		acessorios.cadastrar(new Aneis(1, acessorios.gerarID(), "Anel Gótico", 89.90, "Titânio", 20));
		acessorios.cadastrar(new Aneis(1, acessorios.gerarID(), "Anel de Dragão", 99.90, "Aço Damasco", 22));

		acessorios.cadastrar(new Brincos(2, acessorios.gerarID(), "Brinco de Lua", 39.90, "Aço Inox", testeExemplo1));
		acessorios.cadastrar(new Brincos(2, acessorios.gerarID(), "Brinco de Gota", 49.90, "Prata", testeExemplo2));
		acessorios.cadastrar(new Brincos(2, acessorios.gerarID(), "Brinco de Estrela", 29.90, "Prata 925", testeExemplo3));

		acessorios.cadastrar(new Colares(3, acessorios.gerarID(), "Colar de Pentagrama", 79.90, "Prata", 45));
		acessorios.cadastrar(new Colares(3, acessorios.gerarID(), "Colar Choker", 69.90, "Couro", 40));
		acessorios.cadastrar(new Colares(3, acessorios.gerarID(), "Colar de Corvo", 89.90, "Ouro Negro", 50));

		acessorios.cadastrar(new Pins(4, acessorios.gerarID(), "Pin de Morcego", 19.90, "Metal", testeExemplo4));
		acessorios.cadastrar(new Pins(4, acessorios.gerarID(), "Pin de Abóbora", 15.90, "Acrílico", testeExemplo5));
		acessorios.cadastrar(new Pins(4, acessorios.gerarID(), "Pin de Gato Preto", 12.90, "Resina", testeExemplo6));
		
		while (true) {
			System.out.println("**********************************************************");
			System.out.println("*                                                        *");
			System.out.println("*                  MODA AURA SUBVERSIVA                  *");
			System.out.println("*                                                        *");
			System.out.println("**********************************************************");
			System.out.println("*                                                        *");
			System.out.println("*   1 - Cadastrar Produto                                *");
			System.out.println("*   2 - Listar Produtos                                  *");
			System.out.println("*   3 - Atualizar um Produto                             *");
			System.out.println("*   4 - Deletar um Produto                               *");
			System.out.println("*   5 - Realizar uma Busca                               *");
			System.out.println("*   6 - Verificar Disponibilidade (Em desenvolvimento)   *");
			System.out.println("*   7 - Sair                                             *");
			System.out.println("*                                                        *");
			System.out.println("**********************************************************");
			System.out.println("Entre com a opção desejada:                               ");
			System.out.println("                                                          ");
			
			try {
				opcao = leitura.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leitura.nextLine();
				opcao = 0;
			}
			
			
			if (opcao == 7) {
				System.out.println("\nLoja Aura Subversiva - Libere o seu estranho interior!");
				sobre();
				leitura.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1 -> {
					System.out.println("Cadastrar Produto\n\n");
	
					tipo = 0;
					
					
					do {
						System.out.println("Tipo de Acessório:   ");
						System.out.println("     1. Anéis        ");
						System.out.println("     2. Brincos      ");
						System.out.println("     3. Colares      ");
						System.out.println("     4. Pins         ");
						tipo = leitura.nextInt();
					} while(tipo < 1 && tipo > 4);
					
					System.out.println("Digite o nome do produto: ");
					leitura.skip("\\R?");
					nome = leitura.nextLine();
					
					System.out.println("Digite o preço do produto (R$): ");
					preco = leitura.nextDouble();
					
					leitura.nextLine();
					System.out.println("Digite qual o material: ");
					material = leitura.nextLine();
					
					switch(tipo) {
						case 1 -> {
							System.out.println("Digite o tamanho do anel: ");
							tamanho = leitura.nextInt();
							acessorios.cadastrar(new Aneis(tipo, acessorios.gerarID(), nome, preco, material, tamanho));
						}
						case 2 -> {
							System.out.println("Digite a largura do brinco em mm (milímetro): ");
							dimensaoLargura = leitura.nextInt();
							
							System.out.println("Digite a altura do brinco em mm (milímetro): ");
							dimensaoAltura = leitura.nextInt();
							
							System.out.println("Por fim, digite a grossura do brinco em mm (milímetro): ");
							dimensaoGrossura = leitura.nextInt();
							
							dimensao = dimensaoLargura + " x " + dimensaoAltura + " x " + dimensaoGrossura;
							
							acessorios.cadastrar(new Brincos(tipo, acessorios.gerarID(), nome, preco, material, dimensao));
						}
						case 3 -> {
							System.out.println("Digite a circunferência do colar: ");
							circunferencia = leitura.nextInt();
							acessorios.cadastrar(new Colares(tipo, acessorios.gerarID(), nome, preco, material, circunferencia));
						}
						case 4 -> {
							System.out.println("Digite a largura do pin em mm (milímetro): ");
							dimensaoLargura = leitura.nextInt();
							
							System.out.println("Agora digite a altura do pin em mm (milímetro): ");
							dimensaoAltura = leitura.nextInt();
							
							System.out.println("Por fim, digite a grossura do pin em mm (milímetro): ");
							dimensaoGrossura = leitura.nextInt();
							
							dimensao = dimensaoLargura + " x " + dimensaoAltura + " x " + dimensaoGrossura;
							
							acessorios.cadastrar(new Pins(tipo, acessorios.gerarID(), nome, preco, material, dimensao));
						}
						default -> {
							System.out.println("\nTipo de categoria inválido!");
						}
					}
				}
				case 2 -> {
					System.out.println("Verificar os acessórios no estoque: ");
					acessorios.listarTodos();
				}
				case 3 -> {
					tipo = 0;
					
					System.out.println("\n\nAtualizar dados de um acessório: ");
					
					System.out.println("\nDigite o id do acessório, para a busca: ");
					id = leitura.nextLong();
					
					var buscarPorID = acessorios.buscarNaCollection(id);					
					
					if(buscarPorID != null) {
						tipo = buscarPorID.getTipo();
						
						System.out.println("Digite o nome do produto: ");
						leitura.skip("\\R?");
						nome = leitura.nextLine();
						
						System.out.println("Digite o preço do produto (R$): ");
						preco = leitura.nextDouble();
						
						leitura.nextLine();
						System.out.println("Digite qual o material: ");
						material = leitura.nextLine();
						
						switch(tipo) {
							case 1 -> {
								System.out.println("Digite o tamanho do anel: ");
								tamanho = leitura.nextInt();
								acessorios.atualizar(new Aneis(tipo, id, nome, preco, material, tamanho));
							}
							case 2 -> {
								System.out.println("Digite a largura do brinco em mm (milímetro): ");
								dimensaoLargura = leitura.nextInt();
								
								System.out.println("Agora digite a altura do brinco em mm (milímetro): ");
								dimensaoAltura = leitura.nextInt();
								
								System.out.println("Por fim, digite a grossura do brinco em mm (milímetro): ");
								dimensaoGrossura = leitura.nextInt();
								
								dimensao = dimensaoLargura + " x " + dimensaoAltura + " x " + dimensaoGrossura;
								
								acessorios.atualizar(new Brincos(tipo, id, nome, preco, material, dimensao));
							}
							case 3 -> {
								System.out.println("Digite a circunferência do colar: ");
								circunferencia = leitura.nextInt();
								acessorios.atualizar(new Colares(tipo, id, nome, preco, material, circunferencia));
							}
							case 4 -> {
								System.out.println("Digite a largura do pin em mm (milímetro): ");
								dimensaoLargura = leitura.nextInt();
								
								System.out.println("Agora digite a altura do pin em mm (milímetro): ");
								dimensaoAltura = leitura.nextInt();
								
								System.out.println("Por fim, digite a grossura do pin em mm (milímetro): ");
								dimensaoGrossura = leitura.nextInt();
								
								dimensao = dimensaoLargura + " x " + dimensaoAltura + " x " + dimensaoGrossura;;
								
								acessorios.atualizar(new Pins(tipo, id, nome, preco, material, dimensao));
							}
							default -> {
								System.out.println("Tipo de categoria inválido!");
							}
						}
					} else {
						System.out.println("Acessório não encontrado no estoque!");
					}
				}
				case 4 -> {
					//para apresentar toda a lista antes de deletar
					System.out.println("\n\nDeletar acessório do estoque!");
					
					System.out.println("\nDigite o ID do acessório: ");
					id = leitura.nextLong();
					
					System.out.println("\nQual da lista abaixo deseja deletar?\n");
					acessorios.listarTodos();
					
					acessorios.deletar(id);
				}
				case 5 -> {
					/*
					 * buscarPorTipo(int tipo);
	List<Acessorios> buscarPorMaterial(String material);
	List<Acessorios> buscarPorFaixaDePreco
					 */
					System.out.println("\n\nDigite a sua busca dentre as opções: ");
					System.out.println("     1. Buscar um produto pelo ID    ");
					System.out.println("     2. Buscar por tipo de acessório (em construção)");
					System.out.println("     3. Buscar por tipo de material (em construção)");
					System.out.println("     4. Buscar por faixa de preço (em construção)");
					tipoBusca = leitura.nextInt();
					
					switch(tipoBusca) {
						case 1 -> {
							System.out.println("\nBuscar por um produto pelo ID: ");
							
							System.out.println("Digite o ID do produto: ");
							id = leitura.nextLong();

							var buscarPorAcessorio = acessorios.buscarNaCollection(id);
							
							if (buscarPorAcessorio != null) {
								buscarPorAcessorio.descricao();
							} else {
								System.out.println("\nAcessório não encontrado!");
							}
							
						}
					} 
					
				}
				case 6 -> {
					
				}
				case 7 -> {
					
				}

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
