package main;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{
	
	private float tope;
	
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
	}

	public float getTope() {
		return tope;
	}

	public void setTope(float tope) {
		this.tope = tope;
	}

	@Override
	public void setValor(float valor) {
		if(valor > tope) {
			super.descuento(0);
			System.out.println("no se puede poner ese valor porque supero el tope");
		}
		else {
			super.descuento(valor);
		}
	}

}
