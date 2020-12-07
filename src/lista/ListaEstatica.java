package lista;

import java.lang.reflect.Array;

//Generalizando o tipo de Lista
public class ListaEstatica<T> {

	// tipo de vetor
	private T[] elementos;
	int qtd;

	public ListaEstatica(int tamanho, Class<T> tipoClasse) {
			this.elementos = (T[]) Array.newInstance(tipoClasse, tamanho);
			this.qtd = 0;
	}
	
	public ListaEstatica(int tamanho) {
		this.elementos =  (T[]) new Object[tamanho]; //solução simples
		this.qtd = 0;
}
	

	// adcionando elemento no vetor
	public boolean addcionar(T elemento) {
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

	// excluir um elementos em qualquer posição
	public boolean removerPorPosicao(int posicao) {
		if (posicao > qtd && posicao < 0) {
			throw new IllegalArgumentException("Posição não existe");
		}
		for (int i = posicao; i < qtd; i++) {
			this.elementos[i - 1] = this.elementos[i];
		}
		this.qtd--;
		return true;
	}

	// excluir elemento por Tipo de object
	public boolean removerPorElemento(T tipo) {
		for (int i = 0; i < qtd; i++) {
			if (this.elementos[i].equals(tipo)) {
				this.elementos[i] = this.elementos[i + 1];
				removerPorPosicao(i + 1);
			}
		}
		return true;
	}

	public int tamanho() {
		return this.qtd;
	}
	
	public int busca(T tipo) {
		for(int i= 0; i < this.qtd ; i++) {
			if(this.elementos[i].equals(tipo)){
				return i;
			}
		}
		return -1;
	}
	
	public T busca(int posicao) {
		if(!(posicao  >=0 && posicao < this.qtd)) {
			throw new IllegalArgumentException("Posição inalda");
		}
		return this.elementos[posicao];
	}
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	public boolean contem(T tipo) {
		return busca(tipo) > -1;
	}

	// busca de um elemento pela posição
	public T buscarElementoPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < qtd)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		return this.elementos[posicao];
	}

	// busca de um elemento por parametro
	public String buscaUmElementoObject(T nome) {
		for (int i = 0; i < this.qtd; i++) {
			if (this.elementos[i].equals(nome)) {
				return (String) this.elementos[i];
			}
		}
		return "Elemento não existe";
	}

	// aumentando a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.qtd == this.elementos.length) {
			// tipo de vetor atribuido
			T[] novoElemento = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novoElemento[i] = this.elementos[i];
			}
			this.elementos = novoElemento;
		}
	}
	
	public void limpa() {
		
		//this.elementos = (T[]) new Object[this.elementos.length];	
		
		for(int i = 0; i < this.qtd ; i++) {
			this.elementos[i] = null;
		}
		this.qtd = 0;
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
