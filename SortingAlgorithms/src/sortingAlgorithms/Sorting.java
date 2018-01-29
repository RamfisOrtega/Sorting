package sortingAlgorithms;

import java.util.Arrays;
import java.util.Vector;

public class Sorting {
	
	static int[] test_array = {7,4,1,8,5,2,3,6};//value to be sorted

	//Bubble sort method
	public static int[] bubbleSorting(int[] arr){
		int[] num = arr;
		for(int i=arr.length;i>0;i--){
			for(int j=1;j<i;j++){
				if(num[j]<num[j-1]){
					int temp = num[j];
					num[j]= num[j-1];
					num[j-1] = temp;
				}
			}
		}
		return num;
		
	}//end of the bubble sort method
	
	//Bucket sort method
	public static int[] bucketSort(int[] arr){
		int[] num = arr;
		
		int length=	num.length;
		double num_bucket=Math.sqrt(length);
		num_bucket = (int)num_bucket;
		
	    for(int i = 0; i < num_bucket; ++i){
	    	++num[arr[i]];
	    }
		return num;
	}//end of the bucketSort method
	
	//Selection sort method
	public static int[] selectionSort(int[] arr){
		int[] num = arr;
		for(int i=0;i<arr.length;i++){
			int min= i;
			for(int j = i+1;j<arr.length;j++){
				if(num[j]<num[min]){
					int temp = num[j];
					num[j]=num[min];
					num[min]=temp;
				}
			}
		}
		
		return num;
	}//end of the selection sort method
	
	//Insertion sort method
	public static int[] insertionSort(int[] arr){
		int[] num = arr;
		for(int i=1;i<arr.length;i++){
			int j= i;
			while(j>0 && num[j-1]>num[j]){
				int temp = num[j];
				num[j] = num[j-1];
				num[j-1] = temp;
				j--;
			}
		}
		return num;
		
	}//end of the insertion sort method
	
	//Constructor
	public Sorting() {
		// TODO Auto-generated constructor stub
	}//end of constructor
	
	//Main method
	public static void main(String[] args) {
		
		System.out.println("The Array to be sorted is : "+ Arrays.toString(test_array)+" and has a length of: " 
							+ test_array.length);
		System.out.println("The Sorted Array using insertion sort method is : "+ Arrays.toString(insertionSort(test_array)));
		System.out.println("The Sorted Array using selection sort method is : "+ Arrays.toString(selectionSort(test_array)));
		System.out.println("The Sorted Array using bubble sort method is : "+ Arrays.toString(bubbleSorting(test_array)));

	}//end of the main method

}
