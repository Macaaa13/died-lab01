/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Macu
 *
 */
public class Punto {

	//Variables
	private float x;
	private float y;

	//Constructor
	public Punto (float x, float y){
		this.x = x;
		this.y = y;
	}
	
	//Getters y Setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	//Métodos
	public boolean equals(Object otroPunto) {
		boolean b = false;
		//Operador and para no evaluar operaciones de más
		//Se transforma otroPunto en Punto porque es pasado como Object
		if(otroPunto instanceof Punto && (((Punto) otroPunto).y == this.y) && (((Punto) otroPunto).x == this.x)) {
			b = true;
		}
		return b;
	}
	
	

}
