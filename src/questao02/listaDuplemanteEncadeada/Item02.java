package questao02.listaDuplemanteEncadeada;

import EstruturaDuplamenteEncadeado.EstruturaDuplamenteEncadeada;

public class Item02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EstruturaDuplamenteEncadeada lde = new EstruturaDuplamenteEncadeada();
		
		lde.criarLista(10);
		lde.inserirNoInicio(2);
		lde.inserirNoFim(15);
		lde.inserirNoFim(18);
		
		lde.criarLista(29);
		lde.inserirNoInicio(01);
		lde.listarElementos();
		lde.removerElemento(15);
		
		System.out.println();
		
		lde.listarElementos();
		
		System.out.println(lde.getQuantidade());
		
	}

}
