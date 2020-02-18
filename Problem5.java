//https://javahungry.blogspot.com/2019/02/different-star-pattern-program-in-java.html (Problem number 5)

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;
import java.util.Scanner;

/**
 *
 * @author DAVE
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("ENTER A VALUE");
       int rows=sc.nextInt();
       for (int i=0;i<rows;i++)
       {
           for(int j=rows;j>=i;j--)
           {
               System.out.print(" ");
           }
           for (int k=0;k<=i;k++)
           {
               System.out.print(" *");
           }
           System.out.println();
       }
    }
    
}
