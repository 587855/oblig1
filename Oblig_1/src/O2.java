import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		for (int i=0; i < 10; i++) {
		
			int Poeng = parseInt (showInputDialog("Poeng"));
				if (Poeng < 39 && Poeng >= 0) {
					showMessageDialog(null, "F - Ikke bestått");
				} else if (Poeng > 39 && Poeng <= 49) {
					showMessageDialog(null, "E - Tilstrekkelig");
				} else if (Poeng > 49 && Poeng <= 59) {
					showMessageDialog(null, "D - Nokså god");
				} else if (Poeng > 59 && Poeng <= 79) {
					showMessageDialog(null, "C - God");
				} else if (Poeng > 79 && Poeng <= 89) {
					showMessageDialog(null, "B - Meget god");
				} else if (Poeng > 89 && Poeng <= 100) {
					showMessageDialog(null, "A - Fremragende");
				} else if (Poeng < 0 || Poeng > 100) {
					showMessageDialog(null, "Skriv inn på nytt - poengsum må være verdi mellom 0 - 100");
					i --;
					
			}
		}
	}
}
