package com.krakedev;

public class Calculadora {
	public double sumar(int a, int b) {
		double resultado;
		resultado = a + b;
		
		return resultado;
	}
	
	public double restar(double a, double b) {
		double resultado;
		resultado = a - b;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double producto;
		producto = valor1 * valor2;
		return producto;
	}
	
	public double dividir(double dividendo, double divisor) {
		double cociente;
		
		cociente = dividendo / divisor;
		return cociente;
		
	}
	
	public double promediar (double valor1, double valor2, double valor3) {
		double total;
		total = (valor1 + valor2 + valor3)/3;
		
		return total;
	}
	
	public double calcularDescuento(double precio, double porcentajeDescuento) {
		double descuento;
		descuento =precio - (precio*porcentajeDescuento/100);
		return descuento;
	}
	
	public void mostrarResultados() {
		System.out.println("Horita no joven. Salí al almuerzo. Regreso en 15 minutos");
	}
}
