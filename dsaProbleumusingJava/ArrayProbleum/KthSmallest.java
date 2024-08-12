package dsaProbleumusingJava.ArrayProbleum;

import java.util.Scanner;

public class KthSmallest {
    // define the merge(Parameter) methord
    public void merge(int[] dup,int start,int end,int mid){
        int n1 = mid-start+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(dup, start, left, 0, n1);
        System.arraycopy(dup, mid+1, right, 0, n2);
        int i=0;
        int j=0;
        int k=start;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                dup[k] = left[i];
                i++;
            }
            else{
                dup[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            dup[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            dup[k]= right[j];
            j++;
            k++;
        }
    }
    // define the sort() methord
    public void sort(int[] dup,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(dup, start, mid);
            sort(dup, mid+1, end);
            merge(dup, start, end, mid);
        }    
    }

    // define the dispay() methord
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
        KthSmallest kSmallest = new KthSmallest();

        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        System.out.println("Enter the Kth number:");
        int kth = input.nextInt();
        int[] arr =  new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }

        if(size!=0){
            System.out.println("The element present in an array is:");
            kSmallest.display(arr);
            kSmallest.sort(arr, 0, size-1);
            System.out.println("The element present in an array after sorting:");
            kSmallest.display(arr);
            if(kth<size){
                System.out.println("The element present in an array at "+kth+" smallest is: "+arr[kth-1]);
            }
            else{
                System.out.println("Index out of bound Exception");
            }    
        }
        else{
            System.out.println("The array is empty");
        }

        // close the Scanner
        input.close();
    }
}
