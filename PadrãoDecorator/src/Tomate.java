
public class Tomate extends PizzaDecorator {

	public Tomate(Pizza pizza) {
		super(pizza);
		
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println("Adicionado Tomate");
		
	}
	
	
}
