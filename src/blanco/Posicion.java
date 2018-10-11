package blanco;

public class Posicion {
	int x;
	int y;
	int z;
	double distancia(Posicion otra){
		return Math.sqrt(Math.pow(this.x-otra.x, 2)+Math.pow(this.y-otra.y, 2)+Math.pow(this.z-otra.z, 2));
	}

}
