package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Peixe_Merluza extends Peixe{
	

	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo plânctons");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Nadando pelo oceano");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de Merluza");
	}

}
