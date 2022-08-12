//clase deacuerdo a la pac de desarrollo
public class Ingreso extends Dinero{
	
	//constructor
	public Ingreso(double ingreso, String description) {
		this.setDinero(ingreso);
		super.setDescription(description);
	}

	
	@Override
	public String toString() {
		//Deacuerdo a vídeo del resultado esperado del programa
		return "Ingreso: "+ super.getDescription() +  ", cantidad:" + this.getDinero() +"€"; 
	}
	
}
