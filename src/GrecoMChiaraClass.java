/**
 * <h1>Verifica GrecoMChiaraClass</h1>
 * <h2><b>GRECO MARIA CHIARA</b></h2>
 * <h2><u>4AI</u></h2>
 * <h2><i>04/05/2022</i></h2>
 * @version 1.0
 * @author MariaChiara
 *
 */
public class GrecoMChiaraClass {

	/**
	 * costruttore
	 */
	public GrecoMChiaraClass() {
		
	}
	
	/**
	 * metodo che calcola la produttoria dati in input  i due indici
	 * @param s indice iniziale
	 * @param f indice finale
	 * @return ritorna la produttoria
	 */

	public int GrecoMet(int s,int f) {
		int r=0;
		for(int i=1;i<f;i++) {
			r=f*i;
		}
		return r;
	}
	
	/**
	 * main
	 * @param args parametro args
	 */

	public static void main(String[] args) {
		GrecoMChiaraClass c=new GrecoMChiaraClass();
		System.out.println(""+c.GrecoMet(5, 7));   
	}

}
