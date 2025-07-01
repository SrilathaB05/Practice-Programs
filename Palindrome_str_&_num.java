'''
Valid Palindrome String
Example:
Input: "racecar"
Output: True
Input: "hello"
Output: False
Valid Palindrome Number
Example:
Input: 12321
Output: True
Input: 596
Output: False
'''

#CODING:
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner value=new Scanner(System.in);
        String ini_str=value.next();
        String str=ini_str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
         System.out.println();
        System.out.println("Enter the Number: ");
        int num=value.nextInt();
        int n=num,revs=0,digit;
        while(n!=0){
            digit=n%10;
            revs=(revs*10)+digit;
            n/=10;
        }
        if(num==revs){
            System.out.println("True");
        }else{
            System.out.println("False");
        }}
    }
