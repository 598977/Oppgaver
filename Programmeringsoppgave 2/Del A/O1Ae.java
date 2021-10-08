package no.hvl.dat100;

public class O1Ae {

	public static void main (String[] args) {
		
		int tall = 0;
		int[] tabell = {2, 5, 7, 3, 7};
		int posisjon = posisjonTall(tabell, tall);
		System.out.println(posisjon);
		
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		
	int posisjon = -1, i = 0;
	
	while ((i < tabell.length && (posisjon == -1))) {
		if (tabell [i] == tall) {
			posisjon = i;
		}
		i++;
		}
	return posisjon;
	}
}
