package auraSubversiva.model;
//circunferencia

public class Colares extends Acessorios{
	private int circunferencia;

	public Colares(int tipo, Long id, String nome, double preco, String material, int circunferencia) {
		super(tipo, id, nome, preco, material);
		this.circunferencia = circunferencia;
	}

	public int getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Circunferência: " + this.circunferencia);
	}
	
}
