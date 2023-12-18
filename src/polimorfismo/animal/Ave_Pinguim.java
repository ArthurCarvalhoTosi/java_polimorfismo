package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Ave_Pinguim extends Aves{
	
	public void Descricao() {
		JOptionPane.showMessageDialog(null, "O pinguim é uma ave da família Spheniscidae, altamente modificadas para a uma vida aquática, "
				+ "sendo suas asas adaptadas para promover impulso através da água.");
	}
	
	public void locomover() {
		JOptionPane.showMessageDialog(null, "nadando pela Antártida");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null, "barulho de pinguim");
	}
	
	
}
