package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB5 {
	
public static void main(String[] args) {
		
	int studentnr = 1;
	while (studentnr <= 10) {
		String poengsum = showInputDialog ("Poeng :");
		int poeng = parseInt (poengsum);
		String karakter = "F";
		
		if (0 <= poeng && poeng <= 39) {
		}
		else if (40 <= poeng && poeng <= 49) {
			karakter = "E";
		}
		else if (50 <= poeng && poeng <= 59) {
			karakter = "D";
		}
		else if (60 <= poeng && poeng <= 79) {
			karakter = "C";
		}
		else if (80 <= poeng && poeng <= 89) {
			karakter = "B";
		}
		else if (90 <= poeng && poeng <= 100) {
			karakter = "A";
		}
		
		if (poeng >= 0 && poeng <= 100) {
		showMessageDialog(null, karakter);
		studentnr += 1;
		}
		else {
			showMessageDialog(null, "Ikke gyldig poengsum, prøv igjen!");
		}
	}	
	}

}