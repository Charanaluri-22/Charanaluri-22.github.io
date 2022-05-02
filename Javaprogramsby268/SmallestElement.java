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
public class SmallestElement 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the array elemnt:");
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            } 
        }
        System.out.printf("The smallest elemnt int the array is %d",min);
    }
    
}
