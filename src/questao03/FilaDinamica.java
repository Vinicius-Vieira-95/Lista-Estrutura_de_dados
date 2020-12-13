package questao03;

import EstruturaDeBaseDinamica.EstruturaDinamica;

public class FilaDinamica<T> extends EstruturaDinamica<T> {

	public FilaDinamica() {
		super();
	}
	
	public void inseriNaFila(Object elemento) {
		super.inserir(elemento);
	}
	
	//remove o primeiro elemento da fila FIFO.
	public void removerDaFila() {
		this.setInicio(this.getInicio().getProx());
	}
	
	//retorna o objecto que esta na primeira posição
	public Object pegaInicio() {
		return getInicio().getElemento();
	}
	
}
