package claseAlumno;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		int Array[] =new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("Introduce num: ");
			int num=sc.nextInt();
			Array[i]=num;
		}
		for(int k=0;k<Array.length;k++) {
			System.out.println(Array[k] + " ");
		}
	}

}
