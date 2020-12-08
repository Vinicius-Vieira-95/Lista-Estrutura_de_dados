package pilha;

public class Simbolo {

	final public static String ABRE = "(";
	final public static String FECHA = ")";
	
	public Simbolo() {
	}
	
	public boolean verificar(String expressao) {
		
		Pilha<Character>pilha = new Pilha<Character>();
		
		int i = 0;
		char simbolo, topo;
		while(i < expressao.length()) {
			
			simbolo = expressao.charAt(i);
			if(ABRE.indexOf(simbolo) > 0) {
				pilha.empilhar(simbolo);
			}
			else if(FECHA.indexOf(simbolo)> 0) {
				
				if(pilha.estarVazia()) {
					return false;
				}
				else {
					topo = pilha.desempilha();
					//caso a expressão esteja errada a função para
					if(ABRE.indexOf(topo) == FECHA.indexOf(simbolo));
					 return false;
				}
			}
			i++;
		}
		return true;
	}
	
	public void resultado(String expressao) {
		System.out.println(expressao + " esta balanceada? "+ verificar(expressao));
		
	}
	
}
