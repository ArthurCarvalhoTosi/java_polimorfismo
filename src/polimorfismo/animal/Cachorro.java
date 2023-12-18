package polimorfismo.animal;

import javax.swing.JOptionPane;

public class Cachorro extends Mamifero {
	
	public void emitirSom() {
		JOptionPane.showMessageDialog(null, "Au! Au!");
	}
	
   public void reagir(String frase) {
	   if (frase == "Toma comida" || frase == "Ol�") {
		   JOptionPane.showMessageDialog(null, "Abanar o rabo");
		   
	   }else
		   JOptionPane.showMessageDialog(null,"Rosnar");
	   
   }
   
public void reagir(int hora, int min) {
	if (hora <12) {
		JOptionPane.showMessageDialog(null,"Abanar o rabo");
		   
	   }else
		   if (hora >=18) {
			   JOptionPane.showMessageDialog(null,"Ignorar");
	   
}	
   }


public void reagir(boolean dono) {
	if (dono == true) {
		JOptionPane.showMessageDialog(null,"Abanar o rabo");
	} else
		JOptionPane.showMessageDialog(null,"Rosnar e latir");
}
public void reagir(int idade, float peso) {
	if (idade < 5 ) {
		if(peso < 10) {
			JOptionPane.showMessageDialog(null,"Abanar");
		}else {
			JOptionPane.showMessageDialog(null,"Latir");
		}
	}else {
		if (peso<10){
			JOptionPane.showMessageDialog(null,"Rosnar");
		}else {
			JOptionPane.showMessageDialog(null,"Ignorar");
		}
	
}
}
}
