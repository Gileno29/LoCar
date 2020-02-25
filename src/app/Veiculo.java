package app;

import java.util.ArrayList;

public class Veiculo extends ListaVeiculos{
	private String placa;
	private String ano;
	private String cor;
	private String modelo;
	private int codVeiculo;
	private Fabricante fabricante;
	
	
	public Veiculo( int codVeiculo,String placa, String ano,String cor, String modelo) {
		this.placa= placa;
		this.ano=ano;
		this.cor=cor;
		this.modelo=modelo;
		this.codVeiculo=codVeiculo;
		//this.fabricante=fabricante;
		
	}
	
	@Override
	public String toString() {
		
		return "Placa do veicuo: "+getPlaca()+"\n"+" Ano do veiculo: "+getAno()+"\n"+" cor do veiculo: "+ getCor()+"\n"+" Modelo do veiculo: "+getModelo()+"\n"+" Codigo Veiculo: "+ getCodVeiculo();
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}

}
