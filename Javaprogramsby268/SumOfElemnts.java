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
public class SumOfElemnts 
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
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
        System.out.printf("The sum of the elemnts in the array is %d ",sum);
    }
    
}
