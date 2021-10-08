package no.hvl.dat100;

public class O1Aa {
	
	public static void main (String[] args) {
		
		int[] tabell = {2, 5, 7, 3, 7};
		SkrivUt(tabell);
		
	}
	
	public static void SkrivUt (int[] tabell) {
	
		 for (int i=0; i<tabell.length; i++) {
			 System.out.println(tabell[i]);
		 }
	}
	
	
}
