package client;

import java.io.IOException;
import java.util.ArrayList;

import app.Cliente;
import app.ListaLocacao;
import app.ListaVeiculos;
import app.Locacao;
import app.Veiculo;

public class Principal {
	public static void main(String [] args) {
		
		Veiculo v1= new Veiculo(2,"www306","2018","amarelo","ford");//veiculo 01
	
		Veiculo v2= new Veiculo(3,"YHS23","2018","amarelo","ford");// veiculo 02
		
		Cliente cliente01 = new Cliente("100.33.22-0","amanda","9923344",1);//cliente que vai alugar o veiculo
		
		ListaVeiculos vl= new ListaVeiculos();//lista de veiculos
		
		vl.inserir(v1);//insere na lista de veiculos
		vl.inserir(v2);//insere na lista de veiculos
		
		vl.buscar(v2);
		
		ListaLocacao l= new ListaLocacao();
		Locacao lo = new Locacao(1,cliente01);// primeira Locacao
		
		
		
		try {
			lo.validaLocacao(v1);
			l.locar(lo);
			lo.validaLocacao(v2);
			l.locar(lo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
}
}
