package com.BasicOfJava.dev;
import java .util.*;

public class Array_2D_JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hand coded
		int[][] Array1=new int[2][];
	      Array1[0]=new int[2];
	      Array1[1]=new int[4];
	      Array1[0][0]=1;
	      Array1[0][1]=2;
	      Array1[1][0]=3;
	      Array1[1][1]=4;
	      Array1[1][2]=5;
	      Array1[1][3]=6;
	      System.out.print(Array1[0][0]);
	      System.out.print(Array1[0][1]);
	      System.out.println();
	      System.out.print(Array1[1][0]);
	      System.out.print(Array1[1][1]);
	      System.out.print(Array1[1][2]);
	      System.out.println(Array1[1][3]);
      //treditonal method
      int[][] Array2=new int[2][];
      Array2[0]=new int[2];
      Array2[1]=new int[4];
      Scanner scan = new Scanner(System.in);
      for(int i=0;i<Array2.length;++i)
      {
    	  for(int j=0;j<Array2[i].length;++j)
    	  {
    		  Array2[i][j]=scan.nextInt();
    	  }
      }
      for(int i=0;i<Array2.length;++i)
      {
    	  for(int j=0;j<Array2[i].length;++j)
    	  {
    		  System.out.print(Array2[i][j]+" ");
    	  }System.out.println();
      }
     
	}

}
