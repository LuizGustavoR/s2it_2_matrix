package com.s2it_2;

/**
 * Exercício Matrix
 *
 */
public class Matrix {

	public int diffDiagonal(int[][] mtrx, int n) {
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				if (i == j) {
					somaDiagonalPrincipal += mtrx[i][j];
				}
				if (n - 1 - j == i) {
					somaDiagonalSecundaria += mtrx[i][j];
				}
			}
		}
		return somaDiagonalPrincipal - somaDiagonalSecundaria;
	}

}
