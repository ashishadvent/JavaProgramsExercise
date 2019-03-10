/**
 * 
 */
package com.test;

/**
 * @author akesarwa
 *
 */
public class BubbleSort {
	
	public int[] SortedArrayUsingBubbleSort(int[] arr ) {
		int[] arr1=arr;
		int i,j,temp;
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1])
				{
					temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		return arr1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BubbleSort bubleObj=new BubbleSort();
		 int[] arr2= {34,11,25,67,98,23,12,11,1};
		 
		 bubleObj.SortedArrayUsingBubbleSort(arr2);
         for(int k=0;k<arr2.length;k++) {
        	 System.out.println(arr2[k]);
         }
	}

}
