package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c1 = new Calculadora();
		double valor = c1.sumar(14, 15);
		System.out.println("RESULTADO DE LA SUMA: "+valor);
		
		
		double valor2 =c1.restar(30, 15);
		System.out.println("RESULTADO DE LA RESTA: "+valor2);
		
		double valor3 = c1.multiplicar(10, 5);
		System.out.println("RESULTADO DE LA MULTIPLICACION: "+valor3);
		
		double valor4 = c1.dividir(10, 2);
		System.out.println("RESULTADO DE LA DIVISION: "+valor4);
		
		double valor5 = c1.promediar(10, 8, 9);
		System.out.println("RESULTADO DEL PROMEDIAR: "+valor5);
		
		c1.mostrarResultados();
		
		//evaluacion
		
		Calculadora c2 = new Calculadora();
		double resultadoResta = c2.restar(100.5, 40.5);
		System.out.println("Resultado Resta 2: " + resultadoResta);
		
		double descuento = c2.calcularDescuento(200.0, 15.0);
		System.out.println("Valor de Descuento: " + descuento);
	}

}
