import java.util.List;

public class DierenwinkelApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StraatHond sh = new StraatHond();
		sh.name = "Woefie";
		sh.species = "K9";
		sh.weight = 380;
		sh.getName();
		
		Kat k = new Kat();
		k.canfly = false;
		
		// Dier d = new Dier(); Mag niet omdat die abstract is
		
		// Polymorphism
		Dier d = new Hond();
		d.makeSound();
		
		// Generics
		List<Dier> dieren;
		
	}

}
