package blanco;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Main {

	public static void main(String[] args) {
		Flecha f1;
		TiroAlblanco tiroalblanco =  new TiroAlblanco();
		Calendar tIni = new GregorianCalendar();
		//f1=tiroalblanco.fuerzaBruta();
		f1=tiroalblanco.fuerzaBrutaMejorada();
		Calendar tFin = new GregorianCalendar();
		System.out.println(f1);
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("velocidad del algoritmo:"+diff);
	}
}

