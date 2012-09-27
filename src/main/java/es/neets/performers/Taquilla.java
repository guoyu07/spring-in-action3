package es.neets.performers;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Taquilla extends Thread implements ApplicationContextAware{
	
	public ApplicationContext ctx;
	
	public Taquilla(String nombre){
		super(nombre);
	}

	public void run(){
		System.out.println("Taquilla abierta.");
		long start=System.currentTimeMillis();
		long end=start;
		while(end-start<10000){
			double sleepTime=Math.random()*10000/2;
			try {
				Thread.currentThread().sleep((long)sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Ticket ticket = (Ticket)ctx.getBean("ticket");
			System.out.println(ticket+" vendido.");
			end=System.currentTimeMillis();
		}

		System.out.println("Taquilla cerrada.");
	}

	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx=ctx;
		
	}
}
