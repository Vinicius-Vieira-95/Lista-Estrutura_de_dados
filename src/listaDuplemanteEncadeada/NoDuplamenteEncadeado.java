package listaDuplemanteEncadeada;

public class NoDuplamenteEncadeado {

	private NoDuplamenteEncadeado prox; // apontara para o proximo endere�o de memoria
	private NoDuplamenteEncadeado ant; //apontar� para o eneder�o anterio no endere�o de meroria
	private int elemento; //tipo de Objeto
	
	public NoDuplamenteEncadeado(){
	}
	
	public NoDuplamenteEncadeado getProx() {
		return prox;
	}
	public void setProx(NoDuplamenteEncadeado prox) {
		this.prox = prox;
	}
	
	public NoDuplamenteEncadeado getAnt() {
		return ant;
	}

	public void setAnt(NoDuplamenteEncadeado ant) {
		this.ant = ant;
	}

	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
}
