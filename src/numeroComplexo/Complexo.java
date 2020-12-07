package numeroComplexo;

public class Complexo {

	private double numReal;
	private double numImaginario;

	// construtor padrão
	public Complexo() {
	}

	//construtor inicializando com os numeros complexos
	public Complexo(double numReal, double numImaginario) {
		this.numReal = numReal;
		this.numImaginario = numImaginario;
	}

	//criando numeros complexo caso crie um construtor padrão.
	public void criarNumeroComplexo(double numReal, double numImaginario) {
		this.numReal = numReal;
		this.numImaginario = numImaginario;
	}
	
	public void soma(Complexo num1, Complexo num2) {
		// Somando os numeros complexos
		System.out.println((num1.numReal + num2.numReal) + ", " + (num1.numImaginario + num2.numImaginario));
	}
	
	public void multiplicacaoNumeroComplexo(Complexo num1, Complexo num2) {
		System.out.println((num1.numReal*num2.numReal)+", "+ (num1.numImaginario*num2.numImaginario));
	}
	
	public double getNumReal() {
		return numReal;
	}

	public void setNumReal(double numReal) {
		this.numReal = numReal;
	}

	public double getNumImaginario() {
		return numImaginario;
	}

	public void setNumImaginario(double numImaginario) {
		this.numImaginario = numImaginario;
	}
	
	/*
	public String toString() {
		return this.numReal+", "+ this.numImaginario;
	}
   */
}
