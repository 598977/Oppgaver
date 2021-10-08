package no.hvl.dat100;

public class O1Ac2 {
	
	public static void main (String[] args) {
		
		int[] tabell = {2, 5, 7, 3, 7};
		int sum = summer(tabell);
		System.out.println(sum);
		
	}
	
	public static int summer (int[] tabell) {
		
	int sum = 0, i = 0;
		 while(i<tabell.length) {
			 sum += tabell[i];
			 i++;
			 }
			 return sum;
	}

}
