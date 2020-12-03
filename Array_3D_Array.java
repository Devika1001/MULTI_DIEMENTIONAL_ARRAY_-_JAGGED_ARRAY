package com.BasicOfJava.dev;
import java.util.*;

public class Array_3D_Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[][][] Array=new int[3][3][3];
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
