package com.BasicOfJava.dev;
import java.util.*;

public class Array_3D_Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[][][] Array=new int[4][][];
          Array[0]=new int[2][];
          Array[1]=new int[3][];
          Array[2]=new int[6][];
          Array[3]=new int[5][];
          
          Array[0][0]=new int[3];
          Array[0][1]=new int[4];
          
          Array[1][0]=new int[1];
          Array[1][1]=new int[2];
          Array[1][2]=new int[3];
          
          Array[2][0]=new int[1];
          Array[2][1]=new int[3];
          Array[2][2]=new int[2];
          Array[2][3]=new int[5];
          Array[2][4]=new int[6];
          Array[2][5]=new int[4];
          
          Array[3][0]=new int[2];
          Array[3][1]=new int[4];
          Array[3][2]=new int[6];
          Array[3][3]=new int[3];
          Array[3][4]=new int[1];
          
          for(int i=0;i<=Array.length-1;++i)
  		{
  			for(int j=0;j<=Array[i].length-1;++j)
  			{
  				for(int k=0;k<=Array[i][j].length-1;++k)
  				{
  					Array[i][j][k]=scan.nextInt();
  				}
  				
  			}
  		}
  		for(int i=0;i<=Array.length-1;++i)
  		{
  			for(int j=0;j<=Array[i].length-1;++j)
  			{
  				for(int k=0;k<=Array[i][j].length-1;++k)
  				{
  					System.out.print(Array[i][j][k]+" ");
  				}System.out.println();
  				
  			}System.out.println();
  		}
  		

  	}
	}


