package main;

public class DescuentoPorcentaje extends Descuento{
	
	public DescuentoPorcentaje(float valor) {
		super(valor);
	}
	
	@Override
	public float descuento(float base) {
		// TODO Auto-generated method stub
		return base - (base * super.getValor());
	}

}
