package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Registro {

	public static final int MAX_TEMP = 30;
	
	//Atributos
	private String ciudad;
	private Temperatura[] historico;
	private int indiceActual;
	
	//Constructores
	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[MAX_TEMP];
		this.indiceActual = 0;
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[MAX_TEMP];
		this.indiceActual = 0;
	}
	
	//Métodos
	public String getCuidad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
		int n = 1;
		for(Temperatura temp: this.historico) {
			if(temp != null) {
				System.out.println(n + " " + temp.toString());
				n++;
			}
		}
	}
	
	public void agregar(Temperatura t) {
		if(this.indiceActual<MAX_TEMP) {
			this.historico[this.indiceActual] = t;
			this.indiceActual++;
		}
	}
	
	public Temperatura MediaAsCelcius() {
		Double grados = 0.0;
		for(Temperatura temp: this.historico) {
			if(temp != null) {
				grados += temp.asCelcius();
			}
		}
		Temperatura t = new Temperatura(grados/(indiceActual+1), Escala.CELCIUS);
		return t;
	}
	
	public Temperatura MediaAsFahrenheit() {
		Double grados = 0.0;
		for(Temperatura temp: this.historico) {
			if(temp != null) {
				 grados += temp.asFahrenheit();
			}
		}
		Temperatura t = new Temperatura(grados/(indiceActual+1), Escala.FAHRENHEIT);
		return t;
	}
	
	public Temperatura max(Temperatura t[], int indice) {
		Temperatura tempMax = new Temperatura();
		Temperatura aux = new Temperatura();
		// Caso base: si estamos en el último elemento, éste será el máximo
		if(indice==indiceActual-1) {
			tempMax = t[indice];
		}
		else {
			aux = max(t, indice+1);
			if(t[indice].asCelcius()>aux.asCelcius()) {
				tempMax = t[indice];
			}
			else {
				tempMax = aux;
			}
		}
		
		return tempMax;
	}
	
	public Temperatura maximo(){
		return max(historico, 0);
	}
	
	
}
