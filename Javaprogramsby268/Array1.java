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
public class Array1 
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        int b[] = a;
        System.out.print("The first array eleemnts are:\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        System.out.print("\nThe copied array elemnts are:\n");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
         
        
    }
    
}
