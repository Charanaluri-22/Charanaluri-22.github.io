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
public class LargestElement
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the array elemnt");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the array elemnt:");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t = a[j];
                    a[j+1] = a[j];
                    a[j+1] = t;
                }
            }
        }
        System.out.printf("The largest element int the array is %d",a[n-1]);
    }
    
}
