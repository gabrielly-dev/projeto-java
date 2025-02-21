package auraSubversiva.model;
//dimensoes

public class Brincos extends Acessorios{
	private String dimensoes;

	public Brincos(int tipo, Long id, String nome, double preco, String material, String dimensao) {
		super(tipo, id, nome, preco, material);
		this.dimensoes = dimensao;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Dimensões: " + this.dimensoes + "\n");
	}
}
