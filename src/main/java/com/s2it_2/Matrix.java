package com.s2it_2;

/**
 * Exercício Matrix
 *
 */
public class Matrix {

	public int diffDiagonal(int[][] mtrx, int n) {
		return somaDiagPrincipal(mtrx) - somaDiagSecundaria(mtrx, n);
	}

	private int somaDiagPrincipal(int mtrx[][]) {
		int somaDiagonal = 0;
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				if (i == j) {
					somaDiagonal += mtrx[i][j];
				}
			}
		}
		return somaDiagonal;
	}

	private int somaDiagSecundaria(int mtrx[][], int n) {
		int somaDiagonal = 0;
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				if (n - 1 - j == i) {
					somaDiagonal += mtrx[i][j];
				}
			}
		}
		return somaDiagonal;
	}

}
