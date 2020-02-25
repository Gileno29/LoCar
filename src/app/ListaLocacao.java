package app;

public class ListaLocacao {
	private Celula first;
	private int tamanho=0;
	 
	public ListaLocacao() {
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
	
	public void locar(Object ob) {
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
	

}
