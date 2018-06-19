package ejercontrolversiones;

import java.util.HashSet;
import java.util.Set;

public class Clase {
	public static void main(String[] args) {
		
		//创建一个类型集的集合
		Set coleccion= new HashSet();
		coleccion.add("peli1");
		coleccion.add("peli2");
		coleccion.add("peli3");
		coleccion.add("peli4");
		coleccion.add("peli5");
		coleccion.add("peli3");//重复的不加
		
		for (Object elemento : coleccion) {
			System.out.println(elemento);
		}
		
	}	
	
}
