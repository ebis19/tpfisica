package blanco;

public class TiroAlblanco {
	public Flecha fuerzaBruta(){
		Flecha f1;
		double angulo;
		double v0=0;
		Blanco b1=new Blanco(10);
		while(v0++<30) {
			angulo=0;
			while(angulo++<90){
				f1=new Flecha(v0,angulo);
				if(b1.getDistanciaALAFlecha(f1)<b1.RADIOCHIQUITO)
						return f1;
						
			}
		}
		return new Flecha(-1,-1);
		
	}
}
