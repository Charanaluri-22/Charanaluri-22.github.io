/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek3by268;

/**
 *
 * @author cisco
 */
import java.util.*;
public class MatrixArthimetic 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,k,r1,c1,r2,c2,r3,c3;
        System.out.println("Enter the size of first array size:");
        System.out.print("Enter no of rows in first matrix:");
        r1 = sc.nextInt();
        System.out.print("Enter no of columns in first matrix:");
        c1 = sc.nextInt();
        System.out.print("Enter no of rows in second matrix:");
        r2 = sc.nextInt();
        System.out.print("Enter no of columns in second matrix:");
        c2 = sc.nextInt();
        int a[][] = new int [r1][c1];
        int b[][] = new int [r2][c2];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println("Enter is ist matrix elemnt:");
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println("Enter is ist matrix elemnt:");
                a[i][j] = sc.nextInt();
            }
        }
        
        
        while(true)
        {
            int choice;
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    
            }
        }
        
    }
}
