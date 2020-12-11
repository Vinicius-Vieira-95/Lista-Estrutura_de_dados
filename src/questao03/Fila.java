package questao03;

import EstruturaDeBaseDinamica.EstruturaDinamica;

public class Fila<T> extends EstruturaDinamica<T> {

	
	public Fila() {
		super();
	}
	
	public void inseriNaFila(Object elemento) {
		super.inserir(elemento);
	}
	
	@Override
	public void remover() {
		this.setInicio(this.getInicio().getProx());
	}
	
}
