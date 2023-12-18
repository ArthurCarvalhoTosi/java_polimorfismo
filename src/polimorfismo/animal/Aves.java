package polimorfismo.animal;

public class Aves extends Animal {
	private String corPena;
	
	

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
      public void  contruirNinho() {
    	  System.out.println("Contruindo Ninho");
      }

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
