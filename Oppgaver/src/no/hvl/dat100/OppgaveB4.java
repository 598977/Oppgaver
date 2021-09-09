package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB4 {
	
	public static void main(String[] args) {
		
		String brutto = showInputDialog ("Bruttoinntekt: ");
		int brutto1 = parseInt (brutto);
		double skatt = 1;
		
		if (brutto1 <= 184800) {
		}
		else if (184800 < brutto1 && brutto1 <= 260100) {
			skatt = 0.017;
		}
		else if (260100 < brutto1 && brutto1 <= 651250) {
			skatt = 0.040;
		}
		else if (651250 < brutto1 && brutto1 <= 1021550) {
			skatt = 0.132;
		}
		else if (brutto1 > 1021550) {
			skatt = 0.162;
		}
		
		double trinnskatt = (skatt * brutto1);
		showMessageDialog(null, trinnskatt);
		
	}

}