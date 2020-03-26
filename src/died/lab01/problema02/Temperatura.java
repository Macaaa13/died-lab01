package died.lab01.problema02;

public class Temperatura {

	//Atributos
	private Double grados;
	private Escala escala;
	
	//Constructores
	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(Double g, Escala e) {
		this.grados = g;
		this.escala = e;
	}

	
	//Métodos
	public String toString() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados + " C°";
		}
		else {
			return this.grados + " F°";
		}
	}
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados;
		}
		else {
			return (this.grados-32.0)*(5.0/9);
		}
	}
	
	public Double asFahrenheit() {
		if(this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}
		else {
			return (this.grados*(9.0/5))+32;
		}
	}
	
	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados>0) {
			if(temperatura.escala == this.escala) {
				this.grados += temperatura.grados;
			}
			else {
				if(temperatura.escala == Escala.CELCIUS) {
					this.grados += temperatura.asFahrenheit();
				}
				else {
					this.grados += temperatura.asCelcius();
				}
			}
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if(temperatura.grados>0) {
			if(temperatura.escala == this.escala) {
				this.grados -= temperatura.grados;
			}
			else {
				if(temperatura.escala == Escala.CELCIUS) {
					this.grados -= temperatura.asFahrenheit();
				}
				else {
					this.grados -= temperatura.asCelcius();
				}
			}
		}
	}
	
}
