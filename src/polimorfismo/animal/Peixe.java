package polimorfismo.animal;


public class Peixe extends Animal {
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	private String  corEscama;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	public void soltandoBolhas() {
		System.out.println("Soltando Bolhas");
	}
	

}
