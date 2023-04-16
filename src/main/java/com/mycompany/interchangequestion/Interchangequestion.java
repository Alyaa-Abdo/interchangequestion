/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interchangequestion;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class Interchangequestion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);   
          int r,c;
          boolean x = true;
     
        System.out.print("Enter the size of rows : ");
            r=input.nextInt();
        System.out.print("Enter the size of colums : ");  
            c=input.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the Elements of Matrix ");
        for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              System.out.print("Enter the Element of index ("+i+")("+j+") : ");
              arr[i][j]=input.nextInt();
          }
       }
        System.out.println("Your Matrix is : ");
        
         for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              System.out.print(arr[i][j]+" ");
          }
             System.out.println();
       }
       while(x){
            System.out.println("Enter 1 To interchange Rows");
            System.out.println("Enter 2 To interchange coloumns");
            System.out.println("Enter 3 To Exit");
              int y = input.nextInt();
        switch(y){
            case 1:
                System.out.println("Enter The Numbers Of Rows You Want To Interchange :");
                    int r1 = input.nextInt();
                    int r2 = input.nextInt();
                while(r1>=r || r2>=r){
                    System.out.println("Invalid Number,Try Again");
                    System.out.println("Enter The Numbers Of Rows You Want To Interchange :");
                     r1 = input.nextInt();
                     r2 = input.nextInt();}
                    for(int i=0;i<c;i++){
                        int z = arr[r1][i];
                        arr[r1][i] = arr[r2][i];
                        arr[r2][i] = z;}
                System.out.println("Your Matrix After Interchanged.");
                    for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                            System.out.print(arr[i][j]+" ");}
                    System.out.println();}
                break;
            case 2:      
                System.out.println("Enter The Numbers Of coloumns You Want To Interchange :");
                    int c1 = input.nextInt();
                    int c2 = input.nextInt();
                while(c1>=c || c2>=c){ 
                    System.out.println("Invalid Number.");
                    System.out.println("Enter The Numbers Of coloumns You Want To Interchange :");
                        c1 = input.nextInt();
                        c2 = input.nextInt(); }   
                    for(int i=0;i<r;i++){
                        int z = arr[i][c2];
                        arr[i][c2] = arr[i][c1];
                        arr[i][c1] = z;}
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(arr[i][j]+" ");}
                    System.out.println();}
                break;
            case 3:
                x=false;
                 break;
            default:
                System.out.println("Invalid Number.");
        }      
       }  
    }
}
 
