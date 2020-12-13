package EstruturaDeBaseDinamica;

public abstract class EstruturaDinamica<T> {

	private NoEncadeado inicio;
	private NoEncadeado fim;

	protected int quantidade;

	public EstruturaDinamica() {
		this.inicio = null;
		this.fim = inicio;
		this.quantidade = 0;
	}

	public NoEncadeado getInicio() {
		return inicio;
	}

	public void setInicio(NoEncadeado inicio) {
		this.inicio = inicio;
	}

	public NoEncadeado getFim() {
		return fim;
	}

	public void setFim(NoEncadeado fim) {

		this.fim = fim;
	}

	// retorna o tamanho do No
	public int getQuantidade() {
		return this.quantidade;
	}

	// cria o primeiro elemento caso não exista
	public void inserir(Object object) {
		if (this.inicio == null) {
			inicio = new NoEncadeado();
			fim = inicio;
			NoEncadeado novoNo = new NoEncadeado();
			novoNo.setElemento(object);
			novoNo.setProx(null);
			fim.setProx(novoNo);
			inicio = fim = novoNo;
			quantidade++;

		} else {
			inserirNoFim(object);
		}
	}

	public boolean inserirNoInicio(Object elemento) {
		if (this.inicio == null) {
			inserir(elemento);
			return true;
		}
		NoEncadeado novoNo = new NoEncadeado();
		novoNo.setElemento(elemento);
		novoNo.setProx(inicio);
		inicio = novoNo;
		quantidade++;
		return true;
	}

	public void inserirNoFim(Object elemento) {
		if (this.inicio == null) {
			inserir(elemento);
		} else {
			NoEncadeado novoNo = new NoEncadeado();
			novoNo.setElemento(elemento);
			novoNo.setProx(null);
			fim.setProx(novoNo);
			fim = novoNo;
			quantidade++;
		}
	}
	
	//retorna se a lista ou pilha esta vazia
		public boolean estarVazia() {
			//true se estiver vazio ou false se estiver com elemento.
			return this.quantidade == 0;
		}

	// passe um referencia de localização
	/*
	 * public boolean inserirNoMeio(Object elemento) { if(this.inicio == null) {
	 * inserir(elemento); return true; } else {
	 * 
	 * 
	 * }; return false; }
	 * 
	 */

	public boolean listarElementos() {
		if (this.inicio == null) {
			System.out.println("[]");
			return false;
		}
		NoEncadeado aux = this.inicio;

		while (aux != null) {
			System.out.println(aux.getElemento());
			aux = aux.getProx();
		}
		return true;
	}

}
