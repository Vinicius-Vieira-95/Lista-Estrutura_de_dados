package pilha;

public class Principal {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>(10);

		System.out.println(pilha.estarVazia());
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		
		System.out.println(pilha.estarVazia());
		
		System.out.println(pilha);
		
		System.out.println(pilha.topo());
		
		pilha.desempilha();
		
		System.out.println(pilha);

	}

}
