package dsaProbleumusingJava.ArrayProbleum;

import java.util.Scanner;

public class Sorted012 {
    // define the sort(Parameter) methord
    public void sort(int[] dup){
        for(int i=0;i<dup.length;i++){
            for(int j=i+1;j<dup.length;j++){
                if(dup[i]>dup[j]){
                    int pointer = dup[i];
                    dup[i] = dup[j];
                    dup[j] = pointer;
                }
            }
        }
    }

    // define the display() methord
    public void display(int[] dup){
        for(int i=0;i<dup.length;i++){
            System.out.print(dup[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // calling the Scanner
       Scanner input =  new Scanner(System.in);
       // calling the Object
       Sorted012 sorted012=  new Sorted012(); 
       System.out.println("Enter the size of an array:");
       int size = input.nextInt();

       int[] arr =  new int[size];
       for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data at index: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }
        if(size!=0){
            System.out.println("The element present in an array is:");
            sorted012.display(arr);
            sorted012.sort(arr);
            System.out.println("The element present in an array after sorting: ");
            sorted012.display(arr);
        }
        else{
            System.out.println("The array is empty");
        }

        // close the Scanner
        input.close();
    }
}
