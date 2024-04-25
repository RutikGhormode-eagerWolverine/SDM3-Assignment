package com.assignment;

import java.util.Scanner;

public class OneArray {

	public static void insert(int[] arr, Scanner in) {
		System.out.println("Inserting the element : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the [" + (i + 1) + "] element : ");
			arr[i] = in.nextInt();
		}
		System.out.println("Added Element Successfully");
	}

	public static void display(int[] arr) {
		System.out.println("Displaying the element : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nDisplayed Element Successfully");
	}

	public static void sum(int[] arr) {
		int sum = 0;
		System.out.println("Suming the Element of Array");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\nSum of element are : " + sum);
	}

	public static void average(int[] arr) {
		int sum = 0;
		System.out.println("Suming the Element of Array");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		float avg = (float) sum / arr.length;
		System.out.println("\nSum of element are : " + avg);
	}

	public static void sort(int[] arr) {
		System.out.println("Sorting The Element ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		display(arr);

	}
	
	public static void maxi(int []arr) {
		System.out.printf("\nCalculating Maximum");
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum of Array : "+max);
	}
	

	public static void main(String[] args) {
		/*
		 * 1. Array Assignments: Create a Java program that performs various operations
		 * on arrays, such as finding the maximum element, calculating the sum and
		 * average, and sorting the elements in ascending order. Tasks: 
		 * a. Implement a
		 * method to find the maximum element in an array. b. Implement a method to
		 * calculate the sum of all elements in an array. c. Implement a method to
		 * calculate the average of all elements in an array. d. Implement a method to
		 * sort the elements of an array in ascending order using any sorting algorithm
		 * of your choice (e.g., bubble sort, selection sort). e. Write a main program
		 * to demonstrate these operations: f. Create an array of integers and
		 * initialize it with some values. g. Call the methods implemented in steps 1 to
		 * 4 to perform the respective operations. h. Display the results of each
		 * operation
		 */

		int n, choice;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of Array : ");
		n = in.nextInt();

		int[] arr = new int[n];

		do {
			System.out.println("1)Insertion of Element ");
			System.out.println("2)Displaying of Element ");
			System.out.println("3)Sum of all elements ");
			System.out.println("4)Average of Array");
			System.out.println("5)Sorting the Array");
			System.out.println("6)Maximum the Array");
			System.out.println("0)Exit the Program");

			System.out.print("\nEnter your choice : ");
			choice = in.nextInt();

			switch (choice) {
			case 1: {
				//Scanner(Class) in(bj)
				insert(arr, in);
				break;
			}
			case 2: {
				display(arr);
				break;
			}
			case 3: {
				sum(arr);
				break;
			}
			case 4: {
				average(arr);
				break;
			}
			case 5: {
				sort(arr);
				break;
			}
			case 6 : {
				maxi(arr);
				break;
			}
			
			case 0:
				System.out.println("Exiting the matrix ");
				return;

			default:
				System.out.println("Invalid Choice ");
				break;
			}
		} while (choice != 0);

	}

}
