package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Ave_Papagaio extends Aves {
	
	public void  Descricao(){
		JOptionPane.showMessageDialog(null, "Os Papagaios comem: maçã, mamão, pera, pêssego, morango e melão./n "
				+ "Legumes: cenoura, batata e abobrinha, mas somente cozidos. Como mencionamos acima, alguns tubérculos podem ser prejudiciais devido à substância persina/n "
				+ " Verduras: brócolis e espinafre costumam ser os preferidos dos papagaios.");
		
	}
	
	public void alimentar() {
		JOptionPane.showMessageDialog(null, "Voando até uma arvore e procurando frutas");
		JOptionPane.showMessageDialog(null,"Comendo as frutas");

	}
	
	public void emitirSom(String frase) {
		 if (frase == "Toma comida") {
			 JOptionPane.showMessageDialog(null,"Eu quero");
			   
		   }else
			   JOptionPane.showMessageDialog(null,"Olá");

	}
	
}
