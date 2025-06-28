'''
Input:
 An integer array nums
Output:
 The length of the longest consecutive sequence present in the array nums.
Example:
Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4 (Explanation: The longest consecutive sequence is [1, 2, 3, 4].)
  
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
   Arrays.sort(arr);
   int count=0;
   int j=0;
    int diff=arr[1]-arr[0];
    for(int i=0;i<size-1;i++){
      if(j==0){
          if(arr[i]+diff==arr[i+1]){
             count++;
          }else{
             j++;
          }
      }
    }
      System.out.println(count+1);
  }}
