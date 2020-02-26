package app;

public class Cliente {
	private String cpf;
	private String nome;
	private String telefone;
	private int codCliente;
	
	
	
	
	public Cliente(String cpf, String nome, String telefone, int codCliente) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.codCliente = codCliente;
	}





	@Override
	public String toString() {
		return "cpf: "+"\n"+ getCpf()+"\n"+"nome: "+"\n"+getNome()+"\n"+"telefone: "+"\n"+getTelefone()+"\n"+ "codigo do cliente: "+"\n"+ getCodCliente();
	}
	
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	

}
