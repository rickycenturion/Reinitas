package io;

public class Tablero {

	Reina[] reinas;

	public Tablero() {
		this.reinas = null;
	}

	public void resolver() {

		/* PARA QUE LO MUSTRE EN ORDEN
		 * DEBO CAMBIAR LOS r.conflictos[x]
		 * POR r.conflictos[o.numero]
		 */
		
		for (Reina r : this.reinas) {
			for (Reina o : this.reinas) {
				if (r.y == o.y && r.x > o.x) { // ESTA EN LA MISMA COLUMNA PERO
												// EN UNA FILA SUPERIOR
					if ((r.conflictos[0].numero == 0 || r.conflictos[0].x < o.x) && r.numero != o.numero)
						r.conflictos[0] = o;
				}
				if (r.y - o.y == o.x - r.x && r.y - o.y > 0) { // ESTA EN LA DIAGONAL
					// SUPERIOR DERECHA
					if ((r.conflictos[1].numero == 0 || r.conflictos[1].x < o.x) && r.numero != o.numero)
						r.conflictos[1] = o;
				}
				if (r.x == o.x && r.y < o.y) { // ESTA EN LA MISMA
					// FILA PERO MAS A
					// LA IZQUIERDA
					if ((r.conflictos[2].numero == 0 || r.conflictos[2].y > o.y) && r.numero != o.numero)
						r.conflictos[2] = o;
				}
				if (o.y - r.y == o.x - r.x && o.y - r.y > 0) { // ESTA EN LA DIAGONAL
					// INFERIOR DERECHA
					if ((r.conflictos[3].numero == 0 || r.conflictos[3].x > o.x) && r.numero != o.numero)
						r.conflictos[3] = o;
				}
				if (r.y == o.y && r.x < o.x) { // ESTA EN LA MISMA
												// COLUMNA PERO EN
												// UNA FILA INFERIOR
					if ((r.conflictos[4].numero == 0 || r.conflictos[4].x > o.x) && r.numero != o.numero)
						r.conflictos[4] = o;
				}
				if (o.y - r.y == r.x - o.x && o.y - r.y > 0) { // ESTA EN LA DIAGONAL
					// INFERIOR
					// IZQUIERDA
					if ((r.conflictos[5].numero == 0 || r.conflictos[5].x > o.x) && r.numero != o.numero)
						r.conflictos[5] = o;
				}
				if (r.x == o.x && r.y > o.y) { // ESTA EN LA MISMA
												// FILA PERO MAS A
												// LA DERECHA
					if ((r.conflictos[6].numero == 0 || r.conflictos[6].y < o.y) && r.numero != o.numero)
						r.conflictos[6] = o;
				}

				if (r.y - o.y == r.x - o.x && r.y - o.y > 0) { // ESTA EN LA DIAGONAL
												// SUPERIOR
												// IZQUIERDA
					if ((r.conflictos[7].numero == 0 || r.conflictos[7].x < o.x) && r.numero != o.numero)
						r.conflictos[7] = o;
				}
			}
			for (Reina c : r.conflictos) {
				if (c.numero != 0)
					r.cantConflictos++;
			}
		}
	}
}
