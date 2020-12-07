package esferaCalculo;

public class Esfera {
	
	public static double Pi = 3.14;
	private Double raio;
	
	public Esfera(Double raio) {
		this.raio = raio;
	}
	
	//calculo do volume da esfera
	private Double volume() {
		return (4*Pi*Math.pow(raio, 3))/3;
	}
	
	//calculo da area da esfera
	private Double area() {
		return 4*Pi*Math.pow(raio, 2);
	}
	
	//retorna o raio
	private Double raio() {
		return raio;
	}
	
	public String toString(){
		StringBuilder string = new StringBuilder();
		string.append("********Calculo da Esfera*********\n");
		//String.format para retorna duas casas decimais
		string.append("Volume: "+String.format("%.2f", volume())); 
		string.append("\nArea: "+String.format("%.2f", area()));
		string.append("\nRaio: "+String.format("%.2f",raio()));
		
		return string.toString();
	}
}
