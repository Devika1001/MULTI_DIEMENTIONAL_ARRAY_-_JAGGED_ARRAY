package com.BasicOfJava.dev;
import java.util.*;

public class Array_1D_Declaration_Intialaisation
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//asiagning direct value to array.
       int[] Array1= {10,20,30};
       System.out.println(Array1[0]);
       System.out.println(Array1[1]);
       System.out.println(Array1[2]);
       int[] Array2=new int[5];
      //hand coding method
       Array2[0]=100;
       Array2[1]=200;
       Array2[2]=300;
       Array2[3]=400;
       Array2[4]=500;
       System.out.println(Array2[0]);
       System.out.println(Array2[1]);
       System.out.println(Array2[2]);
       System.out.println(Array2[3]);
       System.out.println(Array2[4]);
       //traditional method
       Scanner scan=new Scanner(System.in);
       int[] Array3=new int[5];
      
       for(int i=0;i<5;++i) {
       Array3[i]=scan.nextInt();
       System.out.println(Array3[i]);
      } 
	}
}