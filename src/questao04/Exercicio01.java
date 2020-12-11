package questao04;

public class Exercicio01 {

	
	public static void main(String [] arg) {
		
		
		
		String s1 = "((A+B))";
		String s2 = "(A+B)";
		String s3 = "(B()A";
		
		System.out.println(verificar(s3));
		
	}
	
	public static boolean verificar(String expressao) {
		
		Pilha<Character>pilha = new Pilha<Character>();
		Character simbolo, topo;
		
		String abre = "(";
		String fecha = ")";
		
		for(int i = 0; i  < expressao.length(); i++) {
			
			simbolo = expressao.charAt(i); //pega o  caracter passado pelo posi��o i. 
			
			if(simbolo.equals(abre)) {
				pilha.empilhar(simbolo);
			}
			else if(simbolo.equals(fecha)) {
				//verificando se a pilha esta vazia.
				if(pilha.estarVazia()) {
					return false; //n�o existe a express�o
				}
				else {
					topo = pilha.desempilha();
					//caso a express�o n�o esteja certa a fun��o para
					if(topo == simbolo);
					 return false;
				}
			}
		}
		return true;
	}
	
	public static void resultado(String expressao) {
		System.out.println(expressao + " esta balanceada? "+ verificar(expressao));
		
	}
	
}
