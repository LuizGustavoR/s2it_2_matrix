package com.s2it_2;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for diff diagonal.
 */
public class DiffDiagonalTest extends TestCase {

	private int N = 4;
	
	@Test
	public void testDiffDiagonal1() {

		System.out.println("Execício Matrix: testDiffDiagonal1");
		
		int[][] mtrx = new int[][] {
			{ 1, 5, 3, 2 },
			{ 4, 8, -5, 6 },
			{ 7, 3, 4, 5 },
			{ 2, 5, 9, -9 }
		};
		printMatrix(mtrx);
		
		int expectedValue = 2;
		int resultValue = new Matrix().diffDiagonal(mtrx, N);
		
		System.out.println("\nDiferença entre as somas das diagonais da matriz:");
		System.out.println("Esperado: " + expectedValue);
		System.out.println("Resultado do método: " + resultValue + "\n");

		assertEquals(expectedValue, resultValue);
	}
	
	@Test
	public void testDiffDiagonal2() {
		
		System.out.println("Execício Matrix: testDiffDiagonal2");
		
		int[][] mtrx = new int[][] {
			{ 1, 5, 3, 5 },
			{ 4, -8, -15, 6 },
			{ 7, -32, 41, 5 },
			{ 12, 5, 9, -19 }
		};
		printMatrix(mtrx);
		
		int expectedValue = 45;
		int resultValue = new Matrix().diffDiagonal(mtrx, N);

		System.out.println("\nDiferença entre as somas das diagonais da matriz:");
		System.out.println("Esperado: " + expectedValue);
		System.out.println("Resultado do método: " + resultValue + "\n");

		assertEquals(expectedValue, resultValue);
	}
	
	private void printMatrix(int[][] mtrx) {
		System.out.print("Matriz:");
		for (int i = 0; i < mtrx.length; i++) {
			System.out.print("\n");
			System.out.print("{");
			for (int j = 0; j < mtrx.length; j++) {
				System.out.print(mtrx[i][j] + " ");
			}
			System.out.print("}");
		}
	}

}