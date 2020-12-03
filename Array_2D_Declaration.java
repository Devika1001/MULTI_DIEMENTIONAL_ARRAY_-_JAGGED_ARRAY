package com.BasicOfJava.dev;
import java.util.*;

public class Array_2D_Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] Array1=new int[2][3] ;
       Scanner scan= new Scanner(System.in);
       for(int i=0;i<Array1.length;++i)  
       {for(int j=0;j<Array1[i].length;++j) 
       {
    	   Array1[i][j]=scan.nextInt();
       }  
       }
       for(int i=0;i<Array1.length;++i)  
       {for(int j=0;j<Array1[i].length;++j) 
       {
    	  System.out.print(Array1[i][j]);
       }  
       }
       //directly assaigning value
       int[][] Array2= {{1,2,3},{1,2,3,4}};
       System.out.println(Array2[0][0]);
       System.out.println(Array2[0][1]);
       System.out.println(Array2[0][2]);
       System.out.println(Array2[1][0]);
       System.out.println(Array2[1][1]);
       System.out.println(Array2[1][2]);
       System.out.println(Array2[1][3]);
       //hand coding method
       int[][] Array3=new int[2][2];
       Array3[0][0]=1;
       Array3[0][1]=2;
       Array3[1][0]=4;
       Array3[1][1]=5; 
       System.out.println(Array3[0][0]);
       System.out.println(Array3[0][1]);
       System.out.println(Array3[1][0]);
       System.out.println(Array3[1][1]); 
	}

}
