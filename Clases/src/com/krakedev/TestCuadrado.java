package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.lado=4;
		c2.lado=6;
		c3.lado=8;
		
		double area1 = c1.calcularArea();
		double perimetro1 = c1.calcularPerimetro();
		
		double area2 = c2.calcularArea();
		double perimetro2 = c2.calcularPerimetro();
		
		double area3 = c3.calcularArea();
		double perimetro3 = c3.calcularPerimetro();
		
		System.out.println("*-*-*-*-*-*-*-*- CALCULOS DE CUADRADOS -*-*-*-*-*-*-*-*");
		System.out.println("AREA CUADRADO 1: " + area1);
		System.out.println("PERIMETRO CUADRADO 1: " + perimetro1);
		System.out.println("");
		System.out.println("AREA CUADRADO 2: " + area2);
		System.out.println("PERIMETRO CUADRADO 2: " + perimetro2);
		System.out.println("");
		System.out.println("AREA CUADRADO 3: " + area3);
		System.out.println("PERIMETRO CUADRADO 3: " + perimetro3);
		System.out.println("*-*-*-*-*-*-*-*-  CALCULOS FINALIZADOS  -*-*-*-*-*-*-*-*");
	}

}
