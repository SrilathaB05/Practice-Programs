###1. Find the Missing Number
Input:
 An integer array nums containing n distinct numbers from the range 0 to n-1
(inclusive).
Output:
 The missing number in the array nums.
Example:
Input: nums = [3,0,1]
Output: 2 (Since 2 is missing from the range 0 to 2) 
###

###CODING: 
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner value=new Scanner(System.in);
    System.out.println("Enter the total number ");
    int size=value.nextInt();
    System.out.println("Enter the numbers ");
    int arr[]=new int[size];
    for(int i=0;i<size;arr[i++]=value.nextInt());
   Arrays.sort(arr);
    int diff=arr[1]-arr[0];
    for(int i=0;i<size-1;i++){
      if(arr[i]+diff==arr[i+1]){
        continue;
      }else{
        System.out.println("Missing value : "arr[i]+diff);
      }}}}
