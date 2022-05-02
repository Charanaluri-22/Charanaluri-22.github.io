/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cisco
 */
import java.util.*;
import java.io.*;
public class UnitMatrix 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the size of matrix:");
        n = sc.nextInt();
        int a[][]= new int[n][n];
        System.out.println("The unit matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
    
}
