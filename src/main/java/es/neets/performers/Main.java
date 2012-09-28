package es.neets.performers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("artistas.xml");
		Taquilla taquilla = (Taquilla)ctx.getBean("taquilla");
		taquilla.start();
		try {
			taquilla.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Auditorio auditorio = (Auditorio)ctx.getBean("auditorio");
		Escenario escenario = (Escenario)ctx.getBean("escenario");
		escenario.abrirTelon();
		Artista johnny = (Artista)ctx.getBean("johnny");
		johnny.perform();
		Artista kenny = (Artista)ctx.getBean("kenny");
		kenny.perform();
		
		

	}

}
