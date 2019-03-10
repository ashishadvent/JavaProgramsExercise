/**
 * 
 */
package com.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ashish
 *
 */
public class January {
	/*public String[] arr1=null;
	
	 public January(String[] arr1) {
		 this.arr1=arr1;
	 }*/
	public List<String> arrToList(String[] arr1){
		 String[] str=arr1;
		 List<String> list=new LinkedList<String>(); 
		 
		 for(int i=0;i<str.length-1;i++)
		 {
			 int j=i+1;
			 int k=j;
			 while(k<str.length ) {
				 if(str[i]!=str[j]) 
					 j++;
				 k++;
				 }
			 if(j==i+str.length-1) 
				 list.add(str[i]);
			 
			 
		 } 
		
		return list;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  January jan=new January();
		  
		  String[] arr2= {"abc","bcd","abc","def"};
		  
		  List<String> lt=new LinkedList<String>();
		  lt=jan.arrToList(arr2);
		  System.out.print(arr2);
		  for(int l=0;l<lt.size();l++){
			    System.out.println(lt.get(l));
			} 
		  
	}

}
