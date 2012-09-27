package es.neets.performers;

public class MalabaristaPoeta extends Malabarista {

	private Poema poema;
	
	public MalabaristaPoeta(Poema poema){
		super();
		this.poema=poema;
	}
	
	public MalabaristaPoeta(int npelotas, Poema poema){
		super(npelotas);
		this.poema=poema;
	}
	
	public void perform(){
		super.perform();
		System.out.println("mientras recita...");
		poema.recitar();
	}
}
