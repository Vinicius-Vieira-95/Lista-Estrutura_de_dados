package lista;

public class ListaEncadeada<T>{

	private NoEncadeado inicio;
	private NoEncadeado fim;

	private int quantidade;

	public ListaEncadeada() {
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

	//retorna o tamanho do No
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	//cria a primeiro lista
	public void inserir(Object object) {
		if(this.inicio == null) {
			inicio = new NoEncadeado();
			fim = inicio;	
			NoEncadeado novoNo = new NoEncadeado();
			novoNo.setElemento(object);
			novoNo.setProx(null);
			fim.setProx(novoNo);
			inicio = fim = novoNo;
			
		}
		else {
			inserirNoFim(object);
		}
		quantidade++;
	}
	
	public boolean inserirNoInicio(Object elemento) {
		if(this.inicio == null) {
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
		NoEncadeado novoNo = new NoEncadeado();
		novoNo.setElemento(elemento);
		novoNo.setProx(null);
		fim.setProx(novoNo);
		fim = novoNo;
	}
	
	//passe um referencia de localização
	public boolean inserirNoMeio(Object elemento) {
		if(this.inicio == null) {
			inserir(elemento);
			return true;
		}
		else {
			
			
		}
		return false;
	}
	
	public Object buscar(Object elemento) {
		
		NoEncadeado novo = new NoEncadeado();
		
		return null;
	}
	
	public void removerElementosRepetidos(ListaEncadeada lista) {
		
	}

	public boolean listarElementos() {
		if(this.inicio == null) {
			System.out.println("[]");
			return false;
		}
		NoEncadeado aux = this.inicio;
		
		while(aux != null) {
			System.out.println(aux.getElemento());
			aux = aux.getProx();
		}
		return true;
	}

}
