package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Peixe_Salmao extends Peixe{
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo outros peixes");
	}

	public void locomover() {
		JOptionPane.showMessageDialog(null,"Nadando pelo oceano");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de salmao");
	}

}
