package died.lab01.problema03;

import java.util.Random;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registro r1 = new Registro("DENVER");
		Registro r2 = new Registro("NAIROBI");
		Random generadorAleatorio = new Random();
		
		for (int i=0; i<10; i++) {
			r1.agregar(new Temperatura(generadorAleatorio.nextDouble()*50, Escala.CELCIUS));
		}
		for (int i=0; i<10; i++) {
			r2.agregar(new Temperatura(generadorAleatorio.nextDouble()*105, Escala.FAHRENHEIT));
		}
		
		r1.imprimir();
		System.out.println("Promedio en " + r1.getCuidad() + ": " + r1.MediaAsCelcius());
		System.out.println("Maximo en " + r1.getCuidad() + ": " + r1.maximo().asCelcius());
		System.out.println(" ");
		r2.imprimir();
		System.out.println("Promedio en " + r2.getCuidad() + ": " + r2.MediaAsFahrenheit());
		System.out.println("Maximo en " + r1.getCuidad() + ": " + r2.maximo().asFahrenheit());
		
		
		
	}

}
