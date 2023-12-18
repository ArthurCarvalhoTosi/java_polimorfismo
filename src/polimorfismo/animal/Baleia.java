package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Baleia extends Mamifero {
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo moluscos");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Nadando pelo oceano");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de baleia");
	}
	
}
