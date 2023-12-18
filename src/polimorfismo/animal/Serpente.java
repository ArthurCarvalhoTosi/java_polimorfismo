package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Serpente extends reptil{
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo ratos");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Rastejando pela floresta");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de serpente");
	}
}
