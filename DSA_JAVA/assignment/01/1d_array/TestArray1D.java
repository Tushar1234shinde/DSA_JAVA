package com.assignment01;

import java.util.Scanner;

public class TestArray1D {

	public static void main(String[] args) {
		int size; 
		// scanner class object to accept input
		Scanner input = new Scanner(System.in); 
		
		// accept size of array
		System.out.println("Enter the size of Array : ");
		size = input.nextInt();
		
//		declare array
		int arr[];
		arr = new int[size];
			
		// accept array elements based on size
		System.out.println("Enter "+size+" Elements for array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
// Task 1
		//passed array and size to a function for traversing
	//	Array1D.traverseArray(arr,size);

// Task 2
//		accept element to append at the end of array
//		System.out.println("Enter Element to Append : ");
//		int element = input.nextInt();
	//	Array1D.appendElement(arr, element);
		
// Task 3
		// accept element and pass it function and if it is found or not
//		System.out.println("Enter Element to Search in an Array : ");
//		int searchElement = input.nextInt();
//		int result = Array1D.searchElement(arr, searchElement);
//		
//		if(result>=1)
//			System.out.println("Element Found at index "+result);
//		else 
//			System.out.println("Invalid index...");
		
// Task 4
//		Sort the array using bubble sort 
//		Array1D.bubbleSort(arr);
		
//Task 5
		//insert Element into an array at passed position
//		System.out.println("At Which position you want to insert an Element : ");
//		int position = input.nextInt();
//		System.out.println("Enter Element to Insert : ");
//		int elementToInsert = input.nextInt();
//		
//		Array1D.insertElement(arr, position,elementToInsert);
		
		
//Task 6
		//delete Element into an array at passed position
		System.out.println("From Which position you want to Delete an Element : ");
		int positionToDelete = input.nextInt();
		
		Array1D.deletetElement(arr, positionToDelete);
	}

}
