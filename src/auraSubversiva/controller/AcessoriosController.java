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
		for (var acessorio : armazenamentoDeAcessorios) {
			acessorio.descricao();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Acessorios> buscarPorTipo(int tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acessorios> buscarPorMaterial(String material) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acessorios> buscarPorFaixaDePreco(double precoMin, double precoMax) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Long gerarID() {
		Random idAleatorio = new Random();
		Long id = idAleatorio.nextLong(9000000000000L);
		return id;
	}
	
}
