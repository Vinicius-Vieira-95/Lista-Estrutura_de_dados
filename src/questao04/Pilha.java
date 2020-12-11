package questao04;


public class Pilha<T> extends estruturaDeBaseEstatica.EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	
	public Pilha(int tamanho) {
		super(tamanho);
	}
	
	//enpilhando o elemento
	public void empilhar(T elemento) {
		//reaproveitamdo metodo da classe mãe.
		super.adcionar(elemento);
	}
	
	//pegando o ultimo elemento que está no topo.
	public T topo() {
		if(this.estarVazia()) {
			return null;
		}
		return this.elementos[qtd - 1];
	}
	//removendo o ultimo elemento que está no topo.
	public T desempilha() {
		if(this.estarVazia()) {
			return null;
		}
		T elemento = this.elementos[qtd -1];
		qtd--;
		return elemento;
	}
	
}
