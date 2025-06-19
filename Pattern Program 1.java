'''
Pattern Programs:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

'''

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner value=new Scanner(System.in);
		int num=value.nextInt();
		int j,k=1,l=0;
		for(int i=1;i<num;i++){
		    if(num%i==0){
		        l=i;
		    }}
		for(int i=1;i<=l;i++){
		    for(j=1;j<=i;j++){
		        System.out.print(k+" ");
		        k++;
		    }
		    System.out.println();
		}}}
