package died.lab01.problema01;

public class Recta {

	//Variables
	private Punto p1;
	private Punto p2;
	
	//Constructores
	public Recta() {}
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	//Métodos
	public float pendiente() {
		return (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
	}
	
	public boolean paralelas(Recta otraRecta) {
		boolean b = false;
		if(otraRecta.pendiente()==this.pendiente()) {
			b = true;
		}
		return b;
	}
	
	public boolean equals(Object otraRecta) {
		//Las recta deben ser exactamente la misma
		boolean b = false;
		if(otraRecta instanceof Recta) {
			Recta R3 = new Recta(((Recta) otraRecta).p1, this.p1);
			if(R3.pendiente() == ((Recta) otraRecta).pendiente() && R3.pendiente()==this.pendiente()) {
				b = true;
			}
		}
		return b;
	}
}
