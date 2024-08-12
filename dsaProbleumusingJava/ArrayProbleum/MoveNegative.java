package dsaProbleumusingJava.ArrayProbleum;

import java.util.Scanner;

public class MoveNegative {
    public void sort(int[] dup){
        int i=0;
        int j=dup.length-1;
        while(i<j){
            if(dup[i]<=0){
                i++;
            }
            else{
                int pointer =dup[i];
                dup[i] = dup[j];
                dup[j] = pointer;
                j--;
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
        Scanner input = new Scanner(System.in);
        // calling the class Object
        MoveNegative mNegative = new MoveNegative();
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();

        int[] arr =  new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }
        if(size!=0){
            System.out.println("The element present in an array is:");
            mNegative.display(arr);
            mNegative.sort(arr);
            System.out.println("The element present in an array after sorting:");
            mNegative.display(arr);
        }
        else{
            System.out.println("The array is empty");
        } 
        
        // close the Scanner
        input.close();
    }
}
