package auraSubversiva.model;

//tamanho

public class Aneis extends Acessorios{
	
	private int tamanho;
	
	public Aneis(int tipo, Long id, String nome, double preco, String material, int tamanho) {
		super(tipo, id, nome, preco, material);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Tamanho: " + this.tamanho + "\n\n");
	}

}
