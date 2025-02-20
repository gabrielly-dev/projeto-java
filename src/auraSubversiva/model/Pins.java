package auraSubversiva.model;

//dimensoes

public class Pins extends Acessorios{
	private int pins;

	public Pins(int tipo, Long id, String nome, double preco, String material, int pins) {
		super(tipo, id, nome, preco, material);
		this.pins = pins;
	}

	public int getPins() {
		return pins;
	}

	public void setPins(int pins) {
		this.pins = pins;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Dimensões: " + this.pins);
	}
}
