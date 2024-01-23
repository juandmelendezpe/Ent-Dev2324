package UT3.Entorno_Git;

import java.util.Random;

public class Arrays_Randon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int [5][5];
		Random r = new Random();
		
		for(int i=0;i< mat.length;i++) {
			for(int j =0;j<mat.length;j++) {
				mat[i][j]=r.nextInt(10);
				
				System.out.print( mat[i][j]+" ");
			}
			System.out.println();
		}

	}
}
