package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
		platoA.nombre="Ensalada de calamares asados con aderezo de limón";
		platoA.tipo="Entrada";
		platoA.precio=15.9f;
		platoA.disponible=true;
		
		platoB.nombre="Muslos de pollo a la sriracha";
		platoB.tipo="Plato Fuerte";
		platoB.precio=25.2f;
		platoB.disponible=true;
		
		platoC.nombre="Soufflé de mango y coco";
		platoC.tipo="Postre";
		platoC.precio=5.15f;
		platoC.disponible=false;
		
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+platoA.nombre);
		System.out.println("TIPO: "+platoA.tipo);
		System.out.println("PRECIO: "+platoA.precio);
		System.out.println("DISPONIBILIDAD: "+platoA.disponible);
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+platoB.nombre);
		System.out.println("TIPO: "+platoB.tipo);
		System.out.println("PRECIO: "+platoB.precio);
		System.out.println("DISPONIBILIDAD: "+platoB.disponible);
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+platoC.nombre);
		System.out.println("TIPO: "+platoC.tipo);
		System.out.println("PRECIO: "+platoC.precio);
		System.out.println("DISPONIBILIDAD: "+platoC.disponible);
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
	}

}
