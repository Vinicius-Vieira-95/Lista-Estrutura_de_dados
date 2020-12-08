package lista;

public class NoEncadeado {

	private NoEncadeado prox; // apontara para endereço de memoria
	private Object elemento; //tipo de Objeto
	
	public NoEncadeado(){
	}
	
	public NoEncadeado getProx() {
		return prox;
	}
	public void setProx(NoEncadeado prox) {
		this.prox = prox;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
}
