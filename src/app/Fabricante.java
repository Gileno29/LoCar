package app;

public class Fabricante {
	private String cnpj;
	private String nome;
	private String codFabricante;
	
	
	
	public Fabricante(String cnpj, String nome, String codFabricante) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.codFabricante = codFabricante;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
