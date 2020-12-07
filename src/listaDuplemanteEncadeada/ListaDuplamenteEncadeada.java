package listaDuplemanteEncadeada;

import lista.NoEncadeado;

public class ListaDuplamenteEncadeada {

	private NoDuplamenteEncadeado inicio;
	private NoDuplamenteEncadeado fim;

	private int quantidade;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = inicio;
		this.quantidade = 0;
	}

	public NoDuplamenteEncadeado getInicio() {
		return inicio;
	}

	public void setInicio(NoDuplamenteEncadeado inicio) {
		this.inicio = inicio;
	}

	public NoDuplamenteEncadeado getFim() {
		return fim;
	}

	public void setFim(NoDuplamenteEncadeado fim) {

		this.fim = fim;
	}

	// retorna o tamanho do No

	public int getQuantidade() {
		return this.quantidade;
	}

	// metodo para criar uma lista
	public void criarLista(int elemento) {
		if (this.inicio == null) {
			inicio = new NoDuplamenteEncadeado();
			fim = inicio;
			NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado();
			novoNo.setElemento(elemento);
			novoNo.setProx(null);
			novoNo.setAnt(null);
			fim.setProx(novoNo);
			inicio = fim = novoNo;
			quantidade++;

		} else {
			// caso a lista ja exista será chamado o metodo
			inserirNoFim(elemento);
		}
	}

	public boolean inserirNoInicio(int elemento) {
		if (this.inicio == null) {
			criarLista(elemento);
			return true;
		}
		NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado();
		novoNo.setElemento(elemento);
		novoNo.setProx(inicio);
		novoNo.setAnt(null);
		inicio = novoNo;
		quantidade++;
		return true;
	}

	// metodo para inserir um elemento no final da lista
	public boolean inserirNoFim(int elemento) {
		if (quantidade != 0) {
			NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado();
			novoNo.setElemento(elemento);
			novoNo.setProx(null);
			novoNo.setAnt(fim);
			fim.setProx(novoNo);
			fim = novoNo;
			quantidade++;
			return true;
		} else {
			criarLista(elemento);
		}
		return false;
	}

	public boolean removerElemento(int elemento) {
		
		NoDuplamenteEncadeado aux = new NoDuplamenteEncadeado();
		aux = inicio;
		for(int i = quantidade; i > 0; i--) {
			if(elemento == aux.getElemento()){
				//caso so tenha um elemento na lista
				if(aux.getAnt() == null && aux.getProx() == null) {
					inicio = fim = null;
					return true;
				}
				//caso o elemento seja o primeiro da lista
				else if(aux.getAnt() == null && aux.getProx() != null) {
					inicio = null;
					inicio = aux.getProx();
					return true;
				}
				//caso o elemento seja o ultimo da lista
				else if(aux.getAnt() != null &&  aux.getProx() == null) {
					fim = null;
					fim = aux.getAnt();
					return true;
				}
				//caso o elemento esteja no meio da lista
				else if(aux.getAnt() != null && aux.getProx() != null) {
					return true;
					
				}
				
			}
			aux = inicio.getProx();
		}
		return false;
	}

	// passe um referencia de localização
	public boolean inserirNoMeio(int elemento) {
		if (this.inicio == null) {
			criarLista(elemento);
			return true;
		} else {

		}
		return false;
	}

	public boolean listarElementos() {
		if (this.inicio == null) {
			System.out.println("[]");
			return false;
		}
		NoDuplamenteEncadeado aux = this.inicio;

		while (aux != null) {
			System.out.println(aux.getElemento());
			aux = aux.getProx();
		}
		return true;
	}

}
