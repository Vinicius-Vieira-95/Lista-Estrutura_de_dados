package estruturaDeBaseEstatica;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int qtd;

	public EstruturaEstatica(int tamanho) {
		this.elementos = (T[]) new Object[tamanho];
		this.qtd = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	// adcionando elemento no vetor
	public boolean adcionar(T elemento) {
		this.aumentaCapacidade();
		if (this.qtd < this.elementos.length) {
			this.elementos[qtd] = elemento;
			qtd++;
			return true;
		}
		return false;
	}

	// adcionando valor em qualquer posição
	public boolean adciona(T s, int posicao) {
		if (!(posicao >= 0 && posicao < qtd)) {
			throw new IllegalArgumentException("Posição invalida, valor acima da quantidade");
		}
		this.aumentaCapacidade();
		for (int i = qtd - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = s;
		this.qtd++;
		return true;
	}

	// aumentando a capacidade do vetor
	protected void aumentaCapacidade() {
		if (this.qtd == this.elementos.length) {
			// tipo de vetor atribuido
			T[] novoElemento = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novoElemento[i] = this.elementos[i];
			}
			this.elementos = novoElemento;
		}
	}

	public int tamanho() {
		return this.qtd;
	}
	
	//retorna se a lista ou pilha esta vazia
	public boolean estarVazia() {
		//true se estiver vazio ou false se estiver com elemento.
		return this.qtd == 0;
	}
	
	public void remover(int posicao) {
		if(posicao > this.qtd && posicao < 0 ) {
			throw new IllegalArgumentException("Error! posição invalida");
		}
		for(int i = posicao; i < qtd - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.qtd--;
	}

	// imprimir o vetor até o ultimo indice.
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.qtd - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.qtd > 0) {
			s.append(this.elementos[this.qtd - 1]);
		}
		s.append("]");
		return s.toString();
	}

}
