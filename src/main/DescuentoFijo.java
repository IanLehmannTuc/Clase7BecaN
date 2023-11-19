package main;

public class DescuentoFijo extends Descuento{
	
	public DescuentoFijo(float valor) {
		super(valor);
	}

	@Override
	public float descuento(float base) {
		// TODO Auto-generated method stub
		return base - super.getValor();
	}
	
	
	
}
