package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola PUCE");
		
		Rectangulo rectangulo1=new Rectangulo();
		rectangulo1.setBase(20);
		rectangulo1.setAltura(80);
		System.out.println("Aŕea rectangulo: " + rectangulo1.calcularArea());
		
		Circulo circulo1=new Circulo();
		circulo1.setRadio(10);
		System.out.println("Aŕea círculo: " + circulo1.calcularArea());
	}

}
