package numeroComplexo;

public class Principal {

	public static void main(String[] args) {

		Complexo n1 = new Complexo(6, -3); // criando o numero complexo
		Complexo n2 = new Complexo(8, -10);

		n1.soma(n1, n2); // resultado 14 , -13
		System.out.println();
		n1.multiplicacaoNumeroComplexo(n1, n2);//reultado 48 , 30

		// construtor padrão
		Complexo n3 = new Complexo();
		Complexo n4 = new Complexo();
		
		n3.criarNumeroComplexo(5, 7);
		n4.criarNumeroComplexo(7, -3);

	}

}
