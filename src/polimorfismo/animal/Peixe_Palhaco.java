package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Peixe_Palhaco extends Peixe {
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo algas");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Nadando pelo aquário");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de peixe palhaço");
	}

}
