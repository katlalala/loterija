import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class uzdevums {

	// es padevos
	public static void main(String[] args) {
		
		Random rand = new Random();
	    Long pedDrawTime = null;
	    Stack<Integer> bumbas = new Stack<>();
	    Stack<Integer> vinnetaji = new Stack<>();
	    String lastDrawTimeFormatted = null;
	    Long Blaiks = null;
	    int izvele;

		
		String[] darbibas = {"Lozēt skaitļus", "Apskatīt skaitļus", "Apturēt"};
				do {
					izvele = JOptionPane.showOptionDialog(null,
							"Izvēlies darbību.", "Loterija izvēlne", JOptionPane.DEFAULT_OPTION,
							JOptionPane.QUESTION_MESSAGE, null,
							darbibas, darbibas[0]);
					

					switch(izvele) {
					
					case 0:
						if(vinnetaji.isEmpty()) {
							
							long Slaiks = System.currentTimeMillis();
							Long starp = Slaiks - Blaiks;
							
							if(starp < 60000);
							JOptionPane.showMessageDialog(null,
									"Pagaidi minūti.", "Brīdinājums",
									JOptionPane.WARNING_MESSAGE);
							
								
						} else
							JOptionPane.showMessageDialog(null,
									"Stekā jau atrodas vārds.", "Brīdinājums",
									JOptionPane.WARNING_MESSAGE);
							
						break;
						
					case 1:
						JOptionPane.showMessageDialog(null,
								"Laimīgie ir: ", + laimigie, "Informācija",
								JOptionPane.WARNING_MESSAGE);
						
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Programma apturēta.", "Informācija", JOptionPane.INFORMATION_MESSAGE);
					
					break;
					
			}
		} while(!izvele.equals(0));
				
				

	}

}

