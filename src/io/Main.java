package io;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		 Tablero tab = Archivo.leerArchivo("C:/Users/Agust/workspace/ConflictosEntreReinas/reinas.in");
		 tab.resolver();
		 Archivo.escribirArchivo(tab.reinas, "C:\\Users\\Agust\\workspace\\ConflictosEntreReinas\\reinas.out");
	}
	
}
