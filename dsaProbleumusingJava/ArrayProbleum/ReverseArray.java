package dsaProbleumusingJava.ArrayProbleum;

import java.util.Scanner;

public class ReverseArray{
    // define the reverse(Parameter) methord
    public void reverse(int[] dup,int start,int end){
        while(start<=end){
            int pointer = dup[start];
            dup[start] = dup[end];
            dup[end] = pointer;
            start++;
            end--;
        }
    }

    // define the display(parameter) methord
    public void display(int[] dup){
        for(int i=0;i<dup.length;i++){
            System.out.print(dup[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner input =  new Scanner(System.in);

        // calling the class Object
        ReverseArray rArray =  new ReverseArray();

        System.out.println("Enter the size of an array:");
        int size =input.nextInt();
        int[] arr =  new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }
        if(size !=0){
            System.out.println("The element present in array is:");
            rArray.display(arr);
            rArray.reverse(arr, 0, size-1);
            System.out.println("The element present in array after reverse:");
            rArray.display(arr);
        }
        else{
            System.out.println("The array is empty");
        }    

        // close the Scanner
        input.close();
        
    }
}