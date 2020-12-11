package questao03;

public class Item01 {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.inserir("V");
		fila.inserir("C");
		fila.inserir("J");
		fila.inserir("R");

		fila.listarElementos();
		
		fila.removerDaFila();
		
		System.out.println();
		
		fila.listarElementos();
	}

}
