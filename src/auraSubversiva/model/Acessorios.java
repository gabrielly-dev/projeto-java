package auraSubversiva.model;

public abstract class Acessorios{
	private int tipo;
	private Long id;
	private String nome;
	private double preco;
	private String material;
	
	public Acessorios(int tipo, Long id, String nome, double preco, String material) {
		this.tipo = tipo;
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.material = material;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void descricao() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Anéis";
			break;
		case 2: 
			tipo = "Brincos";
			break;
		case 3:
			tipo = "Colares";
			break;
		case 4:
			tipo = "Pins";
			break;
		}
		
		System.out.println("\n\n*********************************************************************");
		System.out.println("                         Dados do Acessório:                         ");
		System.out.println("*********************************************************************");
		System.out.println("Tipo do Acessório: " + tipo);
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Material: " + this.material);
		
	}


}