package questao04;

public class Principal {

	public static void main(String[] args) {
		
		Exercicio01 sim = new Exercicio01();
		
		String s = "(())";
		String s2 = "(A+B)";
		String s3 = "((";
		
		System.out.println(sim.verificar(s3));
		

	}

}
