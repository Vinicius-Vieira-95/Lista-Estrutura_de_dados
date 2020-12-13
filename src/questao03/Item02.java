package questao03;

public class Item02 {

	public static void main(String[] args) {
		
		PilhaDinamica<String>pilha = new PilhaDinamica<String>();
		
		pilha.empilhar("Maria");
		pilha.empilhar("Vitor");
		pilha.empilhar("Marcos");
		pilha.empilhar("Fred");
		
		pilha.listarElementos();
		pilha.removerTopo();
		
		System.out.println();
		pilha.listarElementos();
		pilha.removerTopo();
		
		System.out.println();
		pilha.listarElementos();
		
		System.out.println(pilha.getQuantidade());
		pilha.removerTopo();
		
		System.out.println();
		pilha.listarElementos();
		
		System.out.println(pilha.getQuantidade());
		pilha.removerTopo();
		
	}

}
