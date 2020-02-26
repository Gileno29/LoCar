package app;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaVeiculos{
	private Celula first;
	private int tamanho=0;
	 
	public ListaVeiculos() {
	    	this.first=null;
	  }
	
	public boolean isEmpty() {
		if(tamanho==0)
			return true;
		return false;	
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	
	public void inserir(Object ob) {
		Celula novaCelula= new Celula(ob);
		novaCelula.setProxima(null);
		
		if(this.first==null) {
			this.first=novaCelula;
			tamanho++;
		}else {
			Celula aux= first;
			while(aux.getProxima()!=null) {
				aux= aux.getProxima();
			}
				aux.setProxima(novaCelula);
		}
		tamanho++;
	}
	
	public Object buscar(Object obj){
	    Celula aux = first;
	    while(aux != null){
	        if(aux.getElemento().equals(obj)){
	           System.out.print(aux.getElemento());
	           break;
	        }else{
	       
	        aux = aux.getProxima();
	        }
	   
	    }
	    return null;
	}
	
	public void listar() {
    	Celula aux= first;
    	while(aux!=null) {
    		System.out.println(aux.getElemento());
    		aux=aux.getProxima();
    	}
    }
	
	public void RemoveDado(Object ob){
		  Celula atual;
		  Celula antes;
		  if (this.isEmpty()){
		      System.out.println("lista vazia: "+isEmpty());
		  }else{   //Caso a lista nao esteja vazia
		      atual = first;
		      antes = null;
		      while (atual != null){
		    	  if (atual.getElemento().equals(ob)) {
		    		  if (atual == first) {
		    			  if(first.getProxima() != null){
		    				  first = first.getProxima();
		    				  tamanho --;
		    				  break;
		    				  }else{
		    					  first = null;
		    					  tamanho --;
		    					  break;
		    				  }
		    		  }else{
		    			  antes.setProxima(atual.getProxima());
		    			  tamanho --;
		    			  break;
		    			  }
		    	 }else{
		    		 antes = atual;
		    		 atual = atual.getProxima();
		}
		      }
		  }
		}
	
	
}
