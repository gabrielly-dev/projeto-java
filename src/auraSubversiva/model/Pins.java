package auraSubversiva.model;

//dimensoes

public class Pins extends Acessorios{
	private String pins;

	public Pins(int tipo, Long id, String nome, double preco, String material, String dimensao) {
		super(tipo, id, nome, preco, material);
		this.pins = dimensao;
	}

	public String getPins() {
		return pins;
	}

	public void setPins(String pins) {
		this.pins = pins;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Dimensões: " + this.pins);
	}
}
