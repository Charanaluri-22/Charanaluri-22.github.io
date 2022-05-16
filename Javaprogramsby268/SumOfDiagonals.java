/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Charan aluri
 */
import java.util.*;
public class SumOfDiagonals 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int i,j,r,c,dig=0,low=0,upp=0;
    System.out.println("Enter the no of rows:");
    r = sc.nextInt();
    System.out.println("Enter the no of columns:");
    c = sc.nextInt();
    int a[][] = new int [r][c];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            System.out.println("Enter array elements:");
            a[i][j] = sc.nextInt();
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(i==j)
            {
                dig = dig +a[i][j];
            }
            else if (i<j)
            {
                upp = upp +a[i][j];
            }
            else
            {
                low = low +a[i][j];
            }
        }
    }
    System.out.println("The sum of elemnts in diagonal is :"+dig);
    System.out.println("The sum of elemnts in upper Trinagle is:"+upp);
    System.out.println("The sum of elemnts in lower Triangle is:"+low);
    
    }
    
}
