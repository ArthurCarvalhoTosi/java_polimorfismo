package polimorfismo.animal;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Polimorfismo {

	public static void main(String[] args) {
		
		try {
			int Entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: /n 1-Ave /n 2-Peixe /n 3-Mamífero /n 4-Réptil"));
		
		switch (Entrada) {
		
		case 1:
			Aves a = new Aves();
			Ave_Canarinho ac = new Ave_Canarinho();
			Ave_Papagaio ap = new Ave_Papagaio();
			Ave_Pinguim aP = new Ave_Pinguim();
			ac.setPeso(10.5f);
			ac.setCorPena("");
			ac.alimentar();
			ac.locomover();
			ac.emitirSom();
			ac.setPeso(12.5f);
			ac.emitirSom();
			ac.Descricao();
			ac.Menu();
			
		case 2:
			Peixe p = new Peixe();
			Peixe_Merluza pm = new Peixe_Merluza();
			Peixe_Palhaco pp = new Peixe_Palhaco();
			Peixe_Salmao ps = new Peixe_Salmao();
			p.setPeso(10.5f);
			p.setCorEscama("Prata");
			p.alimentar();
			p.locomover();
			p.emitirSom();
			p.setPeso(12.5f);
			
		case 3: 
			Mamifero m = new Mamifero();
			Cachorro c = new Cachorro();
			Gato g = new Gato();
			Baleia b = new Baleia();
			Macaco ma = new Macaco();
			m.setPeso(10.5f);
			m.alimentar();
			m.locomover();
			m.emitirSom();
			m.setPeso(12.5f);
			m.setCorPelo("");
			
		case 4: 
			reptil r = new reptil();
			Serpente s = new Serpente();
			Tartaruga t = new Tartaruga();
			Lagarto l = new Lagarto();
			r.setPeso(10.5f);
			r.setCorEscama("Marrom");
			r.alimentar();
			r.locomover();
			r.emitirSom();
			break;
			
		 default:
			 JOptionPane.showMessageDialog(null,"Opção invalida");

			}
		}catch(InputMismatchException exception) {
			JOptionPane.showMessageDialog(null, "Caracter inserido não compatível!" );
			}
		

	}

}
