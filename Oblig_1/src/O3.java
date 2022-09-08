import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {

	    public static void main(String[] args) {

	        int tall = parseInt (showInputDialog("Tall"));
	        long fakt = 1;
	        for(int i = 1; i <= tall; i++)
	        {
	            fakt *= i;
	        }
	        System.out.println(tall + "! = "+ fakt);
	    }
	}
