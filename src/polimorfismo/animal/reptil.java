package polimorfismo.animal;

import javax.swing.JOptionPane;

public class reptil extends Animal {
	
	private String corEscama;

	@Override
	public void locomover() {
		JOptionPane.showMessageDialog(null,"Andando");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Som de reptil");
		
	}

}
