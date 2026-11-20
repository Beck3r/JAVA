package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante rest1 = new Restaurante("EL GRINGO","Av. principal e interseccion",3);
		Restaurante rest2 = new Restaurante("PORTONES","Av. FRANCISCO DE ORELLANA INTERSECCION SAMANES",5);
		
		System.out.println("    ");		
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 1 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+rest1.getNombre());
		System.out.println("DIRECCION: "+rest1.getDireccion());
		System.out.println("CALIFICACION: "+rest1.getCalificacion()+ " ESTRELLAS");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+rest2.getNombre());
		System.out.println("DIRECCION: "+rest2.getDireccion());
		System.out.println("CALIFICACION: "+rest2.getCalificacion()+ " ESTRELLAS");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		
		//rest1.setNombre("EL GRINGO");
		//rest1.setDireccion("Av. principal e interseccion");
		//rest1.setCalificacion(3);
		
		/*System.out.println("    ");		
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 1 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+rest1.getNombre());
		System.out.println("DIRECCION: "+rest1.getDireccion());
		System.out.println("CALIFICACION: "+rest1.getCalificacion()+ " ESTRELLAS");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		
		System.out.println("    ");
		System.out.println("    ");

		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+rest2.getNombre());
		System.out.println("DIRECCION: "+rest2.getDireccion());
		System.out.println("CALIFICACION: "+rest2.getCalificacion()+ " ESTRELLAS");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");
		
		//rest2.setNombre("PORTONES");
		//rest2.setDireccion("Av. FRANCISCO DE ORELLANA INTERSECCION SAMANES");
		//rest2.setCalificacion(5);
		
		System.out.println("*+*+*+*+*+*+*+*+*+*+ RESTAURANTE 2 *+*+*+*+*+*+*+*+*+*+");
		System.out.println("NOMBRE: "+rest2.getNombre());
		System.out.println("DIRECCION: "+rest2.getDireccion());
		System.out.println("CALIFICACION: "+rest2.getCalificacion()+ " ESTRELLAS");
		System.out.println("*+*+*+*+*+*+*+*+*+*+ FIN DE LA INF *+*+*+*+*+*+*+*+*+*+");*/
	}

}
