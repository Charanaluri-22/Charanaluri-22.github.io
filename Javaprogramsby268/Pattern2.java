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
public class Pattern2 
{
    public static void main(String args[])
    {
        int i,j;
        int a[][] = new int [4][];
        a[0] = new int [1];
        a[1] = new int [2];
        a[2] = new int [3];
        a[3] = new int [4];
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
               a[i][j] = j+1; 
            }
        }
        System.out.println("Pattern 2");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
