package lista;

public class Item01 {

	public static void main(String[] args) {

		ListaEncadeada listaEncadeada = new ListaEncadeada();

		listaEncadeada.inserirNoInicio(20);
		listaEncadeada.inserirNoInicio(50);
		listaEncadeada.inserirNoInicio(30);
		listaEncadeada.inserirNoInicio(50);
		
		listaEncadeada.inserir(10);
		listaEncadeada.inserirNoFim(80);
		
		listaEncadeada.listarElementos();
		
		System.out.println();
		
		
		System.out.println("Pegando os elementos da lista Dinamica e passando para estatica");
		ListaEstatica<Object> lista = new ListaEstatica<>(listaEncadeada.getQuantidade());
		lista = listaEstatica(listaEncadeada);
		
		System.out.println(lista.toString());
		
		System.out.println();
		
		System.out.println("Pegando elemento da lista estatica e passando para dinamica");
		ListaEncadeada listaEncadeada2 = new ListaEncadeada();
		listaEncadeada2 = listaEncadeada(lista);
		listaEncadeada2.listarElementos();
		
	}
	
	public static ListaEstatica<Object> listaEstatica (ListaEncadeada lista ){
		
		ListaEstatica<Object> listaEstatica = new ListaEstatica<Object>(lista.getQuantidade());
		for(int i = lista.getQuantidade(); i >= 0; i--) {
			listaEstatica.addcionar(lista.getInicio().getElemento());
			lista.setInicio(lista.getInicio().getProx());
		}
		listaEstatica.eliminarItemRepitido(listaEstatica.getElementos());
		
		return listaEstatica;
	}
	
	public static ListaEncadeada listaEncadeada(ListaEstatica lista) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		for(int i = 0; i < lista.getQtd(); i++) {
			listaEncadeada.inserir(lista.getElementos()[i]);
		}
		return listaEncadeada;
	}

}
