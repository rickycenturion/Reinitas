package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Archivo {
	
	public static Tablero leerArchivo (String path) throws FileNotFoundException {
		
		FileReader fr = new FileReader(path);
		Scanner sc = new Scanner(fr);
		Tablero tab = new Tablero();
		sc.nextInt();
		int n = sc.nextInt(), i, j;
		tab.reinas = new Reina[n];
		for (i = 0; i < n; i++) {
			tab.reinas[i] = new Reina(i + 1, sc.nextInt(), sc.nextInt());
			tab.reinas[i].conflictos = new Reina[n];
			for (j = 0; j < n; j++) {
				tab.reinas[i].conflictos[j] = new Reina();
			}
		}
		sc.close();		
		return tab;
	}
	
	public static void escribirArchivo(Reina[] vec, String path) throws IOException {

		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		int n = vec.length;
		for (int i = 0; i < n; i++) {
			pw.print(vec[i].cantConflictos + " ");
			if (vec[i].cantConflictos != 0)
				Arrays.sort(vec[i].conflictos);
				for (Reina c : vec[i].conflictos) {
					if (c.numero != 0)
						pw.print(c.numero + " ");
				}
			pw.println();
		}
		pw.close();
		
	}

}
