package lista;

public class NoEncadeado {

	private NoEncadeado prox; // apontara para endereço de memoria
	private int elemento; //tipo de Objeto
	
	public NoEncadeado(){
	}
	
	public NoEncadeado getProx() {
		return prox;
	}
	public void setProx(NoEncadeado prox) {
		this.prox = prox;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
}
