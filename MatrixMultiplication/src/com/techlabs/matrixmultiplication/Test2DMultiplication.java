package com.techlabs.matrixmultiplication;

import java.util.Scanner;

public class Test2DMultiplication {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
int row1=0, column1=0,row2=0,column2=0;
	    

while(true){
    System.out.println("Enter the number of rows of 1st matrix :");
     row1= scanner.nextInt();
     if(row1<=0){
         System.out.println("Number of rows must be a positive integer. Please try again.");
            continue;
        }
        break;
    

     }	    
while(true){
    System.out.println("Enter the number of columns of 1st matrix :");
     column1= scanner.nextInt();
    
    if (column1 <= 0) {
            System.out.println("Number of columns must be a positive integer. Please try again.");
            continue;
        }
        break;
    }
	    
	    int array1[][]=new int[row1][column1];
	    
	    System.out.println("Enter the values 1st Matrix row wise :");
	    
	    for(int i=0;i<row1;i++) {
	      for(int j=0;j<column1;j++) {
	        array1[i][j]=scanner.nextInt();
	      }
	    }
	    
	    
	    while(true){
	        
		    
		    System.out.println("Enter the number of rows of 2nd matrix :");
		     row2= scanner.nextInt();
		      if (row2 <= 0) {
	                System.out.println("Number of rows must be a positive integer. Please try again.");
	                continue;
	            }
	            break;
	        }
	        
	    while(true){
            
	        
		    System.out.println("Enter the number of columns of 2nd matrix :");
		     column2= scanner.nextInt();
		     
		      if (column2 <= 0) {
	                System.out.println("Number of columns must be a positive integer. Please try again.");
	                continue;
	            }
	            break;
	        }	    
	    int array2[][]=new int[row2][column2];
	    System.out.println("Enter the values 2nd Matrix row wise :");
	    for(int i=0;i<row2;i++) {
	      for(int j=0;j<column2;j++) {
	        array2[i][j]=scanner.nextInt();
	      }
	    }
	    
	    
	    if(column1!=row2) {
	      System.out.println("Multiplication is not possible");
	    }
	    else {
	      int productMatrix[][]=new int[row1][column2];
	      
	      for(int i=0;i<row1;i++) {
	        for(int j=0;j<column2;j++) {
	          
	          for(int k=0;k<row2;k++) {
	            productMatrix[i][j] 
	                            += array1[i][k] * array2[k][j]; 
	          }
	          System.out.print(productMatrix[i][j]+" ");
	        }
	        System.out.println();
	        
	      }
	      

	    }
	    
	    scanner.close();

	}

}
