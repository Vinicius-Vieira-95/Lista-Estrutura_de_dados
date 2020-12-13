package questao03;

import questao04.Pilha;

public class Item01 {

	public static void main(String[] args) {
		
		//metodo dinamico
		FilaDinamica<String> filaDinamica = new FilaDinamica<String>();
		
		filaDinamica.inserir("V");
		filaDinamica.inserir("C");
		filaDinamica.inserir("J");
		filaDinamica.inserir("R");

		filaDinamica.listarElementos();
		System.out.println("Primeiro da fila: "+ filaDinamica.pegaInicio());
		System.out.println();
		FilaDinamica<Object> filaInversa = metodoDinamico(filaDinamica);
		filaInversa.listarElementos();
		System.out.println("Primeiro da fila: "+ filaInversa.pegaInicio());
		System.out.println();
		
		
		//metodo estatico
		
		FilaEstatica<String> fila = new FilaEstatica<String>();
		fila.InserirNaFila("A");
		fila.InserirNaFila("B");
		fila.InserirNaFila("C");
		fila.InserirNaFila("D");
		System.out.println(fila.toString());
		
		FilaEstatica<Object> filaEstativaInversa = metodoEstatico(fila);
		System.out.println(filaEstativaInversa.toString());
		
	}
	
	public static  FilaDinamica<Object> metodoDinamico(FilaDinamica filaDinamica) {
		
		PilhaDinamica<Object> pilha = new PilhaDinamica<Object>();
		FilaDinamica<Object> filaDin = new FilaDinamica<Object>();
		
		for(int i = 0; i < filaDinamica.getQuantidade(); i++) {
			pilha.empilhar(filaDinamica.getInicio().getElemento());
			filaDinamica.setInicio(filaDinamica.getInicio().getProx());
		}
		
		for(int j = 0; j < filaDinamica.getQuantidade(); j++) {
			filaDin.inseriNaFila(pilha.pegarTopo());
			pilha.removerTopo();
			
		}
		return filaDin;
	}
	
	public static FilaEstatica<Object> metodoEstatico(FilaEstatica fila ) {
		
		Pilha<Object> pilha = new Pilha<Object>();
		FilaEstatica<Object> filaEs = new FilaEstatica<Object>();
		
		while(!fila.estarVazia()) {
			pilha.empilhar(fila.verInicio());
			fila.removerDaFila();
		}
		while(!pilha.estarVazia()) {
			filaEs.adcionar(pilha.topo());
			pilha.desempilha();
		}
		
		return filaEs;
	}

}
