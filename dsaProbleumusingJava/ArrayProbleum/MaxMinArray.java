package dsaProbleumusingJava.ArrayProbleum;

import java.util.Scanner;

public class MaxMinArray {
    // define the maxElement() methord
    public void max(int[] dup){
        int max = dup[0];
        for(int i=1;i<dup.length;i++){
            if(dup[i]>max){
                max =dup[i];
            }
        }
        System.out.println("The max element present in array is: "+max);
    }

    // define the minElement() methord
    public void min(int[] dup){
        int min = dup[0];
        for(int i=1;i<dup.length;i++){
            if(dup[i]<min){
                min = dup[i];
            }
        }
        System.out.println("The min element present in array is: "+min);
    }

    // define the display() methord
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner input =  new Scanner(System.in);
        // calling the class Object
        MaxMinArray maxMinArray = new MaxMinArray();

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index: "+i);
            int data =input.nextInt();
            arr[i] = data;
        }
        if(size!=0){
            System.out.println("The element present in an array is:");
            maxMinArray.display(arr);
            maxMinArray.max(arr);
            maxMinArray.min(arr);
        }
        else{
            System.out.println("The array is empty");
        }

        // close the Scanner
        input.close();

    }
}
