/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package javaweek3by268;

/**
 *
 * @author cisco
 */
 import java.util.*;
public class DoubleDimArray 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,r,c;
        System.out.println("Enter the no of rows:");
        r = sc.nextInt();
        System.out.println("Enter the no of columns:");
        c = sc.nextInt();
        int a[][] = new int [r][c];
        for(i=0;i<r;i++)
        {
             for(j=0;j<c;j++)
            {
                System.out.println("Enter the array elements:");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Array elemnts are:");
        for(i=0;i<r;i++)
        {
           for(j=0;j<c;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.print("\n");
        }
        System.out.println("The array elemnts in reverse order is:");
        for(i=r-1;i>=0;i--)
        {
           for(j=c-1;j>=0;j--)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.print("\n");
        }
    }
    
}
