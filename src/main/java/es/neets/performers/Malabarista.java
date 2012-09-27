package es.neets.performers;

public class Malabarista implements Artista {

	private int npelotas = 3;
	
	public Malabarista(){
	}
	
	public Malabarista(int npelotas){
		this.npelotas=npelotas;
	}
	
	public void perform() {
		System.out.println("Actuación del Malabarista con "+npelotas+" pelotas");
	}

}
