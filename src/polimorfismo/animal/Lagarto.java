package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Lagarto extends reptil{
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo insetos");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Correndo pela mata");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de lagarto");
	}

}
