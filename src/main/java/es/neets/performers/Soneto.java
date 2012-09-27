package es.neets.performers;

public class Soneto implements Poema {

	public static String SONETO = "Las rojas son rojas,\n" +
			"las violetas azul,\n" +
			"y nada es tan dulce\n" +
			"como lo eres tú.";
	public Soneto(){}
	
	public void recitar() {
		System.out.println(SONETO);

	}

}
