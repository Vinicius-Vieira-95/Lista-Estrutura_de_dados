package questao04;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//entreda de dos numeros
		System.out.println("10 na base 2: "+qualquerBase(10, 2));
		System.out.println("10 na base 8: "+qualquerBase(10, 8));
		System.out.println("10 na base 16: "+qualquerBase(10, 16));
		
		
		System.out.println("20 na base 2: "+qualquerBase(20, 2));
		System.out.println("20 na base 8: "+qualquerBase(20, 8));
		System.out.println("20 na base 16: "+qualquerBase(20, 16));
	

	}
	
	public static String binario(int num) {
		
		Pilha<Integer> pilha = new Pilha<>();
		String numeroBinario = "";
		int resto;
		
		while(num > 0) {
			resto = num % 2; // 0 ou 1
			pilha.empilhar(resto); //empilha o resto.
			num = num / 2;
			
		}
		while(!pilha.estarVazia()) {
			numeroBinario += pilha.desempilha();
		}
		return numeroBinario;
	}
	
	//metodo para pegar qualquer base decimal
	public static String qualquerBase(int num, int base) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		String numeroBase = "";
		int resto;
		
		String bases = "0123456789ABCDEF";
		
		while(num > 0) {
			resto = num % base;
			pilha.empilhar(resto); //empilha o resto.
			num = num / base;
			
		}
		while(!pilha.estarVazia()) {
			numeroBase += bases.charAt(pilha.desempilha());
		}
		return numeroBase;
	}

}
