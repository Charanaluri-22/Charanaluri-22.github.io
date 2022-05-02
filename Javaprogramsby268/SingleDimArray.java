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
public class SingleDimArray 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int i,n;
    int a[] = new int [5];
    System.out.print("Enter the size of array");
    n = sc.nextInt();
    for(i=0;i<n;i++)
    {
        System.out.print("Enter array Element:");
        a[i] = sc.nextInt();
    }
    System.out.println("The array elemnts are:");
    for(i=0;i<n;i++)
    {
        System.out.print(a[i]);
    }
    System.out.println("\nThe elements of array in reverse order");
    for(i=n-1;i>=0;i--)
    {
        System.out.print(a[i]);
    }
    }
    
    
    
}
