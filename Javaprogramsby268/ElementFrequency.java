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
public class ElementFrequency 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enrter the array elemnt:");
            a[i] = sc.nextInt();
        }
    }
    
    
}
