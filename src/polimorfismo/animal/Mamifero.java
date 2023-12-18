package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		
		JOptionPane.showMessageDialog(null, "Correndo...");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Mamando");
	}

	@Override
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Meu som de mamifero");
		
	}

	
	

}
