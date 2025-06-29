'''
Input:
 An integer array nums
 An integer k representing the kth largest element
Output:
 The kth largest element in the array nums.
Example:
Input:
 nums = [5,3,1,6,2]
 k = 3
Output: 3 (The third largest element is 3.)
'''


  
#CODING: 
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner value=new Scanner(System.in);
    System.out.println("Enter the total number ");
    int size=value.nextInt();
    System.out.println("Enter the numbers ");
    int arr[]=new int[size];
    for(int i=0;i<size;arr[i++]=value.nextInt());
   System.out.println("Enter the number: ");
   int num=value.nextInt();
    int k_th=size-num;
    for(int i=0;i<size;i++){
        if(k_th==i){
            System.out.print(arr[i]);
        }}}}
