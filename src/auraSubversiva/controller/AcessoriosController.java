package auraSubversiva.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import auraSubversiva.model.Acessorios;
import auraSubversiva.repository.AcessoriosRepository;

public class AcessoriosController implements AcessoriosRepository {
	private ArrayList<Acessorios> armazenamentoDeAcessorios = new ArrayList<Acessorios>();
	int id = 0;
	
	
	@Override
	public void buscarPorID(Long id) {
		var acessorio = buscarNaCollection(id);
		
		if (acessorio != null) {
			acessorio.descricao();
		} else {
			System.out.println("\nO acessório de ID: " + id + " não foi encontrado!");
		}

	}

	@Override
	public void listarTodos() {
		
	}

	@Override
	public void cadastrar(Acessorios acessorios) {
		armazenamentoDeAcessorios.add(acessorios);
		System.out.println("\nO acessório de ID: " + acessorios.getId() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Acessorios acessorios) {
		var buscaAcessorio = buscarNaCollection(acessorios.getId());
		
		if (buscaAcessorio != null) {
			armazenamentoDeAcessorios.set(armazenamentoDeAcessorios.indexOf(buscaAcessorio), acessorios);
			System.out.println("\nO acessório de ID: " + acessorios.getId() + " foi atualizada com sucesso!");
		} else {
			System.out.println("\nO acessório de ID: " + acessorios.getId() + " não foi encontrada!");
		}
	}

	@Override
	public void deletar(Long id) {
		var acessorio = buscarNaCollection(id);
		
		if(acessorio != null) {
			if(armazenamentoDeAcessorios.remove(acessorio) == true) {
				System.out.println("\nO acessório de ID: " + id + " foi removido do estoque!");
			} else {
				System.out.println("\nNão foi possível remover o acessório de ID: " + id);
			}
		} else {
			System.out.println("O acessório de ID: " + id + " não foi encontrado!");
		}
	}

	@Override
	public List<Acessorios> buscarPorTipo(int tipo) {
		return null;
	}

	@Override
	public List<Acessorios> buscarPorMaterial(String material) {
		return null;
	}

	@Override
	public List<Acessorios> buscarPorFaixaDePreco(double precoMin, double precoMax) {
		return null;
	}
	
	public Long gerarID() {
		Random idAleatorio = new Random();
		Long id = idAleatorio.nextLong(9000000000000L);
		return id;
	}
	
	public Acessorios buscarNaCollection(Long id) {
		for (var acessorio : armazenamentoDeAcessorios) {
			if (acessorio.getId() == id) {
				return acessorio;
			}
		}
		
		return null;
	}
	
}
