package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(5);
		rectangulo.setAltura(20);
		System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(6);
		triangulo.setAltura(9);
		System.out.println("El area del Triangulo es: " + triangulo.calcularArea());
		
		Circulo circulo = new Circulo();
		
		circulo.setRadio(14);
		System.out.println("El area del Circulo es: " + circulo.calcularArea());
		
		

	}

}
