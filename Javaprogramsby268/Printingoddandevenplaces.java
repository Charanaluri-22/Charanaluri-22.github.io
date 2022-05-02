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
import java.io.*;
public class Printingoddandevenplaces
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of the array:");
        n = sc.nextInt();
        int a[] = new int [n];
        int sum =0;
         for(int i=0;i<n;i++)
        {
            System.out.println("Enter the array elemnt:");
            a[i] = sc.nextInt();    
        }
        System.out.println("The Even position elemnts are:");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.print("The odd position elemnts:");
        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
        
    }
}
