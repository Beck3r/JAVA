package com.krakedev.test;
import com.krakedev.Fecha;
public abstract class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha(2026,04,1);
		
		//f1.setAnio(2026);
		//f1.setMes(04);
		//f1.setDia(1);
		
		System.out.println("Año: " + f1.getAnio());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Dia: " + f1.getDia());
		
	}

}

