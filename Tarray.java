package com.assignment;
import java.util.Scanner;

public class Tarray {

	
	
		public static void insert(int [][]arr,Scanner in) {
			System.out.println("Inserting the Elements : ");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Adding ["+i+"]["+j+"] element : ");
					arr[i][j]=in.nextInt();
				}
			}
			System.out.println("Inserted the elements Successfully");
		}
		
		public static void display(int [][] arr) {
			System.out.println("Displaying the Elements : ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public static int [][] Add(int [][]A ,int [][]B) {
			
			System.out.println("Adding the Matrices : ");
			int [][]C=new int[A.length][B.length];
			for(int i=0 ; i<A.length;i++) {
				for(int j=0;j<B.length;j++) {
					C[i][j]=A[i][j]+B[i][j];
				}
			}
			return C;
		}

		public static int [][] Sub(int [][]A ,int [][]B) {
			
			System.out.println("Adding the Matrices : ");
			int [][]C=new int[A.length][B.length];
			for(int i=0 ; i<A.length;i++) {
				for(int j=0;j<B.length;j++) {
					C[i][j]=A[i][j]-B[i][j];
				}
			}
			return C;
		}
		
		public static int[][] Mult(int [][]A,int [][]B){
			System.out.println("Multiplication Of Two Matrices : ");
			int [][]C = new int[A.length][B[0].length];
			
			for(int i=0;i<A.length;i++) {
				for(int j=0 ; j<B[0].length;j++) {
					for(int k=0 ; k<A[0].length;k++) {
						C[i][j]+=A[i][k]*B[k][j];
					}
				}
			}
			return C;
		}
		
		public static void transverse(int [][]arr) {
			
			int [][]C =new int[arr.length][arr[0].length];
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					C[i][j]=arr[i][j];
				}
			}
			display(C);
		}
		
			
public static void checking(int [][]arr) {
			
			int [][]C =new int[arr.length][arr[0].length];
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					C[i][j]=arr[i][j];
				}
			}
			
			boolean flag =true;
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(C[i][j]!=arr[j][i]) {
						flag=false;
						System.out.println("Not Symmetric");
						return ;
					}
				}
			}
			System.out.println("Symmetric");
			
		}
		
		
		
		
		
	public static void main(String[] args) {
		/*2. Matrix Operations Assignment:
			Create a Java program that performs various operations on matrices using 2D arrays.
			Tasks:
			a. Implement methods to add, subtract, and multiply two matrices.
			b. Write a method to transpose a matrix.
			c. Implement scalar multiplication of a matrix.
			d. Create a method to check if a matrix is symmetric.
			e. Write a main program to demonstrate these operations by taking input matrices
			from the user.
			f. Display the results of each operation.
			*/
		
		
		Scanner in=new Scanner(System.in);
		
		int row1 , col1 , row2 ,col2 ,choice ;
		System.out.println("Enter the row size MatrixA : ");
		row1=in.nextInt();
		
		System.out.println("Enter the col size MatrixA: ");
		col1=in.nextInt();
		
		System.out.println("Enter the row size MatrixB : ");
		row2=in.nextInt();
		
		System.out.println("Enter the col size MatrixB : ");
		col2=in.nextInt();
		
		int [][] A = new int[row1][col1];
		int [][] B = new int[row2][col2];
		
		insert(A,in);
		insert(B,in);
		
		int [][] C = new int[row1][col2];
		
		do {
			System.out.println("1)Additon of two matrix : ");
			System.out.println("2)Subtraction of two matrix : ");
			System.out.println("3)Multiplication of two matrix : ");
			System.out.println("4)Trans-verse : ");
			System.out.println("5)Matrix is Symmetric : ");
			System.out.println("0)Exiting the Programming ");
			
			System.out.println("\nEnter the choice : ");
			choice=in.nextInt();
			
			switch(choice) {
			
			case 1 : {
				C=Add(A,B);
				display(C);
				break;
			}
			case 2 : {
				C=Sub(A,B);
				display(C);
				break;
			}
			case 3 : {
				C=Mult(A,B);
				display(C);
				break;
			}
			
			case 4 : {
				System.out.println("Transverse Of A : ");
				transverse(A);
				System.out.println("Transverse Of B : ");
				transverse(B);
				break;
			}
			
			case 5 : {
				System.out.println("Matrix is Symmetric or Not");
				System.out.println("Checking A matrix Symmetric : ");	
				checking(A);
				
				System.out.println("Checking B matrix Symmetric : ");
				checking(B);
			
				break;
			}
			
			case 0 : System.out.println("Exiting the program ");
						return ;
			default : System.out.println("Invalid Choice ");
						break;
			
			
			}
			
		}while(choice!=0);
		
		
		
		
		
	}

}
