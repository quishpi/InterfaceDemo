package ec.edu.puce.interfaces;

public class Circulo implements FiguraGeometrica {

	private double radio;

	@Override
	public double calcularArea() {

		return radio * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
