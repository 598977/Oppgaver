package no.hvl.dat100;

public class O1Af {
	
	public static void main (String[] args) {
		
		//klarte ikke å få den reverserte tabellen opp hit
	
	public static int[] reverser (int[] tabell) {
		
	int lengde = tabell.length;
	int[] tabell2 = new int[lengde];
	
	for (int i = 0; i < lengde; i++) {
		tabell2[i] = tabell[lengde -1 -i];
	}
	return tabell2;
	}
}
