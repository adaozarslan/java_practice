package hws.hw1;

public class chain {
	/*
	 * 
	 * Author: Ada Ozarslan 
	 * Date: 10/16/2021
	 * Github:https://github.com/adaozarslan
	 * 
	 * 
	 */
	public static void main (String [] args) {
		
		
		
		if (args.length == 3) 
		{
			
			
			// get 3 doubles
			double[] input = new double[args.length];
			for (int i = 0; i < args.length; i++)
			{
				input[i] = Double.parseDouble(args[i]);
			}
			
			//create an array of 10
			double [] chain = new double [11];
			
			//add 3 given values
			chain[0]=input[0];
			chain[1]=input[1];
			chain[2]=input[2];
			
			// next num is sum of index-1,index-2,index-3
			for(int j=3;j<=10;j++ ) 
			{
				chain[j]=(chain[j-1]+chain[j-2]+chain[j-3]);
			}
			
			//print array
			for(int num=0; num<10; num++) 
				
			{
				
			//report
			System.out.println(chain[num]);
			
			}
			
		}else {
			System.out.println("There has to be exactly three numbers");
		}
		
	
	}
}
