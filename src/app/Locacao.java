package app;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Locacao {
	private String dataLocacao;
	private String dataEntrega;
	private float multa;
	private Veiculo veiculo;
	private int codLocacao;
	private Cliente cliente;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Locacao(int codLocacao, Cliente cliente) {
		super();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.dataLocacao =sdf.format( new Date( System.currentTimeMillis() ) );
		//this.dataEntrega = dataEntrega;
		//this.multa = multa;
		this.cliente= cliente;
		//this.veiculo = veiculo;
		this.codLocacao = codLocacao;
		//validaLocacao(veiculo);
		
		
			
			
		
	}
	
	
	public String getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public int getCodLocacao() {
		return codLocacao;
	}
	public void setCodLocacao(int codLocacao) {
		this.codLocacao = codLocacao;
	}
	
	public void validaLocacao(Veiculo v) throws IOException {
		if((this.veiculo!=null)) {
			//System.out.println("Entrei ");
			if((v.equals(this.veiculo))) {
				throw new IOException("Erro Veiculo já está alocado, função não permitida");
			}else {
				this.veiculo= v;
			}
	}else {
		this.veiculo=v;
	}
		
	}
	
	
	
	public void teste(Veiculo v1, Veiculo v2) {
		System.out.println(v1.getCodVeiculo());
		System.out.println(v2.getCodVeiculo());
		
	}

	@Override
	public String toString() {
		return "Data da Locacao: "+"\n"+ getDataLocacao()+"\n"+"veiculo : "+"\n"+ getVeiculo()+"\n"+" codigo locacao: "+"\n"+getCodLocacao()+"\n"+ "Multa Atual: "+"\n"+getMulta()+"\n"+"Data entrega"+"\n"+getDataEntrega()+"\n"+ "Cliente: "+"\n"+getCliente()+"\n";
	}
	
	public void validar() {
		
	}

}
