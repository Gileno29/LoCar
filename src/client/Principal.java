package client;

import java.util.ArrayList;

import app.ListaVeiculos;
import app.Veiculo;

public class Principal {
	public static void main(String [] args) {
		
		Veiculo v= new Veiculo(2,"twt-pau-no-cu3","2018","amarelo","ford");
	
		Veiculo b= new Veiculo(3,"twt-pau-no-cu2","2018","amarelo","ford");
		
		
		ListaVeiculos vl= new ListaVeiculos();
		
		vl.inserir(v);
		vl.inserir(b);
		
		//vl.listar();
		vl.buscar(b);
		
		vl.tamanho();

}
}
