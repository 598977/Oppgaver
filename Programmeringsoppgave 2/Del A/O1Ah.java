package no.hvl.dat100;

public class O1Ah {
	
	public static void main (String[] args) {
		
		int[] tabell1 = {2, 5, 7, 3, 7};
		int[] tabell2 = {6, 1, 3, 8, 6};
		
		
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
	
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] nyTabell = new int[lengde1+lengde2];

		for (int i=0; i<lengde1; i++)
		{
			nyTabell[i] = tabell1[i];
		}
		for (int i=0; i<lengde2; i++)
		{
			nyTabell[lengde1 + i] = tabell2[i];
		}
		return nyTabell;
	}
}
