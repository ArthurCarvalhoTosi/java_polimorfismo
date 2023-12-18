package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Gato extends Mamifero{
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null, "Comendo atum");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null, "Correndo pela casa");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null, "MIAU! MIAU! MIAU!");
	}

}
