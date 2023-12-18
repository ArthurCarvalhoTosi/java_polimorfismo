package polimorfismo.animal;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Ave_Canarinho extends Aves{

	public void  Descricao(){
		JOptionPane.showMessageDialog(null, " Apesar de ser considerado um animal granívoro, ou seja, que se "
				+ "alimenta principalmente de sementes, esse canário também adora frutas, legumes e verduras. "
				+ "A dieta pode ser feita com rações à base de alpiste e sementes./n ");
		
	}
		
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null,"Comendo sementes");
	}
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null,"Cantando");
	}
	
	public void locomover() {
		JOptionPane.showMessageDialog(null,"Voando pela floresta");
	}
	
	
	void Menu() {
	try {
		int Entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: /n 1-Procurar Comida /n 2-Comer /n 3-Cantar /n 4-Voar"));
	
	switch (Entrada) {
	
	case 1:
		alimentar();
		
	case 2:
		emitirSom();
		
	case 3: 
		locomover();
		break;
		
	 default:
		 JOptionPane.showMessageDialog(null,"Opção invalida");

		}
	}catch(InputMismatchException exception) {
		JOptionPane.showMessageDialog(null, "Caracter inserido não compatível!" );
		}
	
	}

}
