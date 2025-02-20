package auraSubversiva.model;
//dimensoes

public class Brincos extends Acessorios{
	private int dimensoes;

	public Brincos(int tipo, Long id, String nome, double preco, String material, int dimensoes) {
		super(tipo, id, nome, preco, material);
		this.dimensoes = dimensoes;
	}

	public int getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(int dimensoes) {
		this.dimensoes = dimensoes;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Dimensões: " + this.dimensoes);
	}
}
