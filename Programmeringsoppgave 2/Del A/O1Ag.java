package no.hvl.dat100;

public class O1Ag {
	
	public static void main (String[] args) {
		
		int[] tabell = {2, 1, 4, 5, 6};
		boolean sortert = erSortert(tabell);
		System.out.println(sortert);
	}
	
	public static boolean erSortert (int[] tabell) {
	
		int lengde = tabell.length;
		boolean sortert = true;
		int i = 0;
		
		while ((i<lengde - 1) && sortert) {
			if (!(tabell[i] <= tabell[i + 1])) {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}

}
