package es.neets.performers;

public class Instrumentalista implements Artista {

	private String song;
	private Instrumento instrumento;
	private int age;
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	public void perform() {
		System.out.print("Tocando la canción "+song+": ");
		instrumento.play();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
