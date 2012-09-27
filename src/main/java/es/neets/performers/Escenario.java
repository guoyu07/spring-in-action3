package es.neets.performers;

public class Escenario {

	private Escenario(){}
	
	private static class EscenarioSingleton {
		static Escenario instancia = new Escenario();
	}
	
	public static Escenario getInstance(){
		return EscenarioSingleton.instancia;
	}
	
	public void abrirTelon(){
		System.out.println("Se abre el telón del escenario");
	}
}
