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
public class JaggedArray 
{
   public static void main (String args[])
   {
       Scanner sc = new Scanner(System.in);
       int i,j;
       int a[][] = new int [3][];
       a[0] = new int [1];
       a[1] = new int[2];
       a[2] = new int[3];
       for(i=0;i<a.length;i++)
       {
           for(j=0;j<a[i].length;j++)
           {
               System.out.println("Enter the array elemnts:");
               a[i][j] = sc.nextInt();
           }
       }
       System.out.println("The array elements are:");
       for(i=0;i<a.length;i++)
       {
           for(j=0;j<a[i].length;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.print("\n");
       }
       System.out.println("The elemnts in revrse order:");
       for(i=a.length-1;i>=0;i--)
       {
           for(j=a[i].length-1;j>=0;j--)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.print("\n");
       }
   }
}
