package hws.hw1;

import java.util.Scanner;

public class triangle {
	/*
	 * 
	 * Author: Ada Ozarslan 
	 * Date: 10/16/2021
	 * Github:https://github.com/adaozarslan
	 * 
	 * 
	 */
	public static void main(String[] args){
		
	System.out.println("Java triangle ");
		
	//gets int from user
	Scanner scan = new Scanner(System.in); 
	int value = scan.nextInt();
	
	//area of a triangle
	double area = (double)(value*value)/2;
	 
	//make sure its positive
	 if(value>0) {
		
		 //nested for loop for drawing the triangle
		 for (int horizontal=1; horizontal<=value; horizontal++) 
		 {
			 for(int vertical=1; vertical<=horizontal; vertical++) 
			 {
				 
				 System.out.print("*"); 
			 }
			    System.out.println();
		 }
		 
		 //report area
		 System.out.println("Area is "+ area);
		 
	 }else{
		 
		 System.out.println("Provide a positive value"); 
		 
	 }
	 
	}
}