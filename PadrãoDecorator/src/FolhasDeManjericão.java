
public class FolhasDeManjeric�o extends PizzaDecorator {

	public FolhasDeManjeric�o(Pizza pizza) {
		super(pizza);
		
	}
	@Override
	public void montar() {
		super.montar();
		System.out.println("Adicionado Folhas de Manjeri��o");
		
	}
	

}
