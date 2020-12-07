package lista;

public class Teste {

	public static void main(String[] args) {

		ListaEncadeada listaEncadeada = new ListaEncadeada();

		listaEncadeada.inserirNoInicio(20);
		listaEncadeada.inserirNoInicio(50);
		listaEncadeada.inserirNoInicio(30);
		listaEncadeada.inserirNoInicio(50);
		
		listaEncadeada.inserir(10);
		listaEncadeada.inserirNoFim(80);
		
		
		listaEncadeada.listarElementos();

	}

}
