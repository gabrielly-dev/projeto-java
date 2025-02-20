package auraSubversiva.repository;

import java.util.List;

import auraSubversiva.model.Acessorios;

public interface AcessoriosRepository {
	public void buscarPorID(Long id);
	public void listarTodos();
	public void cadastrar(Acessorios acessorios);
	public void atualizar(Acessorios acessorios);
	public void deletar(Long id);
	
	List<Acessorios> buscarPorTipo(int tipo);
	List<Acessorios> buscarPorMaterial(String material);
	List<Acessorios> buscarPorFaixaDePreco(double precoMin, double precoMax);
	
}
