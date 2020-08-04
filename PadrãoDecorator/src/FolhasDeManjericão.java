
public class FolhasDeManjericão extends PizzaDecorator {

	public FolhasDeManjericão(Pizza pizza) {
		super(pizza);
		
	}
	@Override
	public void montar() {
		super.montar();
		System.out.println("Adicionado Folhas de Manjerição");
		
	}
	

}
