package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Tartaruga extends reptil{
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo frutas");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Andando na grama");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de tartaruga");
	}
}
