package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Macaco extends Mamifero {
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo manga");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Pulando de galho em galho");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de macaco");
	}
	
}
