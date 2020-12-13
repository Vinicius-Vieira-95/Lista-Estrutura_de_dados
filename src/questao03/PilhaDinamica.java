package questao03;

import EstruturaDeBaseDinamica.NoEncadeado;
import EstruturaDuplamenteEncadeado.EstruturaDuplamenteEncadeada;
import EstruturaDuplamenteEncadeado.NoDuplamenteEncadeado;

public class PilhaDinamica<T> extends EstruturaDuplamenteEncadeada {

	public PilhaDinamica() {
		super();
	}

	public void empilhar(Object elemento) {
		super.inserirNoFim(elemento);
	}

	public void removerTopo() {
		if (this.getInicio().getProx() == null) {
			setInicio(null);
			setFim(getInicio());
			quantidade--;
		}
		else if(this.quantidade > 0) {
		NoDuplamenteEncadeado novoNo = this.getFim();
		novoNo = novoNo.getAnt();
		novoNo.setProx(null);
		setFim(novoNo);
		this.quantidade--;
		}
		
	}

	public Object pegarTopo() {
		if (this.getInicio() == null) {
			throw new IllegalAccessError("Pilha vazia");
		}
		return this.getFim().getElemento();
	}

}
