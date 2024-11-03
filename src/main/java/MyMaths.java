/**
 * Die Klasse MyMaths bietet mathematische Hilfsfunktionen.
 * Insbesondere beinhaltet sie eine Methode zur Berechnung des größten gemeinsamen Teilers (ggT)
 * von zwei Ganzzahlen. Der ggT ist die größte Zahl, die beide Ganzzahlen ohne Rest teilt.
 */
public class MyMaths {

	/**
	 * Berechnet den größten gemeinsamen Teiler (ggT) von zwei ganzen Zahlen.
	 *
	 * Diese Methode verwendet den euklidischen Algorithmus zur Berechnung des ggT.
	 * Zuerst wird sichergestellt, dass die größere Zahl in der Variable m gespeichert wird.
	 * Dann wird der Rest der Division von m durch n wiederholt berechnet, bis der Rest 0 ist.
	 * Der letzte nicht-null Rest ist der ggT von m und n.
	 *
	 * @param m die erste ganze Zahl
	 * @param n die zweite ganze Zahl
	 * @return der größte gemeinsame Teiler von m und n
	 */
	public int gcd(int m, int n) {
		
		int r;
		if (n>m) {
			
			r = m;
			m = n;
			n = r;
		}
		
		r = m % n;
		while (r != 0) {
			
			m = n;
			n = r;
			r = m % n;
		}		
		return n;
	}
	
}
