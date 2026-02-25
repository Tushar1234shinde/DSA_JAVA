package com.assignment01;

public class Array1D {

	// traverse array and print it
	public static void traverseArray(int arr[],int size)
	{
		System.out.println("Array Elements are : ");
		for(int i = 0; i < size; i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}
	
	//Append element at the end of array
	public static void appendElement(int arr[], int element)
	{
		//declared new with size + 1
		int newArray [] = new int [arr.length+1];
		
		for(int i = 0; i<arr.length; i++)
		{
			newArray[i] = arr[i];
		}
		newArray[arr.length] = element;
		
		System.out.println("Array After Appending Element : ");
		for(int i = 0; i< newArray.length; i++)
		{
			System.out.println("\t"+newArray[i]);
		}
	}
	
	//search element in array which comes from main
	public static int searchElement(int arr[], int element)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]==element)
				return i;		
		}
			return -1;
	}

	// sort the array using bubble sort method
	public static void bubbleSort(int arr[]) {
		int temp;
		for(int i = 0; i < arr.length; i++)
	    {
	        for(int j = 0; j < arr.length-1-i; j++)
	        {
	            if(arr[j] > arr[j+1])
	            {
	                temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }

	    System.out.println("\nSorted Array is : ");
	    for(int i = 0; i < arr.length; i++)
	    {
	        System.out.println("\t"+arr[i]);
	    }
	}

	public static void insertElement(int[] arr, int position, int elementToInsert) {
		
		int size = arr.length;
		// Check for the position is valid or not
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid Position!");
        }
		
        //create new array with size
        int  newArray[] = new int[size+1];
        
     // Copy elements into new array which are present before position
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }
        
        // Insert new element at specified position
        newArray[position] = elementToInsert;
        
        // Copy remaining elements which are present after position
        for (int i = position; i < size; i++) {
            newArray[i + 1] = arr[i];
        }
        
        //array after insert element at specified position
        System.out.println("Array after inserting element at position : ");
        for (int i = 0; i < size+1; i++)
        {
        	System.out.println("\t"+newArray[i]);
        }
	}

	public static void deletetElement(int[] arr, int positionToDelete) {
		int size = arr.length;
		// Check for the position is valid or not
        if (positionToDelete < 0 || positionToDelete >= size) {
        		System.out.println("Invalid Position!");
        }
        else{
        // Shift elements to the left
        for (int i = positionToDelete; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //update size of array
        size = size-1;
        }
        //array after deleting element
        System.out.println("Array After deleting element at specific position : ");
        for(int i = 0; i < size; i++)
        {
        	System.out.println("\t"+arr[i]);
        }
	}
}
