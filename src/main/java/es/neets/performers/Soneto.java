package es.neets.performers;

public class Soneto implements Poema {

	public static String SONETO = "Las rojas son rojas,\n" +
			"las violetas azul,\n" +
			"y nada es tan dulce\n" +
			"como lo eres t�.";
	public Soneto(){}
	
	public void recitar() {
		System.out.println(SONETO);

	}

}
