package lista;

public class ListaEncadeada{

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
	
  
	public void inserir(int elemento) {
		if(this.inicio == null) {
			inicio = new NoEncadeado();
			fim = inicio;	
			NoEncadeado novoNo = new NoEncadeado();
			novoNo.setElemento(elemento);
			novoNo.setProx(null);
			fim.setProx(novoNo);
			inicio = fim = novoNo;
			
		}
		else {
			inserirNoFim(elemento);
		}
		quantidade++;
	}
	
	public boolean inserirNoInicio(int elemento) {
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
	
	public void inserirNoFim(int elemento) {
		NoEncadeado novoNo = new NoEncadeado();
		novoNo.setElemento(elemento);
		novoNo.setProx(null);
		fim.setProx(novoNo);
		fim = novoNo;
	}
	
	//passe um referencia de localização
	public boolean inserirNoMeio(int elemento) {
		if(this.inicio == null) {
			inserir(elemento);
			return true;
		}
		else {
			
			
		}
		return false;
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
