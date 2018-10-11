package blanco;

public class Blanco {

	
	double anguloI;
	final double ANGULOMAX=Math.toRadians(20);
	final double RADIO=0.5;

	public boolean golpea(Flecha flecha){
		double t= flecha.obtenerTiempoImpacto();
		double z= getPosicionY(t),y=getPosicionY(t);
		double y1=-Math.sqrt(RADIO*RADIO-z*z)-(y*y);
		double y2=Math.sqrt(RADIO*RADIO-z*z)-(y*y);

		double h=flecha.obtenerAlturaImpacto();
		return y1<=h && h>=y2 && h>-0.5 ;
	}
	double getPosicionZ(double t){
		return 3*ANGULOMAX*Math.sin((Math.sqrt(9.8/3)*t)+anguloI);
	}
	double getPosicionY(double t){
		return 3-Math.sqrt(9-Math.pow(this.getPosicionZ(t), 2)) ;
	}
	public Blanco(double anguloI) {
		super();
		this.anguloI = anguloI;
	}
	
	
}
