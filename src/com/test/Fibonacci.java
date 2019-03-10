/**
 * 
 */
package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author akesarwa
 *
 */
public class Fibonacci {

	 int n;
	 Map<Integer,Integer> fibonacci = new HashMap<Integer,Integer>();
	 
	public void printFibonacciSeriesUsingVariablesAndForLoop(int n) {
		
		int i,j,k,l;
		i=0;
		j=1;
		System.out.println(i);
		System.out.println(j);
		
		for(l=1;l<n-1;l++) {
			 k=i+j;
			 i=j;
			 j=k;
			System.out.println(j);
		}
	}
	public void printFibonacciUsingRecursion1(int n) {
		int i1; 
		for(i1=0;i1<n;i1++) {
			System.out.println(getFibonacciNumber_usingMemoization(i1));
		}
	}
		
	
	
	private int getFibonacciNumber(int i1) {
		// TODO Auto-generated method stub
		if(i1==0 || i1==1) {
			return i1;
		}
		else {
			return (getFibonacciNumber(i1-1)+getFibonacciNumber(i1-2));	
		}
	}
		
	private int getFibonacciNumber_usingMemoization(int i1)
	{
		if(i1==0 || i1==1) {
			return i1; 
	}
		if(this.fibonacci.containsKey(i1)) {
			return fibonacci.get(i1);
		}
		int result =getFibonacciNumber_usingMemoization(i1-1)+getFibonacciNumber_usingMemoization(i1-2);
		this.fibonacci.put(i1, result);
		return result;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter how many fibonacci numbers have be printed on the console");
		 int n=sc.nextInt();
		 Fibonacci f=new Fibonacci();
		 System.out.println("printFibonacciSeriesUsingVariablesAndForLoop -> fibonacci numbers printed on the console");
		 f.printFibonacciSeriesUsingVariablesAndForLoop(n);
		 System.out.println("printFibonacciUsingRecursion1 -> fibonacci numbers printed on the console");
		 f.printFibonacciUsingRecursion1(n);
	}

}
