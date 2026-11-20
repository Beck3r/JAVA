package com.krakedev;


public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v;
		v = new Vehiculo();
		
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 1: Creado!!>>>>>>>>>>>>>>>>");
	//	System.out.println("Hola mundo");
		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 1: Valores Asignados!!>>>>>>>>>>>>>>>>");
		
		
		v.setAnio("2012");
		v.setMarca("chevrolet");
		v.setModelo("nuevo");
		
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 2: Creado!!>>>>>>>>>>>>>>>>");
//		System.out.println("Hola mundo");
		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 2: Valores Asignados!!>>>>>>>>>>>>>>>>");
		
		
		Vehiculo v2 = new Vehiculo();
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 2: Valores Asignados!!>>>>>>>>>>>>>>>>");
		v2.setAnio("2026");
		v2.setMarca("chevrolet");
		v2.setModelo("El mas rapido");
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
		
		
		Vehiculo v3 = new Vehiculo("Chevrolet");
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 3: Valores Asignados!!>>>>>>>>>>>>>>>>");
		System.out.println("Año: "+v3.getAnio());
		System.out.println("Marca: "+ v3.getMarca());
		System.out.println("Modelo: "+ v3.getModelo());
		
		Vehiculo v4 = new Vehiculo("Toyota", "Familiar", "2024");
		System.out.println("<<<<<<<<<<<<<<<<Vehiculo 4: Valores Asignados!!>>>>>>>>>>>>>>>>");
		System.out.println("Año: "+v4.getAnio());
		System.out.println("Marca: "+ v4.getMarca());
		System.out.println("Modelo: "+ v4.getModelo());
	}

}
