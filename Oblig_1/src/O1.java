import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		int brutto = parseInt (showInputDialog("Bruttoinntekt"));
		//ParseInt gjør string om til int
		
		if (brutto <= 164100) {
			showMessageDialog(null, "Ingen trinnskatt");
			
		} else if (brutto > 164100 && brutto <= 230950){
			showMessageDialog(null, brutto*0.0093); //trinnskatt 1
			
		} else if (brutto > 230950 && brutto <= 580650){
			showMessageDialog(null, brutto*0.0241); //trinnskatt 2
			
		} else if (brutto > 580650 && brutto <= 934050){
			showMessageDialog(null, brutto*0.1152); //trinnskatt 3
		
		} else if (brutto > 934050){
			showMessageDialog(null, brutto*0.1452); //trinnskatt 4
		}
	}
}