package no.hvl.dat100;

public class O1Ab {
	
	public static void main (String[] args) {
		
		int[] tabell = {42,67,89};
		String tabellstring = tilStreng(tabell);
		System.out.println(tabellstring);
		
	}
		
	public static String tilStreng(int[] tabell) {
        String resultat= "[";
        for (int i=0; i<tabell.length; i++) {
            resultat+=tabell[i];
            if (i!=tabell.length -1) {
                resultat+=",";
            }
        }
        return resultat + "]";

    }
}
